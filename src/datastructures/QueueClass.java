/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.ArrayList;

/**
 *
 * @author Moses
 */
public class QueueClass {

    ArrayList list = new ArrayList();
    int end = 0;

    public void insert(int data) {
        list.add(data);
        end++;
    }
    
    public void printQueue(){
        System.out.println(list.toString());
    }
    
    public int peek(){
        return (int) list.get(0);
    }
}
