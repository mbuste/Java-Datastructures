package datastructures;

/**
 *
 * @author Moses
 */
public class LinkedListBuild {
    private Node first;
    private Node last;
    
    public class Node{
        private Node next;
        private int value;
        
        public Node(int value){
            this.value= value;            
        }
        
        public void setValue(int value){
            this.value= value;            
        }
        
        public void setNext(Node node){
            this.next= node;            
        }
        
        public void Node(int value, Node node){
            this.value= value;            
            this.next= node;            
        }      
        
}
    
    
}
