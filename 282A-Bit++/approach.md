## Problem
[282A - Bit++](https://codeforces.com/problemset/problem/282/A)

There is a variable `X`, starting at 0. You are given `n` statements, each being one of:
`X++`, `++X`, `X--`, or `--X`.

`++` increases `X` by 1, `--` decreases `X` by 1 — the position of `X` relative to the operator doesn't affect the result.

Find the final value of `X` after executing all `n` statements.

**Input:**
- First line: integer `n` — number of statements
- Next `n` lines: one statement each (`X++`, `++X`, `X--`, or `--X`)

**Output:** A single integer — the final value of `X`.

## Approach
- Since the only characters that ever appear are `X`, `+`, and `-`, we don't need to check the exact format (`X++` vs `++X`) — just checking whether the statement contains `"+"` is enough to know it's an increment.
- Read each statement as a single token using `sc.next()` (no whitespace inside a statement, so this works cleanly).
- If it contains `"+"` → increment `X`.
- Otherwise (it must contain `"-"`) → decrement `X`.
- After processing all `n` statements, print the final value of `X`.

## Complexity
- **Time:** O(N) — one pass through the `n` statements, constant work per statement
- **Space:** O(1) — only a single counter variable is stored