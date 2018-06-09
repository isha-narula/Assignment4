/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package even1;

/**
 *
 * @author devkalra
 */
import java.util.Scanner;
public class Even1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        sc.close();
        for(int i=2;i<n;i=i+2)
        {
            System.out.println(i);
        }
    }
    
}
