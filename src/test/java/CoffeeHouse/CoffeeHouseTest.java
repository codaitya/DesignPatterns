package CoffeeHouse;

import Decorator.CoffeeHouse.Beverage;
import Decorator.CoffeeHouse.BeverageDecorator;
import org.junit.Test;

public class CoffeeHouseTest {

    @Test
    public void testWhippedCreamEspresso()
    {
        Beverage beverage = new BeverageDecorator.WhippedCreamDecorator(new BeverageDecorator.SoyDecorator( new Beverage.Espresso()));
        assert beverage.getCost() == 17;
    }
}
