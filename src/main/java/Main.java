/**
 * Main class to test the Max Heap implementation.
 * 
 * Creates an array of WordFreq objects,
 * builds the Max Heap,
 * and prints the heapified array.
 */
public class Main {

    public static void main(String[] args) {

        // Create array of WordFreq objects using given survey data
        WordFreq[] data = {
            new WordFreq("happy", 400),
            new WordFreq("satisfied", 100),
            new WordFreq("neutral", 300),
            new WordFreq("would buy again", 200),
            new WordFreq("terrible", 160),
            new WordFreq("inconvenient", 900),
            new WordFreq("difficult to use", 100),
            new WordFreq("easy to use", 140),
            new WordFreq("would recommend to friends", 800),
            new WordFreq("visit the store", 700)
        };

        // Create MaxHeap object
        MaxHeap heap = new MaxHeap(data);

        // Build the heap using bottom-up construction
        heap.buildMaxHeap();

        // Print the heapified array
        System.out.println("Heapified Array:");
        heap.printHeap();
    }
}
