package datastructures;

public class DataStructures {

    public static void main(String[] args) {
        ArraysBuild num = new ArraysBuild(3);
        num.insertElement(10);
        num.insertElement(20);
        num.insertElement(30);
        num.insertElement(40);
        
        num.deleteElementatIndex(1);
        num.printArray();
    }
}
