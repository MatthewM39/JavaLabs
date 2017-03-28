import java.util.Scanner;


/**
 * Created by Matthew on 10/6/2015.
 */

public class Main {
    public static void main(String[] args){

    IntegerCount count1 = new IntegerCount();
        Scanner scan = new Scanner(System.in);
        int valScan;
        System.out.print("Enter numbers: ");
        do{
            valScan = scan.nextInt();
            count1.account(valScan);
        }
        while(scan.hasNextInt());

        count1.print();
    }

}
