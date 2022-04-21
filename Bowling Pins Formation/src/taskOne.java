import java.util.Scanner;
/**    Bowling Pin Example
 *  n = 1             *             total = 1
 *  n = 2           *   *           total = 3
 *  n = 3         *   *   *         total = 6
 *  n = 4       *   *   *   *       total = 10
 *  n = 5     *   *   *   *   *     total = 15
 */
public class taskOne {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("  ");
        System.out.println("\t\tBowling Pin Formation Organizer!\n");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number of rows: ");
        int n = in.nextInt();
    // For loop will just be updating count for the total sum 
        for(int i=1; i<=n; i++){
            count = count + bowlingPinsPerRow(i);
        }
          System.out.print("\nTotal number of pins up to the " +n+"th row is: "+count+" ");
    }

    public static int bowlingPinsPerRow(int n){
        if(n==0){
            return 0;
        }
        else {
            return n;
        }
       
    }
}




