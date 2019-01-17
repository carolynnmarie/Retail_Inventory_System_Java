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
        return 0;
    }

    public ArrayList<Product> getDepartmentInventory(){
        return null;
    }

    public double calculateYearlyDepartmentProfit(){
        return 0;
    }

    public ArrayList<Product> getProductTypeInventory(){
        return null;
    }
}
