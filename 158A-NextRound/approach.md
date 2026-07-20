## Problem
[158A - Next Round](https://codeforces.com/problemset/problem/158/A)

A total of `n` participants took part in a contest, with scores given in non-increasing order. A participant advances to the next round if:
- Their score is **greater than or equal to** the score of the participant in `k`-th place, **AND**
- Their score is **positive** (strictly greater than 0)

Given `n`, `k`, and the list of scores, find how many participants advance.

**Input:**
- First line: two integers `n` and `k`
- Second line: `n` space-separated integers — the scores, in non-increasing order

**Output:** A single integer — the number of participants advancing to the next round.

## Approach
- The value of `k` is a **position**, not a score — so the actual cutoff isn't `k` itself, it's the score of whoever is standing at position `k`.
- Find `threshold = a[k - 1]` (0-indexed array, so k-th place is at index `k - 1`).
- Loop through all `n` scores and count how many satisfy **both**:
    - `score >= threshold`
    - `score > 0`
- The positivity check is necessary on its own — if the threshold itself happens to be 0 (e.g. everyone scored 0), simply checking `score >= threshold` would wrongly count everyone, since `0 >= 0` is true. The "positive score" rule from the problem statement overrides that.
- Print the final count.

## Complexity
- **Time:** O(N) — one pass to read scores, one pass to count, both linear
- **Space:** O(N) — storing all `n` scores in an array