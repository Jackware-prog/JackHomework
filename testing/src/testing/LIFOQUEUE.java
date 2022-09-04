/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testing;

import java.util.Arrays;

/**
 *
 * @author uSER
 */
public class LIFOQUEUE implements IQueuable {
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
        if(thequeue.length != 0){
            temporaryqueue = new String[i-2];
            for(int y = 0; y < thequeue.length-1; y++){
                temporaryqueue[y] = thequeue[y];
            }
            deleted = thequeue[thequeue.length-1];
        }else{
            deleted = "empty array";
        }
        thequeue = temporaryqueue;
        i--;
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
        LIFOQUEUE lifo = new LIFOQUEUE();
        lifo.enqueue("jack");
        lifo.enqueue("hello");
        lifo.enqueue("bye");
        System.out.println(Arrays.asList(lifo.getQueue()));
        System.out.println(lifo.size());
        System.out.println(lifo.dequeue());
        System.out.println(Arrays.asList(lifo.getQueue()));
        System.out.println(lifo.dequeue());
        System.out.println(Arrays.asList(lifo.getQueue()));
        System.out.println(lifo.dequeue());
        System.out.println(Arrays.asList(lifo.getQueue()));
        System.out.println(lifo.dequeue());
        System.out.println(lifo.dequeue());
    }
    
}
