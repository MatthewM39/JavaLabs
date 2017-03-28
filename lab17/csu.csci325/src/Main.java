/**
 * Created by Matthew on 11/23/2015.
 */
public class Main {

    public static void main(String[] args) {

        Hash<Integer, Employee> hashTable = new HashingWithChaining<>();

        // test the initial size
        System.out.println("Initial size: " + hashTable.size());

        // add an employee and test the new size
        Employee emp1 = new Employee("John", "Doe", "USA", 123456789);
        System.out.println("Adding employee: " + emp1.toString());
        hashTable.put(123456789, emp1);
        System.out.println("New size: " + hashTable.size());

        // add another employee and check size
        hashTable.put(123465789, new Employee("Jane", "Doe", "USA", 123456789));
        System.out.println("\nAdding second employee \nNew Size: " + hashTable.size());

        // attempt to access both employees
        System.out.println("\nAccessing both employees.");
        System.out.println(hashTable.get(123456789));
        System.out.println(hashTable.get(123465789));

        // attempt to access an unused key
        System.out.print("\nAttempting to access with unused key 987654321 : ");
        System.out.print(hashTable.get(987654321));


    }
}
