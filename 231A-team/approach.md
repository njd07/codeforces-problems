## Problem
[231A - Team](https://codeforces.com/problemset/problem/231/A)

Three friends — Petya, Vasya, and Tonya — will solve a problem together **only if at least two of them are sure about the solution**.

Given `n` problems, and for each one a set of three values (0 or 1) representing whether each friend is sure, count how many problems the team will end up solving.

**Input:**
- First line: integer `n` — number of problems
- Next `n` lines: three integers (each 0 or 1), separated by spaces — Petya's, Vasya's, and Tonya's confidence for that problem

**Output:** A single integer — the number of problems where at least two friends are sure.

## Approach
- "At least two friends are sure" is the same as saying: **the sum of the three 0/1 values is ≥ 2**.
- For each of the `n` problems:
    - Read the three values.
    - Add them together.
    - If the sum is 2 or 3, it counts as a problem the team will solve — increment a counter.
- After processing all `n` lines, print the final counter.

No need to check individual friends separately — since each value is just 0 or 1, a simple sum captures "how many are sure" in one step.

## Complexity
- **Time:** O(N) — one pass through the `n` problems, constant work per line
- **Space:** O(1) — only a running counter is stored, no arrays or extra structures needed