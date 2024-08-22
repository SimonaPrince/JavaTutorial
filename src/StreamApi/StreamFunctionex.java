package StreamApi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFunctionex {
    public static void main(String [] args){
        HashMap<String,Integer> product= new HashMap<>();
        product.put("Washing Machine",44000);
        product.put("Microwave",220004);
        product.put("Refridgerator",440003);
        product.put("Telivision",550006);
        product.put("Stablizer",10000);
        product.put("Mixer Grinder",22000);
        product.put("Heater",15000);
        product.put("Induction",5500);

      int price= (int) product.entrySet().stream().filter(p -> p.getValue() > 20000).count();
      System.out.println(price);
      System.out.println(product.entrySet().stream().filter(p -> p.getValue() > 20000).collect(Collectors.toList()));
        product.entrySet().stream().filter(p -> p.getValue() > 30000).forEach( p -> System.out.print(p.getKey()+" "));
        System.out.println("Printing Values Sorted");
        //To sort based on Value
        product.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::print);
  
        String str="Geek for Geeks!!";
        //distinct() function prints only the unique elements
        Arrays.stream(str.split("")).distinct().forEach(System.out::print);

        Arrays.stream(str.toLowerCase().split("")).collect(Collectors.groupingBy(s->s ,HashMap::new,Collectors.counting())).forEach((s,i) -> System.out.println(s+"="+i));
        System.out.println("partitioning example");
        Arrays.stream(str.toUpperCase().trim().split("")).collect(Collectors.partitioningBy(s -> s.contains("aeiou"))).forEach((s,i) -> System.out.println(s+":"+i));
}}
