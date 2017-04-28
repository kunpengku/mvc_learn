package domain;

import java.io.Serializable;

/**
 * Created by fupeng on 2017/4/28.
 */
public class Product implements Serializable {
    private static final long serialVersinUID = 189146546;
    private String name;
    private String description;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
