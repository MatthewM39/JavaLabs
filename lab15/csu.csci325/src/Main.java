/**
 * Created by Matthew on 11/11/2015.
 */
public class Main {
    public static void  main (String args[]){
        DivisorCalc myCalc = new DivisorCalc();

        // testing for the first case where num1>num2 and num1%num2 is 0.
        System.out.println("GCD of 20 and 5: " + myCalc.gcd(20,5));

        // testing for when num1 < num2
        System.out.println("GCD of 5 and 20: " + myCalc.gcd(5, 20));

        // testing for situations where neither num1 nor num2 are factors of each other
        System.out.println("GCD of 5 and 6: " + myCalc.gcd(5,6));

        // testing for the same number
        System.out.println("GCD of 20 and 20: " + myCalc.gcd(20,20));

    }
}
