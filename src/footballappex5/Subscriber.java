/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballappex5;

/**
 *
 * @author keepa
 */
public class Subscriber implements ScoreListener{
    
    @Override
    public void scoreChange(ScoreEvent e){
    System.out.println("live result:"+e.getSomeData());} 
}
