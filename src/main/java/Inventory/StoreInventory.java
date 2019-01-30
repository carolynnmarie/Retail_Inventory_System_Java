package Inventory;

import Inventory.Product;
import Inventory.Tags.DepartmentTag;
import Inventory.Tags.ProductTypeTag;
import java.util.*;

public class StoreInventory {

    private ArrayList<Product> inventory;

    public StoreInventory(){
        this.inventory = new ArrayList<>();
    }

    public StoreInventory(ArrayList<Product> inventory){
        this.inventory = inventory;
    }

    public ArrayList<Product> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Product> inventory) {
        this.inventory = inventory;
    }

    public void addItem(Product product){
        inventory.add(product);
    }

    public void removeItem(Product product){
        inventory.remove(product);
    }


    public double calculateYearlyProfit(){
        double profit = 0;
        for(Product product: inventory){
            profit += product.calculateYearlyProfit();
        }
        return profit;
    }

    public ArrayList<Product> getDepartmentInventory(DepartmentTag department){
        ArrayList<Product> depInv = new ArrayList<>();
        for(Product product: inventory){
            if(department.equals(product.getDepartment())){
                depInv.add(product);
            }
        }
        return depInv;
    }

    public double calculateDepartmentProfit(DepartmentTag department){
        ArrayList<Product> depInv = getDepartmentInventory(department);
        double profit = 0;
        for(Product product: depInv){
            profit += product.calculateYearlyProfit();
        }
        return profit;
    }

    public ArrayList<Product> getProductTypeInventory(ProductTypeTag productType){
        ArrayList<Product> prodTypeList = new ArrayList<>();
        for(Product product: inventory){
            if(productType.equals(product.getProductType())){
                prodTypeList.add(product);
            }
        }
        return prodTypeList;
    }
}
