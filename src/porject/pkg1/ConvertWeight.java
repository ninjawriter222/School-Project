/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porject.pkg1;

import java.util.Scanner;
/**
 *
 * @author MasterCraft Computer
 */
public class ConvertWeight 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    System.out.println();
    System.out.println("This program calculates the area of a circle");
        
    System.out.println("\nPlease enter name:");
    Scanner inFile;
    inFile = new Scanner(System.in);
    String name = inFile.nextLine();
    System.out.println("\nEnter the radius:");
    double radius = inFile.nextDouble();
    double area = radius * radius * 3.14;
    System.out.println("\n******************************************"
                        +"*********************");
    System.out.println("\t" + name
                        + ", The area is " + area
                      );
    System.out.println("********************************************"
                        + "********************");
    
    }
    
}
