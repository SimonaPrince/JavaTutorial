package StreamApi;

import CoreTutorial.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProductExample {
    public static void main(String[] args){
        List< Product > productsList = new ArrayList<Product>();

        // Adding Products
        productsList.add(new Product( "HP Laptop", 25000.0,"1001"));
        productsList.add(new Product( "Dell Laptop", 30000.0,"2001"));
        productsList.add(new Product( "Lenevo Laptop", 28000.0,"3001" ));
        productsList.add(new Product( "Sony Laptop", 28000.0,"4001" ));
        productsList.add(new Product( "Apple Laptop", 90000.0,"5001"));


        //Convert names of product to a set using map function
        Set<String> priceList=productsList.stream().map(Product::getName).collect(Collectors.toSet());
        System.out.println(priceList);

        //get max priced product
        Product pr=productsList.stream().max((p1,p2) -> p1.getPrice() > p2.getPrice() ? 1: -1).get();
        System.out.println(pr.getCode()+pr.getName()+pr.getPrice());

        //Get least prixed product
        Product prMin=productsList.stream().min((p1,p2)-> p1.getPrice() > p2.getPrice() ? 1: -1).get();
        System.out.println(prMin.getCode()+prMin.getName()+prMin.getPrice());

        IntStream.range(1,5).filter(i -> ( i % i  == 0 && i % 1==0)).forEach(System.out::println);
        List<Integer> evens = Arrays.asList(2, 4, 6);
        List<Integer> odds = Arrays.asList(3, 5, 7);
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);
        Object[] adi = {1, 2, new Object[]{3, 4, new Object[]{5}, 6}, 7, 8};
        Object[] ar= Arrays.stream(adi).flatMap(o -> o instanceof Object[] ? Arrays.stream((Object[]) o) : Stream.of(o)).toArray();
       System.out.println(Arrays.toString(ar));

     int sumEven=  IntStream.range(0,10).filter(i -> i%2 == 0).sum();
     System.out.println(sumEven);
    }
}
