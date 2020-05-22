package datastructures;

public class DataStructures {
    
    public static void main(String[] args) {
        ArraysBuild num = new ArraysBuild(3);
        num.insertElement(10);
        num.insertElement(20);
        num.insertElement(30);
        num.insertElement(40);
        
//        num.removeAt(1);
        System.out.println(num.indexOf(100));
        num.printArray();

        LinkedListBuild list = new LinkedListBuild(10);
        list.addFirst(10);
        list.addLast(20);

    }
}
