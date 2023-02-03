
//Program which implement the concept of Encapsulation.

package hackerrank_Solution;

//private variables declared
//these can only be accessed by public methods of class


class Encapsulate{
private String Name;
private int Roll;
private int Age;


//get methods for age, name and roll
//to access private variables


public int getAge(){return Age;}
public String getName(){return Name;}
public int getRoll(){return Roll;}



//set methods for age, name and roll
//to access private variable Age
public void setAge(int newAge){Age=newAge;}

public void setName(String newName){Name=newName;}
public void setRoll(int newRoll){Roll=newRoll;}}

public class TestEncapsulation {

	public static void main(String[] args) {
		Encapsulate obj = new Encapsulate();
		// setting values of the variables
		obj.setName("Rohit");
		obj.setAge(21);
		obj.setRoll(5527);
		// Displaying values of the variables
		System.out.println("Student's name: " +

		obj.getName());

		System.out.println("Student's age: " + obj.getAge());
		System.out.println("Student's roll: " +

		obj.getRoll());
		// Direct access of Roll is not possible
		// due to encapsulation
		// System.out.println("Student's roll: " + obj.Name);
		}
		

}


