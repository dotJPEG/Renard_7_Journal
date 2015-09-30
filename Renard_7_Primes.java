package renard_7_primes;

/**
 * @author dotJPEG
 * @author Bob Renard
 */
public class Renard_7_Primes {

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            if(i % 2 ==0 && i == 2) {
                System.out.println(i + " is prime");
            }else{
                if(i % 3 ==0 && i == 3) {
                    System.out.println(i + " is prime");
                }else{
                    if(i % 5 ==0 && i == 5) {
                        System.out.println(i + " is prime");
                    }else{
                        if(i % 7 ==0 && i == 7) {
                            System.out.println(i + " is prime");
                        }else{
                            System.out.println(i + " Is prime");
                            
                        }
                    }
                }
                
            }
        }
    }
    }
        /* % checks for the remainder
        i % 2 checks if a number is even or odd */
        // a number value for char
        // maps to a character
            /*
            int j = 2;
            boolean result = true;
            for(int i = 1; i < 100; i++) {
            j=2;
                result = true;
            while(j<= i / 2){
                if(i%j==0){
                    result = false;
                }
                j++;
            }
            if(result = true){
                System.out.println(i + " is prime");                           
                }else{
                System.out.println(i + " isnt prime");
            }
            
            }
    }
}
             
                
            
        
           
    }
    static boolean isntPrime (int somenumber){
        return (somenumber % 2 == 0);
    }
    
}
*/
//asdf