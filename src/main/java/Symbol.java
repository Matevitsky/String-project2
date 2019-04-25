import java.util.Objects;

public class Symbol {
    private final char c;

    public Symbol(char c) {
        this.c = c;
    }

    public char getC() {
        return c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Symbol)) {
            return false;
        }
        Symbol symbol = (Symbol) o;
        return c == symbol.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(c);
    }
}
