package CoreTutorial;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambExmpl4 {
    public static void main(String[] args){
        List<Product> myprod= new ArrayList<>();
        myprod.add(new Product("TV",15000.00,"1001"));
        myprod.add(new Product("Fridge",440050.50,"1002"));
        myprod.add(new Product("AC",25000.00,"1003"));
        myprod.add(new Product("Washing",50000.00,"1004"));
        myprod.add(new Product("Microwave",30000.20,"1005"));
        System.out.println("Sorting on the basis of name");
        myprod.sort(Comparator.comparing(p -> p.code));
        for (Product p:myprod
             ) {
                System.out.println(p.code+" "+p.name+" "+ p.price);
        }
        for (Product prod:myprod) {
            if(prod.price >40000){
                System.out.println(prod.name+" "+prod.code);
            }
        }

        Stream<Product> filtered_data=myprod.stream().filter(p -> p.price > 20000);
        filtered_data.forEach(p2->System.out.println(p2.code+" "+p2.name));


        //Stream with filtered data prep
        List<Double> productPrice=myprod.stream()
                .filter(p -> p.price >30000) //filtering data
                .map(p -> p.price) //fetching data
                .collect(Collectors.toList());//Collecting as list
        System.out.println(productPrice);
        //Sum of total price using reduce method
        Double totalPrice=myprod.stream().map(p -> p.price).reduce(0.0,(sum,price) -> sum+price);
        System.out.println("Total Price: "+totalPrice);

        //Sum of price using reduce method [Method Reference]
        Double totalPrice1=myprod.stream().map(p -> p.price).reduce(0.0, Double::sum);
        System.out.println("Total Price: "+totalPrice1);

        //Sum of all price using Collector method

        double priceTot=myprod.stream().collect(Collectors.summingDouble(p -> p.price));
        System.out.println("Total Price: "+priceTot);

        //Sum of price using mapToDouble
        double priceTot1= myprod.stream().mapToDouble(p -> p.price).sum();
        System.out.println("Total Price: "+priceTot1);

        //Compare two product data Finding max price
        Product product= myprod.stream().max((p1, p2) -> p1.price > p2.price ? 1: -1).get();
        System.out.println(product.name+" "+product.price);

        //Compare two product data Finding min price
        Product product2= myprod.stream().min((p1, p2) -> p1.price > p2.price ? 1: -1).get();
        System.out.println(product2.name+" "+product2.price);

        //Count the number of product with specific
        long count=myprod.stream().filter(p -> p.price >30000.00).count();
        System.out.println(count);

    }
}
