import Tags.DepartmentTag;
import Tags.ProductTypeTag;
import java.util.*;

public class Product {

    private String name;
    private String size;
    private String color;
    private DepartmentTag department;
    private ProductTypeTag productType;
    private ArrayList<Prices> purchases;
    private ArrayList<Prices> sales;

    public Product(){}

    public Product(String name, String size, String color, DepartmentTag department, ProductTypeTag productType){
        this.name = name;
        this.size = size;
        this.color = color;
        this.department = department;
        this.productType = productType;
        this.purchases = new ArrayList<>();
        this.sales = new ArrayList<>();
    }

    public Product(String name, String size, String color, ArrayList<Prices> purchases, ArrayList<Prices> sales){
        this.name = name;
        this.size = size;
        this.color = color;
        this.purchases = purchases;
        this.sales = sales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public DepartmentTag getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentTag department) {
        this.department = department;
    }

    public ProductTypeTag getProductType() {
        return productType;
    }

    public void setProductType(ProductTypeTag productType) {
        this.productType = productType;
    }

    public ArrayList<Prices> getPurchases() {
        return purchases;
    }

    public void setPurchases(ArrayList<Prices> purchases) {
        this.purchases = purchases;
    }

    public void addPurchase(Prices purchase){
        purchases.add(purchase);
    }

    public ArrayList<Prices> getSales() {
        return sales;
    }

    public void setSales(ArrayList<Prices> sales) {
        this.sales = sales;
    }

    public void addSale(Prices sale){
        sales.add(sale);
    }

    public double calculateYearlyProfit(){
        double totalP = 0;
        double totalS = 0;
        for(Prices bought: purchases){
            totalP += bought.getPrice()*bought.getQuantity();
        }
        for(Prices sold: sales){
            totalS += sold.getPrice()*sold.getQuantity();
        }
        return totalS-totalP;
    }

    public int getNumberOfTotalSales(){
        int salesNumb = 0;
        for(Prices sale1: sales){
            salesNumb += sale1.getQuantity();
        }
        return salesNumb;
    }

    public int getCurrentQuantity(){
        int p = 0;
        int s = 0;
        for(Prices bought: purchases){
            p += bought.getQuantity();
        }
        for(Prices sold: sales){
            s += sold.getQuantity();
        }
        return p-s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(size, product.size) &&
                Objects.equals(color, product.color) &&
                Objects.equals(department, product.department) &&
                Objects.equals(productType, product.productType) &&
                Objects.equals(purchases, product.purchases) &&
                Objects.equals(sales, product.sales);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, size, color, department, productType, purchases, sales);
    }
}
