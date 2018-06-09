/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array7;

/**
 *
 * @author devkalra
 */
public class Array7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int temp;
        int arr[] = new int[8];
        arr[0]=1;
        arr[1]=1;
        arr[1]=1;
        arr[1]=1;
        arr[1]=0;
        arr[1]=0;
        arr[1]=1;
        arr[1]=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i+1]>arr[i])
            {
            } 
            else {
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
