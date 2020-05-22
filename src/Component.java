public enum Component {
    WATER("ml", "water"),
    MILK("ml", "milk"),
    BEANS("grams", "coffee beans"),
    CUPS("", "disposable cups");

    String unit;
    String name;

    Component(String unit, String name) {
        this.unit = unit;
        this.name = name;
    }

    public String getUnit() {
        return this.unit;
    }

    public String getName() {
        return this.name;
    }
}
