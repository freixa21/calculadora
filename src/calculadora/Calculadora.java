package calculadora;

import java.util.Scanner;

public class Calculadora {
    
    Scanner in = new Scanner(System.in);
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, irrellevant1, irrellevant2;
        
        System.out.print("Digues un número (A): "); a = in.nextInt();
        System.out.print("Digues un altre número (B): "); b = in.nextInt();
        
        System.out.println("El número A més el número B és: " + (a + b));
        System.out.println("El número A menys el número B és: " + (a - b));
    }
    
}
