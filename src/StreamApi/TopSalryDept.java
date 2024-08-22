//package StreamApi;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class TopSalryDept {
//    public static void main(String[] args){
//        List<Employee>ls=new ArrayList<>();
//        ls.add(new Employee("Simona","Dev",45000.00));
//        ls.add(new Employee("Shyam","Dev",85000.00));
//        ls.add(new Employee("Priti","DevOps",55000.00));
//        ls.add(new Employee("Himnshu","Test",65000.00));
//        ls.add(new Employee("Arjun","NFT",25000.00));
//        ls.add(new Employee("Zeeshan","Dev",95000.00));
//        ls.stream().collect(Collectors.groupingBy(e -> e.getDept(), HashMap::new,Collectors.mapping(e -> e.getName(),Collectors.toList()))).entrySet().forEach();
//    }
//}
