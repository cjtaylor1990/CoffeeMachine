public enum CoffeeType {
    ESPRESSO(1, 250, 0, 16, 1, 4),
    LATTE(2, 350, 75, 20, 1, 7),
    CAPPUCCINO(3, 200, 100, 12, 1, 6);

    int choiceCode;
    int water;
    int milk;
    int coffeeBeans;
    int cups;
    int cost;

    CoffeeType(int choiceCode, int water, int milk, int coffeeBeans, int cups, int cost) {
        this.choiceCode = choiceCode;
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.cups = cups;
        this.cost = cost;
    }

    public int getChoiceCode() {
        return this.choiceCode;
    }

    public int getWater() {
        return this.water;
    }

    public int getMilk() {
        return this.milk;
    }

    public int getCoffeeBeans() {
        return this.coffeeBeans;
    }

    public int getCups() {
        return this.cups;
    }

    public int getCost() {
        return this.cost;
    }

    public int[] getAllComponents() {
        return new int[] {this.water, this.milk, this.coffeeBeans, this.cups};
    }
}
