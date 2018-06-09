/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrong;

/**
 *
 * @author devkalra
 */
import static java.lang.Double.sum;
import java.util.Scanner;
public class ArmStrong {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int n,rem,cube,sum=0,num;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        num=n;
    while(num>0)
    {
        rem=num%10;
        cube=rem*rem*rem;
        sum=sum+cube;
        num=num/10;
    }
    if(sum==n)
    {
        System.out.print("Armstrong");
    }
    else
    {
        System.out.print("Not a armstrong number");
    }
    
}
}
