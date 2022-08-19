package shopping;

import com.kh.exam4.Person;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product> {
    private String productName;
    private int price;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "상품명: " + productName +
                ", 가격: " + price;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product o) {
        int result = 0;
        Product p = (Product) o;
        return Integer.valueOf(this.getPrice()).compareTo(Integer.valueOf(p.getPrice()));

//        if (this.getPrice() > p.getPrice()) {
//            result = 1;
//        } else if (this.getPrice() < p.getPrice()) {
//            result = -1;
//        }
//        return result;
//    }

    }
}
