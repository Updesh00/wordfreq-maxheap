/**
 * MaxHeap class implements a Max Heap using an array.
 * 
 * A Max Heap is a complete binary tree where:
 * Parent frequency >= Left child frequency
 * Parent frequency >= Right child frequency
 * 
 * The heap is stored in an array representation.
 */
public class MaxHeap {

    private WordFreq[] heap;   // Array representing the heap
    private int size;          // Number of elements in the heap

    /**
     * Constructor initializes the heap with given array.
     * 
     * @param array array of WordFreq objects
     */
    public MaxHeap(WordFreq[] array) {
        this.heap = array;
        this.size = array.length;
    }

    /**
     * Builds a Max Heap using the bottom-up BUILD-MAX-HEAP algorithm.
     * 
     * We start from the last non-leaf node and move upward.
     * 
     * Why size/2 - 1?
     * Because nodes after that are leaves and already satisfy heap property.
     * 
     * Time Complexity: O(n)
     */
    public void buildMaxHeap() {
        for (int i = size / 2 - 1; i >= 0; i--) {
            maxHeapify(i);
        }
    }

    /**
     * Ensures the subtree rooted at index i satisfies the Max Heap property.
     * 
     * Steps:
     * 1. Compare current node with left and right child.
     * 2. Find the largest frequency among them.
     * 3. If child is larger, swap.
     * 4. Recursively heapify affected subtree.
     * 
     * @param i index of node to heapify
     * 
     * Time Complexity: O(log n)
     */
    private void maxHeapify(int i) {

        // Calculate left and right child indices
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Assume current node is largest
        int largest = i;

        // If left child exists and has greater frequency
        if (left < size && heap[left].frequency > heap[largest].frequency) {
            largest = left;
        }

        // If right child exists and has greater frequency
        if (right < size && heap[right].frequency > heap[largest].frequency) {
            largest = right;
        }

        // If largest is not the parent node, swap and continue heapifying
        if (largest != i) {
            swap(i, largest);
            maxHeapify(largest);
        }
    }

    /**
     * Swaps two elements in the heap array.
     * 
     * @param i index of first element
     * @param j index of second element
     */
    private void swap(int i, int j) {
        WordFreq temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    /**
     * Prints the heap array after heap construction.
     * This displays the heapified order.
     */
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.println(heap[i]);
        }
    }
}
