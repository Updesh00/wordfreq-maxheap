/**
 * WordFreq represents a survey phrase and its frequency.
 * 
 * Each object stores:
 *  - the phrase (word)
 *  - the number of times it appeared in feedback (frequency)
 * 
 * The frequency determines the priority in the Max Heap.
 */
public class WordFreq {

    String word;        // The survey phrase
    int frequency;      // Number of times the phrase appeared

    /**
     * Constructor to initialize WordFreq object.
     * 
     * @param word       the survey phrase
     * @param frequency  how many times it appeared
     */
    public WordFreq(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }

    /**
     * toString method for printing the object.
     * This allows us to print the phrase and its frequency easily.
     */
    @Override
    public String toString() {
        return word + " (" + frequency + ")";
    }
}
