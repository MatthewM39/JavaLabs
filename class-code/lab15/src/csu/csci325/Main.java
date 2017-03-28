package csu.csci325;

public class Main {

    public static void main(String[] args) {
	    System.out.println(factorial(3));
        System.out.println(factorial(5));
        TowersOfHanoi th = new TowersOfHanoi(3);
        System.out.println("number of moves:" + th.solve());
    }

    public static int factorial(int num) {
        if (num == 1) {return num;}
        return num * factorial(num - 1);
    }
}
