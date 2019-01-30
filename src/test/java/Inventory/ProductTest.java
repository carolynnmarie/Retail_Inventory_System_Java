package Inventory;

import Inventory.Tags.DepartmentTag;
import Inventory.Tags.ProductTypeTag;
import java.util.*;
import org.junit.*;


public class ProductTest {


    Calendar calendar = Calendar.getInstance();
    Date date = calendar.getTime();
    ArrayList<Prices> sales = new ArrayList<>(Arrays.asList(new Prices(3.5, 2, date)));
    ArrayList<Prices> purchases = new ArrayList<>(Arrays.asList(new Prices(3, 5, date)));
    Product product = new Product("t-shirt", "small","purple",new DepartmentTag("womens"),new ProductTypeTag("shirt"),purchases,sales);

    @Test
    public void testCalculateYearlyProfit(){
        double expected = -8;
        double actual = product.calculateYearlyProfit();
        Assert.assertEquals(expected,actual,0.05);
    }

    @Test
    public void testGetTotalSales(){
        int expected = 2;
        int actual = product.getTotalSales();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetCurrentQuantity(){
        int expected = 3;
        int actual = product.getCurrentQuantity();
        Assert.assertEquals(expected,actual);
    }

}
