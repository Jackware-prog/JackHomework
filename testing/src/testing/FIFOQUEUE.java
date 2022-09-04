/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author uSER
 */
public class FIFOQUEUE implements IQueuable {
    
    public String theitem;
    public String[] thequeue = new String[0];
    public String[] temporaryqueue;
    public int i = 1;
    
    
    @Override
    public String[] enqueue(String item) {
        temporaryqueue = new String[i];
        if(thequeue.length == 0){
            temporaryqueue[i-1] = item; 
        }else{
            for(int x = 0; x < thequeue.length; x++){
                temporaryqueue[x] = thequeue[x];
            }
            temporaryqueue[i-1] = item;
        }
        thequeue = temporaryqueue;
        i++;
        return thequeue;
    }

    @Override
    public  String dequeue() {
        String deleted;
        if(thequeue.length !=0){
            temporaryqueue = new String[i-2];
            for(int y = 1; y < thequeue.length; y++){
                temporaryqueue[y-1] = thequeue[y];
            }
            deleted = thequeue[0];
        }else{
            deleted = "empty array";
        }
        i--;
        thequeue = temporaryqueue;
        return deleted;
    }

    @Override
    public String[] getQueue() {
        return thequeue;
    }

    @Override
    public Number size() {
        return thequeue.length;
    }
    
    public static void main(String[] args){
        FIFOQUEUE fifo = new FIFOQUEUE();
        fifo.enqueue("jack");
        fifo.enqueue("hello");
        fifo.enqueue("bye");
        System.out.println(Arrays.asList(fifo.getQueue()));
        System.out.println(fifo.size());
        System.out.println(fifo.dequeue());
        System.out.println(Arrays.asList(fifo.getQueue()));
        System.out.println(fifo.dequeue());
        System.out.println(Arrays.asList(fifo.getQueue()));
        System.out.println(fifo.dequeue());
        System.out.println(Arrays.asList(fifo.getQueue()));
        System.out.println(fifo.dequeue());
        System.out.println(fifo.dequeue());
    }
    
}
