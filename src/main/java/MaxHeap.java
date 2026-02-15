public class MaxHeap {

    private WordFreq[] heap;
    private int size;

    public MaxHeap(WordFreq[] array) {
        this.heap = array;
        this.size = array.length;
    }

    public void buildMaxHeap() {
        for (int i = size / 2 - 1; i >= 0; i--) {
            maxHeapify(i);
        }
    }

    private void maxHeapify(int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < size && heap[left].frequency > heap[largest].frequency) {
            largest = left;
        }

        if (right < size && heap[right].frequency > heap[largest].frequency) {
            largest = right;
        }

        if (largest != i) {
            swap(i, largest);
            maxHeapify(largest);
        }
    }

    private void swap(int i, int j) {
        WordFreq temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.println(heap[i]);
        }
    }
}
