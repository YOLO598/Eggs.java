Eggs.java
/*
*EggBoxes.java
*@author Seán
*4th October 2012
*/

public class Eggs{
//declare data members
private int eggs;
private int boxes;
private int leftovers;
private int totalBoxes;
private int totalLeftovers;

//constructor
public Eggs(){
eggs = 0;
boxes = 0;
leftovers = 0;
}

//set method - one for every input variable
public void setEggs(int eggs){
this.eggs = eggs;
}

//compute method
public void computeBoxes(){
boxes = eggs / 12;
totalBoxes = boxes;
}

public void computeLeftovers(){
leftovers = eggs - (eggs / 12);
totalLeftovers = leftovers;
}

//get method(s)
public int getBoxes(){
return boxes;
}

public int getLeftovers(){
return leftovers;

}
}
