package Chapter9.Exercise.Exercise_09_02;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    double getChangePercent() {
        return ((currentPrice - previousClosingPrice) /
                previousClosingPrice) * 100;
    }
}
