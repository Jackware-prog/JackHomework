/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package testing;

/**
 *
 * @author uSER
 */
public interface IQueuable {
    public String[] enqueue(String item);
    public String dequeue();
    public String[] getQueue();
    public Number size();
}
