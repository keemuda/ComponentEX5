/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballappex5;
import java.util.Scanner;
/**
 *
 * @author keepa
 */
public class FootBallAPPex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ScoreSoure scoresoure = new ScoreSoure();
        Subscriber subber = new Subscriber();
        scoresoure.addSubscriber(subber);
        scoresoure.addSubscriber(subber);
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter Score: ");
           String str = sc.nextLine(); 
           if(!str.equals("")){
            scoresoure.setScoreLine(str);}
           else{break;}
        
        }
    }
    
}
