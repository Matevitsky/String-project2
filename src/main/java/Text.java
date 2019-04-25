import java.util.List;
import java.util.Objects;

public class Text {

    private List<Word> text;

    public Text(List<Word> text) {
        this.text = text;
    }

    public List<Word> getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Text)) {
            return false;
        }
        Text sentence1 = (Text) o;
        return Objects.equals(text, sentence1.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}
