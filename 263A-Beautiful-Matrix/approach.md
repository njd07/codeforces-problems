## Problem
[263A - Beautiful Matrix](https://codeforces.com/problemset/problem/263/A)

You are given a 5×5 matrix where every cell is `0` except exactly one cell, which is `1`. In one move, the `1` can be swapped with any side-adjacent cell (up, down, left, or right).

Find the minimum number of moves needed to bring the `1` to the center of the matrix (row 3, column 3, in 1-indexed terms).

**Input:** 5 lines, each with 5 space-separated integers (0s and one 1) representing the matrix.

**Output:** A single integer — the minimum number of moves required.

## Approach
- Since each move only shifts the `1` to an adjacent cell (never diagonally), the minimum number of moves to reach the center is simply the **Manhattan distance** between the `1`'s current position and the center.
- While reading the 5×5 grid, use 1-indexed loop counters (`i`, `j` from 1 to 5) instead of 0-indexed — this makes the center cell land exactly at `(3, 3)`, avoiding extra off-by-one adjustments later.
- Track the row and column where the value `1` is found.
- Once the full grid is read, compute:
  `moves = |row - 3| + |col - 3|`
- Print `moves`.

## Complexity
- **Time:** O(1) — the grid size is fixed at 5×5 (25 cells), so the read/scan is constant work regardless of input
- **Space:** O(1) — only row and column indices are stored, no need to keep the full matrix in memory