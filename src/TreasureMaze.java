import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class TreasureMaze {
  static class Point {
    int x, y;
    Set<Point> collected;
    String path;

    Point(int x, int y, Set<Point> collected, String path) {
      this.x = x;
      this.y = y;
      this.collected = new HashSet<>(collected);
      this.path = path;
    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + x;
      result = prime * result + y;
      result = prime * result + ((collected == null) ? 0 : collected.hashCode());
      return result;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Point other = (Point) obj;
      if (x != other.x)
        return false;
      if (y != other.y)
        return false;
      if (collected == null) {
        if (other.collected != null)
          return false;
      } else if (!collected.equals(other.collected))
        return false;
      return true;
    }
  }

  static int[] dx = {1, -1, 0, 0};
  static int[] dy = {0, 0, 1, -1};

  static char[] directions = {'D', 'U', 'R', 'L'};

  public static String findPath(char[][] maze) {
    int N = maze.length;
    int M = maze[0].length;

    Point start = new Point(0, 0, new HashSet<>(), "");
    ArrayList<Point> treasures = new ArrayList<>();
    Set<Point> allTreasures = new HashSet<>();
    Point exit = new Point(N - 1, M - 1, new HashSet<>(), "");

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if (maze[i][j] == 'S') {
          treasures.add(new Point(i, j, new HashSet<>(), ""));
          allTreasures.add(new Point(i, j, new HashSet<>(), ""));
        }
      }
    }

    Queue<Point> queue = new ArrayDeque<>();
    Set<Point> visited = new HashSet<>();
    queue.offer(start);
    visited.add(start);
    Point[][] prev = new Point[N][M];

    while (!queue.isEmpty()) {
      Point current = queue.poll();
      if (current.x == exit.x && current.y == exit.y && current.collected.equals(allTreasures)) {
        return current.path;
      }

      for (int i = 0; i < 4; i++) {
        int nx = current.x + dx[i];
        int ny = current.y + dy[i];
        if (nx >= 0 && nx < N && ny >= 0 && ny < M && maze[nx][ny] != '1') {
          Set<Point> newTreasures = new HashSet<>(current.collected);
          String newPath = current.path + directions[i];
          Point point = new Point(nx, ny, newTreasures, newPath);
          if(maze[nx][ny] == 'S'){
            point.collected.add(new Point(nx, ny, new HashSet<>(), ""));
          }
          if(!visited.contains(point)){
            visited.add(point);
            queue.offer(point);
            prev[nx][ny] = current;
          }
        }
      }
    }

    return "No path found";
  }

  public static void main(String[] args) {
    char[][] maze = {
        {'0', 'S', '1', '0'},
        {'0', '0', '1', 'S'},
        {'1', '0', '0', '0'},
        {'0', '1', 'S', '0'}
    };
    System.out.println(findPath(maze));
  }
}
