package csu325;

/**
 * Created by Matthew on 10/28/2015.
 */
public class ArrayList implements List {

    // initially the current and max size of the array are 0
    private int currentSize = 0, maxSize = 0;
    private Object[] myArray;



    @Override
    public Object get(int index) {
        // return the value of the array at the index if the index is smaller than the array size
        if(index < maxSize && index > -1){
            return myArray[index];
        }
        System.out.println("You tried to access a value outside of the array.");
        return 0;
    }

    @Override
    public void add(Object obj) {
        if(currentSize >= maxSize){ // check if the current size exceeds the limit size
            if(maxSize != 0) { // under normal circumstances, the maxSize doubles
                maxSize *= 2;
            }
            else{
                maxSize = 1; // initially set maxSize to 1
            }
            Object[] tempArray = new Object[maxSize]; // declare a temp array
            for (int i = 0; i < currentSize; i++){
                tempArray[i] = myArray[i]; // set the values of the old array to the new one
            }
            myArray = tempArray; // get rid of the old array

        }
        myArray[currentSize] = obj; // add the current object to the end of the array
        currentSize++; // increment current size
    }

    @Override
    public int size() {
        return currentSize;
    }
}
