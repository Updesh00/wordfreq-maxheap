public class MaxHeapTest {

    public static void main(String[] args) {

        WordFreq[] data = {
            new WordFreq("a", 10),
            new WordFreq("b", 50),
            new WordFreq("c", 30)
        };

        MaxHeap heap = new MaxHeap(data);
        heap.buildMaxHeap();

        if (heap.getRoot().frequency == 50) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
