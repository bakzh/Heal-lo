package shopping;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Product pr1 = new Product("시계", 50_000);
        Product pr2 = new Product("바지", 30_000);
        Product pr3 = new Product("장난감", 10_000);
        Product pr4 = new Product("셔츠", 40_000);
        Product pr5 = new Product("신발", 20_000);

        ShoppingBasket shoppingBasket = new ShoppingBasket();
        shoppingBasket.put(pr1);
        shoppingBasket.put(pr2);
        shoppingBasket.put(pr3);
        shoppingBasket.put(pr4);
        shoppingBasket.put(pr5);
        System.out.println(shoppingBasket);


//        Integer x = 1;  //auto boxing
//        int z = x;      //auto unboxing
//        Integer y = new Integer(1);
//        int z = y.intValue();

        //가격 내림차순 비교연산자
        Comparator<Product> com3 = new Comparator<>() {
            @Override
            public int compare(Product p1, Product p2) {
//          case1)
//                int result = 0;
//                if (p1.getPrice() > p2.getPrice()) {
//                    result = 1;
//                } else if (p1.getPrice() < p2.getPrice()) {
//                    result = -1;
//                }
//                return result * -1;
                //case2)
                Integer priceOfp1 = p1.getPrice();
                Integer priceOfp2 = p2.getPrice();
                return priceOfp1.compareTo(priceOfp2) * -1;
            }
        };
        ShoppingBasket shoppingBasket3 = new ShoppingBasket(com3);
        shoppingBasket3.put(pr1);
        shoppingBasket3.put(pr2);
        shoppingBasket3.put(pr3);
        shoppingBasket3.put(pr4);
        shoppingBasket3.put(pr5);
        System.out.println(shoppingBasket3);

        //가격 오름차순 비교연산자

        //상품명 오름차순 비교연산자
        Comparator<Product> com4 = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getProductName().compareTo(o2.getProductName());
            }
        };
        ShoppingBasket shoppingBasket4 = new ShoppingBasket(com4);
        shoppingBasket4.put(pr1);
        shoppingBasket4.put(pr2);
        shoppingBasket4.put(pr3);
        shoppingBasket4.put(pr4);
        shoppingBasket4.put(pr5);
        System.out.println(shoppingBasket4);


        //상품명 내림차순 비교연산자
        Comparator<Product> com5 = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getProductName().compareTo(o2.getProductName()) * -1;
            }
        };
        ShoppingBasket shoppingBasket5 = new ShoppingBasket(com5);
        shoppingBasket5.put(pr1);
        shoppingBasket5.put(pr2);
        shoppingBasket5.put(pr3);
        shoppingBasket5.put(pr4);
        shoppingBasket5.put(pr5);
        System.out.println(shoppingBasket5);
    }

}
