/*
*EggsApp.java
*@author Seán
*4th October 2012
*/

import java.util.Scanner;
public class EggsApp{
public static void main(String args[]){
//declare variables
int eggs, boxes, leftovers;

//declare objects
Scanner keyboard;
Eggs myEggs;

//create objects
keyboard = new Scanner(System.in);
myEggs = new Eggs();

//input
System.out.println("Pleaser the amount of eggs you have");
eggs = keyboard.nextInt();
myEggs.setEggs(eggs);

//process
myEggs.computeBoxes();
myEggs.computeLeftovers();

//output
Boxes = myEggs.getTotalBoxes;
System.out.println("Theer of boxes required is"+boxes);
Leftovers = myEggs.getTotalLeftovers;
System.out.println("Theer of eggs leftover is"+leftovers);

}

}
