/**
 * Created by Matthew on 11/11/2015.
 */
public class DivisorCalc {

    public static int gcd(int num1, int num2){


        // if num2 <= num1 and num1%num2 is zero, return num2
        if (num2 <= num1 && (num1 % num2) == 0){
            return num2;
        }

        // if num1 is smaller than num2, recursively call gcd while passing num1 and num2 in the opposite positions
        else if (num1 < num2){
            return gcd(num2, num1);
        }

        // otherwise, call gcd with num2 and the remainder of num1/num2
        else{
            return gcd(num2, (num1%num2));
        }


    }

}
