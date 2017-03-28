package csu.csci325;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hash<Integer, Employee> hashTable = new HashingWithChaining<>();
        Employee emp1 = new Employee("John", "Doe", "USA", 123456789);
        hashTable.put(123456789, emp1);
        hashTable.put(123465789, new Employee("Jane", "Doe", "USA", 123456789));

        System.out.println(hashTable.get(123456789));
        System.out.println(hashTable.get(123465789));
    }
}
