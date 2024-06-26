# Решатель Лабиринта с Сокровищами

[RU](README.md) | [EN](docs/README_EN.md) | [FR](docs/README_FR.md) |  [JP](docs/README_JP.md) | [DE](docs/README_DE.md) | [CH](docs/README_CH.md) | [KR](docs/README_KR.md)

Этот репозиторий содержит алгоритм для решения задачи "Лабиринт с сокровищами". Дан лабиринт, представленный в виде двумерного массива, где каждая ячейка может быть пустой (0), содержать стену (1) или сокровище (S). Цель состоит в том, чтобы собрать все сокровища и добраться до выхода с минимальным количеством шагов.

## Условие Задачи

Вам предоставляется карта лабиринта, где:
- 0 обозначает пустую ячейку,
- 1 обозначает стену,
- S обозначает сокровище.

Вход в лабиринт находится в верхнем левом углу (0,0), а выход - в нижнем правом углу (N-1, M-1).

## Задачи

1. Разработать алгоритм для поиска кратчайшего пути, который позволит собрать все сокровища и дойти до выхода.
2. Определить временную сложность вашего алгоритма.
3. (Опционально) Модифицировать алгоритм для возврата пути через лабиринт в виде строки, например, "RRDDLU" (где R = вправо, D = вниз, L = влево, U = вверх).

## Пример

Рассмотрим следующий лабиринт:

[
[0, S, 1, 0],
[0, 0, 1, S],
[1, 0, 0, 0],
[0, 1, S, 0]
]

## Использование

Клонируйте репозиторий и запустите файл `TreasureMaze.java` находящийся в папке `src` с данными лабиринта в качестве входных данных.

# Лицензия

Этот проект лицензируется по лицензии MIT - подробности см. в файле [LICENSE](LICENSE).