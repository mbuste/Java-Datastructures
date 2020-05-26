package datastructures;

import java.util.ArrayList;

public class StackClass {

    int top = 0;
    ArrayList list = new ArrayList();

    public void push(int data) {
        list.add(data);
        top++;
    }

    public void show() {
        System.out.println(list.toString());
    }
    
    public ArrayList pop(){
        list.remove(top-1);
        top--;
        return list;
    }

}
