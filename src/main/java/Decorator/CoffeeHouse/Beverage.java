package Decorator.CoffeeHouse;

public abstract class Beverage {

    private int cost;

    private String description;

    public int getCost() {
        return cost;
    }

    public void setCost(final int cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public static class Espresso extends Beverage {
        public  Espresso() {
        }

        @Override
        public int getCost() {
            return 10;
        }

        @Override
        public String getDescription() {
            return "Espresso";
        }
    }

    public static class Cappucino extends Beverage {

        @Override
        public int getCost() {
            return 15;
        }

        @Override
        public String getDescription() {
            return "Cappucino";
        }
    }

    public static class Tea extends Beverage {

        @Override
        public int getCost() {
            return 10;
        }

        @Override
        public String getDescription() {
            return "Tea";
        }

    }
}
