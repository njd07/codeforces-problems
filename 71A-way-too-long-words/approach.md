## Problem
[71A - Way Too Long Words](https://codeforces.com/problemset/problem/71/A)

In some texts, long words are abbreviated by keeping the first and last letter,
and replacing everything in between with the count of skipped letters.

Example: `localization` → `l10n` (12 letters → first `l`, 10 letters skipped, last `n`)

Given `n` words, output each word as-is if its length is ≤ 10.
Otherwise, output it in the abbreviated form described above.

**Input:**
- First line: integer `n` — number of words
- Next `n` lines: one word per line

**Output:** For each word, print either the original word or its abbreviated form.

## Approach
- Read each word one at a time.
- If `word.length() <= 10`, print it unchanged — no abbreviation needed.
- Otherwise, build the abbreviation:
    - First character of the word
    - Number of middle letters skipped → `word.length() - 2` (total length minus first and last letter)
    - Last character of the word
- Repeat this for all `n` words, printing one result per line.

## Complexity
- **Time:** O(N × L) — for N words, each of length L, we scan the word once (mainly to get its length and access first/last char, which are O(1) operations in Java, so effectively O(N) overall)
- **Space:** O(1) extra space per word (excluding input storage)