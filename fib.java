import java.util.Scanner;
public class fib{

    public static int fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }else{
            return fib(n-2) + fib(n-1);
        }
    }

    public static void main(String[] args){
       
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter n: ");
        int n = in.nextInt();
        // System.out.println(n);
        System.out.println("The first n Fibonacci number: ");
        for (int i = 1;i<=n;i++){
            System.out.print(fib(i) + "\t");
        }
        System.out.println();
    }
}
