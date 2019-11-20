package array.array_1D;

public class Main {

    public static void main(String[] args) {
        System.out.println("Creating a blank array of size 10...");
        Array_1D arr = new Array_1D(10);

        System.out.println("Printing the Array...");
        arr.traverseArray();
        System.out.println();System.out.println();

        System.out.println("Inserting few values in the array...");
        arr.insert(0,0);
        arr.insert(1,10);
        arr.insert(2,20);
        arr.insert(3,30);
        arr.insert(4,40);
        arr.insert(5,50);
        arr.insert(6,60);
        arr.insert(7,70);
        arr.insert(8,80);
        arr.insert(1,100);
        arr.insert(12,120);
        System.out.println();System.out.println();

        System.out.println("Printing the Array...");
        arr.traverseArray();
        System.out.println();System.out.println();

        System.out.println("Accessing cell number#1...");
        arr.accessingCell(1);
        System.out.println();System.out.println();

        System.out.println("Accessing cell number#5...");
        arr.accessingCell(5);
        System.out.println();System.out.println();

        System.out.println("Accessing cell number#15...");
        arr.accessingCell(15);
        System.out.println();System.out.println();

        System.out.println("Searching 30 in the array...");
        arr.searchInAnArray(30);
        System.out.println();System.out.println();

        System.out.println("Searching 400 in the array...");
        arr.searchInAnArray(400);
        System.out.println();System.out.println();

        System.out.println("Deleting value from Cell#3 of array...");
        System.out.println("Before Deleting: ");
        arr.traverseArray();
        arr.deleteValueFromArray(3);
        System.out.println();
        System.out.println("After Deleting: ");
        arr.traverseArray();
        System.out.println();System.out.println();System.out.println();

        System.out.println("Deleting value from Cell#15 of array...");
        System.out.println("Before Deleting: ");
        arr.traverseArray();
        arr.deleteValueFromArray(15);
        System.out.println("After Deleting: ");
        arr.traverseArray();
        System.out.println();System.out.println();System.out.println();

        arr.deleteThisArray();
        System.out.println("After Deleting: ");
        arr.traverseArray();
    }

}
