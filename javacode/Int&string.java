// Java program to illustrate creating
// an array of objects
/****// This is access integer number and sting (name) java program/**** 
 
class Student1
{
	public int roll_no;
	public String name;
	Student1(int roll_no, String name)
	{
		this.roll_no = roll_no;
		this.name = name;
	}
}

// Elements of the array are objects of a class Student.
public class Main
{
	public static void main (String[] args)
	{
		// declares an Array of integers.
		Student1[] arr;

		// allocating memory for 5 objects of type Student.
		arr = new Student1[5];

		// initialize the first elements of the array
		arr[0] = new Student1(1,"aman");

		// initialize the second elements of the array
		arr[1] = new Student1(2,"vaibhav");

		// so on...
		arr[2] = new Student1(3,"shikar");
		arr[3] = new Student1(4,"dharmesh");
		arr[4] = new Student1(5,"mohit");

		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : " +
						arr[i].roll_no +" "+ arr[i].name);
	}
}
