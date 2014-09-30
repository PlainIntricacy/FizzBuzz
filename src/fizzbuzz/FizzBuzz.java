/*  The famous FizzBuzz interview code test.
    Based on a traditional English children's game
Objective:
    Print the first 100 numbers (1 to 100) in the following manner:
    For multiples of 3, print "Fizz" instead of the number
    For multiples of 5, print "Buzz" instead of the number
    For multiples of 3 AND 5, print "FizzBuzz" instead of the number
*/

package fizzbuzz;

/**
 * @author todyerutz @ plainintricacy.wordpress.com
 */
public class FizzBuzz {

    public static void main(String[] args) {
        
        for(int i=1; i<=100; i++){
            if(i%3==0){
                if(i%5==0){
                    System.out.println("FizzBuzz");
                }else{
                    System.out.println("Fizz");
                }
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
        
    }
    
}
