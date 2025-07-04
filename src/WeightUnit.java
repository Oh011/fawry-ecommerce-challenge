public enum WeightUnit {



    GRAM("g"),
    KILOGRAM("kg");


    private final String symbol;

    WeightUnit(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}


