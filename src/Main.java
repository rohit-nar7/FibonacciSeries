import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int firstN = 0;
        int secondN = 1;
        int temp = 0;
        System.out.println("Fibonacci series till "+n+" is :");
        System.out.print(firstN+" ");

        while(temp <= n) {

             temp = secondN;
             secondN += firstN;
             firstN = temp;

            System.out.print(temp + " ");



        }




    }
}