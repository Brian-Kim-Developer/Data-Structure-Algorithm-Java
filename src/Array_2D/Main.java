package Array_2D;

public class Main {
    public static void main(String[] args) {

        System.out.println("Creating a blank array of size 5X5...");
        Array_2D arr = new Array_2D(5,5);
        arr.traverseArray();

        arr.insertValueInTheArray(0,2,1000000001);
        arr.traverseArray();

        arr.insertValueInTheArray(0,2,1000000001);
        arr.traverseArray();

        arr.accessSingleCell(0,2);
        arr.accessSingleCell(6,2);
        arr.accessSingleCell(2,2);

        arr.searchingSingleValue(10);
        arr.searchingSingleValue(-2147483648);
        arr.searchingSingleValue(1000000001);

        arr.deleteValuefromArray(0,2);
        arr.traverseArray();

        arr.deleteThisArray();
        arr.traverseArray();

    }
}
