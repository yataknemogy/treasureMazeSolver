# Treasure Maze Solver

[RU](/README.md) | [EN](README_EN.md) | [FR](README_FR.md) |  [JP](README_JP.md) | [DE](README_DE.md) | [CH](README_CH.md) | [KR](README_KR.md)

This repository contains an algorithm to solve the "Treasure Maze" problem. Given a maze represented as a two-dimensional array, where each cell can be empty (0), contain a wall (1), or contain a treasure (S), the goal is to collect all treasures and reach the exit with the minimum number of steps.

## Problem Statement

You are provided with a map of the maze, where:
- 0 denotes an empty cell,
- 1 denotes a wall,
- S denotes a treasure.

The entrance to the maze is at the top left (0,0), and the exit is at the bottom right (N-1, M-1).

## Tasks

1. Develop an algorithm to find the shortest path that allows collecting all treasures and reaching the exit.
2. Determine the time complexity of your algorithm.
3. (Optional) Modify the algorithm to return the path through the maze as a string, for example, "RRDDLU" (where R = right, D = down, L = left, U = up).

## Example

Consider the following maze:

[
[0, S, 1, 0],
[0, 0, 1, S],
[1, 0, 0, 0],
[0, 1, S, 0]
]

## Usage

Clone the repository and run the `TreasureMaze.java` file located in the `src` folder with the maze data as input.

# License

This project is licensed under the MIT License - see the [LICENSE](/LICENSE) file for details.