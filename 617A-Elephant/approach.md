## Problem
[617A - Elephant](https://codeforces.com/problemset/problem/617/A)

An elephant starts at point 0 and needs to reach point `x` on a coordinate line. In one step, it can move forward by 1, 2, 3, 4, or 5 positions.

Find the minimum number of steps needed to reach exactly point `x`.

**Input:** A single integer `x` (1 ≤ x ≤ 1,000,000)

**Output:** A single integer — the minimum number of steps required.

## Approach
- To minimize the number of steps, always take the biggest possible step (5) as many times as it fits into `x` — this is a **greedy** strategy, and it works here since any leftover distance after taking full steps of 5 (i.e., a remainder of 1, 2, 3, or 4) can always be covered in exactly one more step.
- `steps = x / 5` gives the number of full 5-length steps (integer division).
- If `x % 5 != 0`, there's a leftover distance (1 to 4) that still needs exactly one more step — so increment `steps` by 1 in that case.
- If `x % 5 == 0`, the elephant reaches `x` exactly with full 5-steps, no extra step needed.

## Complexity
- **Time:** O(1) — just a couple of arithmetic operations, no loops
- **Space:** O(1) — no extra data structures used