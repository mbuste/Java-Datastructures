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
    
    public ArrayList pop() throws Exception{
        list.remove(top-1);
        top--;
        return list;
    }
    
    public boolean isEmpty(){
        if(top==0){
            return true;
        }else{
            return false;
        }
    }
    
    public int peek(){
        return (int) list.get(top-1);
    }

}
