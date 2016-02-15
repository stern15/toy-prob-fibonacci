/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;
/**
 *
 * @author semasuka
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1=0;
        int n2=1;
        int n3;
        int count=10;
        System.out.println("the initial numbers are:"+n1+" "+n2);
        for(int i=2;i<=count;i++){
        n3=n1+n2;
        System.out.print(" "+n3);
        n1=n2;
        n2=n3;
        
        }
        
    }
    
}
