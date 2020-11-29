package Decorator.CoffeeHouse;

public abstract class BeverageDecorator extends Beverage {

    public Beverage beverage;


    public BeverageDecorator(final Beverage beverage) {
        this.beverage = beverage;
    }

    private Beverage getBeverage() {
        return beverage;
    }

    private void setBeverage(final Beverage beverage) {
        this.beverage = beverage;
    }

    public static class SoyDecorator extends BeverageDecorator {

        public SoyDecorator(Beverage beverage) {
            super(beverage);
        }

        @Override
        public int getCost() {
            return 2 + this.beverage.getCost();
        }
    }


    public static class WhippedCreamDecorator extends BeverageDecorator {

        public WhippedCreamDecorator(Beverage beverage) {
            super(beverage);
        }

        @Override
        public int getCost() {
            return 5 + this.beverage.getCost();
        }
    }

    public static class ExtraSugarDecorator extends BeverageDecorator {

        public ExtraSugarDecorator(Beverage beverage) {
            super(beverage);
        }

        @Override
        public int getCost() {
            return 12 + this.beverage.getCost();
        }
    }
}





