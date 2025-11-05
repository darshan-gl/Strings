package string_prgms;

import java.util.Scanner;

public class Product_test {

    static double getTotalPrice(Product[] products) {
        double total = 0;
        for (int i = 0; i < products.length; i++) {
            total = total + products[i].getprice();
        }
        return total;
    }

    static Product getHighestPriceProduct(Product[] products) { // fixed parameter name
        Product hprod = products[0]; 
        for (int i = 1; i < products.length;i++) { 
            if (products[i].getprice() > hprod.getprice()) {
                hprod = products[i];
            }
        }
        return hprod; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many products");
        int n = sc.nextInt();
        Product[] prods = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter id name and price of product");
            int id = sc.nextInt();
            String name = sc.next();
            double price = sc.nextDouble();
            prods[i] = new Product(id, name, price);
        }

        double total = getTotalPrice(prods);
        Product hproduct = getHighestPriceProduct(prods);

        System.out.println("total price is " + total);
        System.out.println("highest price product is " + hproduct);

        
    }
}
