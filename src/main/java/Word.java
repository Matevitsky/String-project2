import java.util.List;
import java.util.Objects;

public class Word {
    private final List<Symbol> word;

    public Word(List<Symbol> word) {
        this.word = word;
    }

    public List<Symbol> getWord() {
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Word)) {
            return false;
        }
        Word word1 = (Word) o;
        return Objects.equals(word, word1.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }
}
