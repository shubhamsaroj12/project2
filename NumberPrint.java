import java.util.*;

public class NumberPrint {
    public static int addNumber(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int sum=addNumber(a,b);
        System.out.print("Sum of Two Number:"+sum);


    }
    
}
