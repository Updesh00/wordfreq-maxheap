
# Word Frequency Max Heap

This project implements a Max Heap in Java using the standard bottom-up BUILD-MAX-HEAP algorithm.

## Problem
Given a list of customer survey phrases and their frequencies, we construct a Max Heap where higher frequency means higher priority.

## Approach
- Each phrase is stored as a `WordFreq` object.
- The heap is implemented using an array representation of a binary tree.
- The bottom-up heap construction starts from the last non-leaf node and applies `maxHeapify` to maintain the heap property:
  
  Parent frequency ≥ children frequency.

## Time Complexity
- BUILD-MAX-HEAP: **O(n)**
- maxHeapify: **O(log n)**
- Space Complexity: **O(1)** (in-place construction)

## Output
After building the heap, the array is printed in heap order (not sorted order). The root contains the maximum frequency (900).

