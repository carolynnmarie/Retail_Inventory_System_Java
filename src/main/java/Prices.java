import java.util.*;

public class Prices {

    private double price;
    private int quantity;
    private Date date;

    public Prices(double price, int quantity, Date date){
        this.price = price;
        this.quantity = quantity;
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
