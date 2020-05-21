package datastructures;

import java.util.ArrayList;

public class Arrays {

    private int[] items;
    private int count = 0;
    private int i = 0;

    public Arrays(int length) {
        items = new int[length];
    }

    public void printArray() {
        for (i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

    public void insertElement(int item) {
        if (count >= items.length) {            
            int[] list = new int[items.length * 2];
            for (i = 0; i < items.length; i++) {
                list[i] = items[i];                
            }
            items=list;          

        }
        items[count] = item;
        count++;
//        } else {
//           int [] newArr = new int [items.length*2];
//           for
//        }      

    }

}
