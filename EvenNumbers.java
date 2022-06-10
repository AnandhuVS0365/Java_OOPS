/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package even.numbers;

/**
 *
 * @author sjcet
 */
public class EvenNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("list of even numbers from 1 to 50");
        for(int i=1;i<=50;i++)
        {
            if(i%2==0)
                System.out.println(i);
        }
        // TODO code application logic here
    }
   
    
}
