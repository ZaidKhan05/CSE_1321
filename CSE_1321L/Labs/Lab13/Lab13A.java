//==================================== Program Lab13A.java ======================================
/*
Class: CSE 1321L
Section: J51
Term: Spring
Instructor: Dmitri Nunes Dias Fernandes
Name: Zaid Khan
Lab# Lab 13A
 */
// Program Lab13A.java
//
import java.util.Scanner;

class buildingBlueprint{
    public int buildingNum;

    private int stories;

    private int aptNum;

    private float occRate;

    private boolean full;

    public buildingBlueprint(){
        stories = 10;
        aptNum = 20;
        occRate = 1.0f;
        full = true;
    }

    public buildingBlueprint(int story, int appartment, float occupancy){
        this.stories = story;
        this.aptNum = appartment;
        this.occRate = occupancy;

    }

    //setters
    //occupancy setter
    public void setOccupancy(float occupancy){
        this.occRate = occupancy;
        if(occRate == 1.0f)full = true;
        else full = false;
    }

    //getters
    //occupancy getter
    public int getOccupancy(){
        float occupancyx = (this.occRate*100);
        int occupancyPercent = (int)occupancyx;
        return occupancyPercent;
    }
    //occupancy getter
    public int getStories(){
        return this.stories;
    }
    //# of appartments getter
    public int getApt(){
        return this.aptNum;
    }
    //fill getter
    public boolean getFill(){
        return this.full;
    }
    public void printStats(){
        System.out.println("Building "+this.buildingNum+" has "+this.getStories()+" floors, "+this.getApt()+" apartments, and is "+this.getOccupancy()+"% occupied. Full? "+this.getFill());
    }


}
public class Lab13A
{
    public static void main (String[] args)
    {
        //e
        buildingBlueprint buildingOne = new buildingBlueprint();
        buildingBlueprint buildingTwo = new buildingBlueprint(30, 30, .75f);
        buildingOne.buildingNum = 1;
        buildingTwo.buildingNum = 2;
        System.out.println("Year 2020:");
        buildingOne.printStats();
        buildingTwo.printStats();
        System.out.println("Many years pass.\nYear 2043:");
        //e
        buildingOne.setOccupancy(0);
        buildingTwo.setOccupancy(1);
        //ee
        buildingOne.printStats();
        buildingTwo.printStats();

        System.out.println("Looks like people prefer taller buildings.");

    }
}
/*
Lab13A: The Architect.
Buildings can be built in many ways. Usually, the architect of the building draws up maps and
schematics of a building specifying the building’s characteristics such as how tall it is, how many stories
it has, etc. Then the actual building itself is built based on the schematics (also known as blueprints).
Now it is safe to assume that the actual building is based off the blueprint but is not the blueprint itself
(and vice versa).
The idea of a classes and objects follows a similar ideology. The class file can be considered the
blueprint and the object is the building following the analogy mentioned above. The class file contains
the details of the object i.e., the object’s attributes (variables) and behavior (methods).
Please keep in mind that a class is a template of an eventual object. Although the class has variables,
these variables lack an assigned value since each object will have a unique value for that variable.
Think of a form that you may fill out, for example, for a bank; this form has many boxes such as ones for
your first name, last name, etc. That form is analogous to a class; it’s generic and does not have any
unique information. Once someone picks up the form and fills it out it becomes unique to that person
and is no longer a generic form; this is analogous to an object.
For the one and only exercise in Lab 13, you will need to design a class and create objects from this
class in your main method. Please read and follow the instructions below carefully
To start, you need to create a class BuildingBlueprint, and it should have the following:
• Variables (Attributes):
o A variable that represents the number of stories the building has. This should be an
integer – must be private
o A variable that represents the number of apartments the building has. This should be an
integer – must be private
o A variable that represents the occupancy rate of the building (It contain numbers
between 0 and 1 representing the percentage of occupancy). This should be a float –
must be private
o A variable that indicates if the building is fully occupied (all the apartments have been
purchased) which is only becomes true if the variable for the occupancy rate is 1 and
changes back to false if the occupancy falls to any value below 1. This should be a
Boolean – must be private
• Constructors:
o A default constructor that when used creates a building object that has the following
default values:
10 Stories
20 apartments
Occupancy variable set to 100% (1.0)
Fully Occupied variable set to true
o Overloaded (Argument) Constructor that should accept any value for the number of
stories, number of apartments and occupancy percentage. This constructor should
only set the fully occupied variable to true if and only if the provided occupancy
percentage is 1.0 .
• Methods (Behavior)
o Getters and Setters for the occupancy rate variable
o Getter for the number of stories variable
o Getter for the number of apartments variable
o Getter for the Boolean value of full
 Page 3 of 3
Next, create class Lab13A with a main method or driver which should do the following:
• Create two building objects:
o buildingOne should be created using the default constructor
o buildingTwo should be created using the overloaded (argument) constructor with the
values provided:
30 Stories
30 apartments
Occupancy variable set to 75% (0.75) – you may have to cast to float
• You should then print out the information of buildingOne like the example shown below in the
sample using the getters
• You should then print out the information of buildingTwo like the example shown below in the
sample using the getters
• Use the Setter of the occupancy percentage of buildingOne to change its value to 0% (0.0)
• Use the Setter of the occupancy percentage of buildingTwo to change it to 100% (1.0)
Remember, the name of the class containing the main method should be Lab13A. Please make
sure that your two classes (Lab13A and BuildingBlueprint) are in the one file

Please keep in mind that everyone’s output should be the same and as shown below…
Sample (AND ONLY) output:
Year 2020:
Building 1 has 10 floors, 20 apartments, and is 100% occupied. Full? true
Building 2 has 30 floors, 30 apartments, and is 75% occupied. Full? false
Many years pass.
Year 2043:
Building 1 has 10 floors, 20 apartments, and is 0% occupied. Full? false
Building 2 has 30 floors, 30 apartments, and is 100% occupied. Full? true
Looks like people prefer taller buildings.
 */