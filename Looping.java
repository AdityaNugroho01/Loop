/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Looping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, n;
        Scanner Baca = new Scanner(System.in);
        System.out.print("Banyaknya suku =");
        n = Baca.nextInt();
        
        for (i=1; i<n; i=i+2){
            
            System.out.print(i+"Adalah bilangan ganjil");
            System.out.print((i+i)+"Adalah bilangan genap");
        }
        if (n%2 !=0)
            System.out.print(i+"Adalah bilangan ganjil");
        // TODO code application logic here
    }
    
}
