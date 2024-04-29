package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private final String text;

    public ReversedSequence(String text) {
        this.text = text;
    }

    @Override
    public int length() {
        return text.length();
    }

    @Override
    public char charAt(int index) {
        return text.charAt(text.length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder reversedSubsequence = new StringBuilder(text.substring(start, end));
        return new ReversedSequence(reversedSubsequence.reverse().toString());
    }

    @Override
    public String toString() {
        return new StringBuilder(text).reverse().toString();
    }
}
// END
