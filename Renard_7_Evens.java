//code for finding the evens between 1 and 100
package renard_7_evens;

public class Renard_7_Evens {
     public static void main(String[] args) {
        //what happens in the loop, 
        //will happen again and again
        //until the loop exits
        int counter = 0;
        for(int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                //counter += 1;
                System.out.println(i + " Is Prime");
            }
        }
        System.out.println(" We have " + counter + " total evens ");
    }
     /* A method is like a little program,
     A method is an action that you want to repeat frequently
     */
    static boolean isEven (int somenumber) {
        return (somenumber % 2 == 0);
     }
    static boolean isOdd (int someNumber) {
        return (someNumber % 2 != 0);
     }
    static boolean isPrime (int Somenumber) {
        int divisor = 0;
        for(int i = 2; i < Somenumber; i++) {
            if (Somenumber % i == 0) {
                divisor += 1;
            }
        }
    if(divisor == 0){    
        return true;
    }
    }    
