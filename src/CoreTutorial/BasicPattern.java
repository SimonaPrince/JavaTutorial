package CoreTutorial;

import java.util.Scanner;

public class BasicPattern {


    public static void printPat1(int n) {
        System.out.println("Pattern 1 $$$$$---------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void printPat2(int n){
        System.out.println("Pattern 2 $$$$$---------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printPat3(int n){
        System.out.println("Pattern 3 $$$$$---------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void printPat4(int n){
        System.out.println("Pattern 4 $$$$$---------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void printPat5(int n){
        System.out.println("Pattern 5 $$$$$---------");
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printPat6(int n){
        System.out.println("Pattern 6 $$$$$---------");
        //With this approach extra space is taken
        int m=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(j);
            }
            m-=1;
            System.out.println();
        }
    }
    public static void printPat7(int n){
        System.out.println("Pattern 7 $$$$$---------");
        //With this approach complexity is O(n2) is taken
       for(int i=0;i<n;i++){
           for(int j=1;j<2*n;j++){
               if(j == n || j >= n-i && j <= n+i){
                   System.out.print("*");
               }
              else{
                  System.out.print(" ");
               }
           }
           System.out.println();
       }
    }
    public static void printPat8(int n){
        System.out.println("Pattern 8 $$$$$---------");
        //With this approach complexity is O(n2) is taken
        for(int i=n-1;i>=0;i--){
            for(int j=1;j<2*n;j++){
                if(j == n || j >= n-i && j <= n+i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void printPat9(int n){
        System.out.println("Pattern 9 Diamond $$$$$---------");
        //With this approach complexity is O(n2 +n2) is taken
        for(int i=0;i<n;i++){
            for(int j=1;j<2*n;j++){
                if(j == n || j >= n-i && j <= n+i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--){
            for(int j=1;j<2*n;j++){
                if(j == n || j >= n-i && j <= n+i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void printPat10(int n){
        System.out.println("Pattern 10 Half Diamond Star Pattern $$$$$---------");
        //With this approach complexity is O(n2) is taken
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printPat1(n);
        printPat2(n);
        printPat3(n);
        printPat4(n);
        printPat5(n);
        printPat6(n);
        printPat7(n);
        printPat8(n);
        printPat9(n);
        printPat10(n);
    }
}
