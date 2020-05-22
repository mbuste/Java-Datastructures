package datastructures;

import java.util.*;

public class ArraysBuild {

    private int[] items;
    private int count = 0;
    private int i = 0;

    public ArraysBuild(int length) {
        items = new int[length];
    }

    public void printArray() {
        System.out.println(Arrays.toString(items));
    }

    public void insertElement(int item) {
        if (count >= items.length) {
            int[] list = new int[items.length + 1];
            for (i = 0; i < items.length; i++) {
                list[i] = items[i];
            }
            items = list;

        }
        items[count] = item;
        count++;
    }

    public void removeAt(int index) {
        boolean deleted = false;
        if (index < 0 || index >= items.length) {
            System.out.println("index out of bounds");
        } else {
            int[] list = new int[items.length-1];
            for (i = 0; i < list.length; i++) {
                if (i == index) {
                    list[i] = items[i + 1];
                    deleted = true;
                } else if (deleted) {
                    list[i] = items[i + 1];
                } else {
                    list[i] = items[i];
                }
            }
            items = list;
        }
    }
    
    public int indexOf(int num){
       int ou =-1;
        for(i=0; i<items.length; i++){
            if(items[i]==num){
               ou= i;
               break;
            } 
        }
return ou;
    }

}
