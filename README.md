# DSA-Java

Data Structures and Algorithms implemented in Java, organized by topic and technique.
Each problem is solved locally first, committed to GitHub, and then submitted on LeetCode.

---

## Problems Solved

### Arrays
- **[Easy] Two Sum**  
  Technique: Hashing  
  LeetCode: https://leetcode.com/problems/two-sum/

- **[Easy] Remove Duplicates from Sorted Array**  
  Technique: Two pointers, in-place overwrite  
  LeetCode: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

- **[Easy] Remove Element**  
  Technique: Two pointers (both ends), in-place overwrite  
  LeetCode: https://leetcode.com/problems/remove-element/

- **[Easy] Merge Sorted Array**  
  Technique: 3-pointer in-place merge (backward)  
  LeetCode: https://leetcode.com/problems/merge-sorted-array/

- **[Easy] Plus One**  
  Technique: Backward digit scan, carry propagation  
  LeetCode: https://leetcode.com/problems/plus-one/

- **[Easy] Best Time to Buy and Sell Stock**  
  Technique: Greedy (single pass), DP optimization  
  LeetCode: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

- **[Easy] Valid Palindrome**  
  Technique: Two-pointers, character filtering, ASCII normalization  
  LeetCode: https://leetcode.com/problems/valid-palindrome/

- **[Easy] Single Number**  
  Technique: XOR, bit manipulation, linear time & constant space  
  LeetCode: https://leetcode.com/problems/single-number/
---

### Linked List
- **[Easy] Add Two Numbers**  
  Technique: Carry simulation, dummy node  
  LeetCode: https://leetcode.com/problems/add-two-numbers/

- **[Easy] Remove Duplicates from Sorted List**  
  Technique: Linked list pointer mutation (in-place)  
  LeetCode: https://leetcode.com/problems/remove-duplicates-from-sorted-list/

- **[Easy] Merge Two Sorted Lists**  
  Technique: Two pointers, dummy node, node splicing  
  LeetCode: https://leetcode.com/problems/merge-two-sorted-lists/

- **[Easy] Linked List Cycle**  
  Technique: Floyd's tortoise & hare, cycle detection  
  LeetCode: https://leetcode.com/problems/linked-list-cycle/
---

### Strings
- **[Medium] Longest Substring Without Repeating Characters**  
  Technique: Sliding Window  
  LeetCode: https://leetcode.com/problems/longest-substring-without-repeating-characters/

- **[Medium] Longest Palindromic Substring**  
  Technique: Expand Around Center (two pointers)  
  LeetCode: https://leetcode.com/problems/longest-palindromic-substring/

- **[Easy] Roman to Integer**  
  Technique: Reverse scan, subtraction rule  
  LeetCode: https://leetcode.com/problems/roman-to-integer/

- **[Easy] Longest Common Prefix**  
    Technique: Horizontal scanning  
    LeetCode: https://leetcode.com/problems/longest-common-prefix/

- **[Easy] Find the Index of the First Occurrence in a String**  
  Technique: Brute-force string matching  
  LeetCode: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

- **[Easy] Length of Last Word**  
  Technique: Reverse traversal, space skipping  
  LeetCode: https://leetcode.com/problems/length-of-last-word/

- **[Easy] Add Binary**  
  Technique: Reverse binary addition with carry  
  LeetCode: https://leetcode.com/problems/add-binary/
---

### Binary Search
- **[Hard] Median of Two Sorted Arrays**  
  Technique: Binary search on partitions  
  LeetCode: https://leetcode.com/problems/median-of-two-sorted-arrays/

- **[Easy] Search Insert Position**  
  Technique: Binary search, insertion point via `low`  
  LeetCode: https://leetcode.com/problems/search-insert-position/

- **[Easy] Sqrt(x)**  
  Technique: Binary search, overflow-avoidance via division  
  LeetCode: https://leetcode.com/problems/sqrtx/
---
### Math
- **[Easy] Palindrome Number**  
  Technique: Half reversal (math-based)  
  LeetCode: https://leetcode.com/problems/palindrome-number/

- **[Easy] Pascal's Triangle**  
  Technique: DP (2D), combinatorics, iterative buildup  
  LeetCode: https://leetcode.com/problems/pascals-triangle/

- **[Easy] Pascal's Triangle II**  
  Technique: 1D DP (reverse update), combinatorics  
  LeetCode: https://leetcode.com/problems/pascals-triangle-ii/
---
### DP 
- **[Easy] Climbing Stairs**  
  Technique: DP, Fibonacci, rolling variables (O(1) space)  
  LeetCode: https://leetcode.com/problems/climbing-stairs/

### Tree
- **[Easy] Binary Tree Inorder Traversal**  
  Technique: DFS, inorder (Left → Node → Right), iterative stack  
  LeetCode: https://leetcode.com/problems/binary-tree-inorder-traversal/

- **[Easy] Same Tree**  
  Technique: DFS structural equality (value + shape)  
  LeetCode: https://leetcode.com/problems/same-tree/

- **[Easy] Symmetric Tree**  
  Technique: DFS mirror check (Left ↔ Right), optional BFS pairing  
  LeetCode: https://leetcode.com/problems/symmetric-tree/

- **[Easy] Maximum Depth of Binary Tree**  
  Technique: DFS depth accumulation (also BFS level counting)  
  LeetCode: https://leetcode.com/problems/maximum-depth-of-binary-tree/

- **[Easy] Convert Sorted Array to BST**  
  Technique: Divide & Conquer, recursion, balanced BST construction  
  LeetCode: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

- **[Easy] Balanced Binary Tree**  
  Technique: DFS bottom-up, early fail, tree DP flavor  
  LeetCode: https://leetcode.com/problems/balanced-binary-tree/

- **[Easy] Minimum Depth of Binary Tree**  
  Technique: DFS with null-handling OR BFS shortest leaf search  
  LeetCode: https://leetcode.com/problems/minimum-depth-of-binary-tree/

- **[Easy] Path Sum**  
  Technique: DFS root→leaf path accumulation (BFS optional)  
  LeetCode: https://leetcode.com/problems/path-sum/
## Repository Structure

```text
src/
├── arrays/
│   └── easy/
├── linkedlist/
│   └── easy/
├── strings/
│   └── slidingwindow/
└── binarysearch/