/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harsh
 */
public class Queue {
    private LINKED s;
    
    public Queue(int size){
        s = new LINKED();
    }
    
    public boolean isEmpty(){
        return s.lengthIs()==0;
    }
    
    public int sizeIs(){
        return s.lengthIs();
    }
    
    public void enqueue(String srg){
        s.addToTail(srg);
    }
    
    public String peek(){
        if(isEmpty())
            return null;
        else{ 
            return s.getNext();}
    }
    
    public String dequeue(){
        if(isEmpty())
            return null;
        return s.deleteFromHead();
    }
}
