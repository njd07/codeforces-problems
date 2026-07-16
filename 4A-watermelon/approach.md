## Problem
[4A - Watermelon](https://codeforces.com/problemset/problem/4/A)

Petya and Vasya want to split a watermelon of weight `w` between themselves.
They can only be happy if the watermelon can be split into **two parts**, each with a weight that is a **positive even number**.

Given `w`, determine if such a split is possible.

**Input:** A single integer `w` (1 ≤ w ≤ 100)
**Output:** `"YES"` if a valid split exists, otherwise `"NO"`

## Approach
- Any even number greater than 2 can always be split into two positive even numbers.
  Example: 8 → 2 + 6, 4 + 4, etc.
- Edge cases to rule out:
    - If `w` is odd → splitting into two even numbers is impossible.
    - If `w == 2` → the only split is 1 + 1, which are odd, not even.
- So the check simplifies to: `w > 2 AND w % 2 == 0`

## Complexity
- **Time:** O(1) — single arithmetic check, no loops
- **Space:** O(1) — no extra data structures used