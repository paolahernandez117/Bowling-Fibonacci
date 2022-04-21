import java.util.Scanner;
public class taskTwo {
    public static void main(String[] args) {
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
    // For loop will display for the user the numbers so far up to the input number.
        for(int i=1; i<=n; i++){
            System.out.print(evenFibonacciSum(i)+" ");
            // Checks even number is even and if it is then adds it to count.
            if (evenFibonacciSum(i)%2 ==0)
              count = count + evenFibonacciSum(i);
        }
          System.out.print("\nWhen we get all the even number/numbers up to " +n+"th fibunacci number and add it up the sum is: "+count+" ");
    }
// This will give us the Fibonacci numbers up to our input number. 
    public static int evenFibonacciSum(int n){
        if(n==1){
            return 1;
        }
        else if(n == 2){
            return 1;
        } 
        else {
            return evenFibonacciSum(n-2)+evenFibonacciSum(n-1);
        }
       
    }
      
}
