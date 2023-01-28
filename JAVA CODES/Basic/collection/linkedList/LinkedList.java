// use doubly Linked list

import java.util.LinkedList;
public class Main
{
	public static void main(String[] args) {
	    LinkedList <String> name = new LinkedList<String>();
	    
	    name.add("Mainded");
	    name.add("Code");
	    name.add("Tony");
	    name.add("Howard");
	    name.add("Stark");
	    name.add("Stark\n");
	    
	        	System.out.println(name);
	    
	    name.remove(4);
 	    
 	    
	        	System.out.println("After remove : \n" + name);
	}
}


// Output is:
// Array list and linked output is same.
// but diff :
// arraylist is slow speed 
// and LinkedList is fast speed

[Mainded, Code, Tony, Howard, Stark, Stark
]
After remove : 
[Mainded, Code, Tony, Howard, Stark
]
