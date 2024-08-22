package CoreTutorial;

public class NumberHandling {
    int mul;
    public void Table(int n){
        for(int i=1;i<=10;i++){
           mul=i*n;
           System.out.println(n + "*" + i+ "="+ mul);
        }
    }
    public int  SumOfNum(int n){
        int sum=0;
        while (n!=0){
            int d=n%10;
            sum=sum+d;
            n=n/10;
        }
        return  sum;
    }
    public int Factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
           fact = fact*i;
        }
        return fact;
    }
    public boolean Armstrong(int n){
        int sum=0;
        int rev=0;
        while(n!=0){
            int d=n%10;
            sum =sum +Integer.parseInt(String.valueOf(Math.pow(d,3)));
            rev= (d*10)+ rev;
            n=n/10;
        }
        System.out.println("Reverese of Number is "+ rev);
        if(sum== n)
            return true;
        else
            return false;
    }
    public void Reverse(int n){
        int rev=0;
        int m=n;
        while(n!=0){
            int d=n%10;
            rev=(rev*10)+d;
            n=n/10;
        }
        System.out.println("Reverse of Number is "+ rev);
        if(rev == m){
            System.out.println("Palindrome Number"+ m);
        }
    }
}
