package CoreTutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AgeLimitException, InterruptedException {
//        System.out.println("Hello world!");
//        StringHandling stringHandling=new StringHandling();
//            NumberHandling numberHandling=new NumberHandling();
//            numberHandling.Table(5);
//            System.out.println("Sum of Given number "+ numberHandling.SumOfNum(2314));
//            System.out.println("Factorial of 5 is :"+ numberHandling.Factorial(5));
//            numberHandling.Reverse(131);
//        stringHandling.Names("simonakgh@gmail.com");
//        LocalVar localVar=new LocalVar();
//        localVar.AgeFind();
//        LoopEnhanced loopEnhanced=new LoopEnhanced();
//        loopEnhanced.Print();
//        Student[] student={ new Student("Simona",1), new Student("Nishant",2), new Student("Prasanna", 3), new Student("Venky", 4)};
//        for (Student stud:student) {
//                System.out.print(stud+",");
//        }
//    CheckingAge checkingAge=new CheckingAge(34);
//        try {
//            checkingAge.CheckAge();
//        }catch (AgeLimitException e){
//            System.out.println("Sorry Age is not correct"+ e.getAge());
//        }
//
////        PrintDemo printDemo=new PrintDemo();
////        ThreadDemo threadDemo1=new ThreadDemo("Thread-1",printDemo);
////        ThreadDemo threadDemo2=new ThreadDemo("Thread-2",printDemo);
////        ThreadDemo threadDemo3=new ThreadDemo("Thread-3",printDemo);
////        threadDemo1.start();
////        threadDemo2.start();
////        try {
////            threadDemo1.join();
////            threadDemo2.join();
////        } catch (InterruptedException e) {
////            System.out.println("Thread Interrupted");
////        }
//        Chat m=new Chat();
//        Thred1 thred1=new Thred1(m);
//        Thred2 thred2=new Thred2(m);
        Scanner sc=new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++)
//        {
//            String s1=sc.next();
//            int x=sc.nextInt();
//            System.out.printf("%-15s%03d%n",s1,x);
//        }
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=a;
            for(int j=0;j<n;j++){
                sum= (int) (sum+(b*(Math.pow(2,j))));
                System.out.print(sum+",");
            }
            System.out.println("");
        }
        in.close();


}}