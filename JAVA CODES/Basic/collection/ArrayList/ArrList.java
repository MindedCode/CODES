// use internal array Data Structure
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    ArrayList <String> name = new ArrayList<String>();
	    
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
[Mainded, Code, Tony, Howard, Stark, Stark
]
After remove : 
[Mainded, Code, Tony, Howard, Stark
]
