/**
 *  Name: Aidan Tesch
 *  Period: 6
 *  Date: 9/10/2024
 */

import java.util.Scanner;

public class PaintCalculator
{
    public static void main(String[] args)
    {
      // Scanning for Inputs
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter The Length of the Room: ");
      int length = scan.nextInt();
      System.out.print("Enter the Width of the Room: ");
      int width = scan.nextInt();
      System.out.print("Enter number of Windows in the Room: ");
      int windows = scan.nextInt();
      System.out.print("Enter the number of Doors in the Room: ");
      int doors = scan.nextInt();
      System.out.print("Enter the Price per Gallon of Paint: ");
      double PPG = scan.nextDouble();
      System.out.println("");
      String enter = scan.nextLine();
      System.out.print("Press Enter to Continue...");
      scan.nextLine();
      System.out.println("");
      
      // Calculations
      int wallArea = ((length*10)*2 + (width*10)*2)-(windows*6 + doors*18);
      double paintRequired = (double)wallArea/250;
      int fiveGallons = (int)paintRequired/5;
      int oneGallons = (int)Math.ceil(paintRequired)%5;
      
      // Final Output
      System.out.println("Wall Area: " + wallArea + " square feet");
      System.out.println("Paint Needed: " + paintRequired + " gallons");
      System.out.println("5 Gallon Can(s): " + fiveGallons);
      System.out.println("1 Gallon Can(s): " + oneGallons);
      System.out.println("Cost of Paint: $" + ((fiveGallons*PPG)*5 + (oneGallons*PPG)));
    }
