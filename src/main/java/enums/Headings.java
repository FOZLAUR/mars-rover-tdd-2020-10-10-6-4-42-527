package enums;

public enum Headings {
    NORTH("N"),
    EAST("E"),
    SOUTH("S"),
    WEST("W");

    public final String value;

    private Headings(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

