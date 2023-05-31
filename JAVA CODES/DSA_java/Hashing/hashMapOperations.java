/******************************************************************************

                            HashMap 
                            
                    1.    GetKey value 
                    2.    Remove operations HashMap 0(1)
                    3.    containsKey(key:"value");
                    4.    get size HashMap
                    5.    check isEmpty HashMap()
                    6.    only print keys
                    7.    print key and value both 
                    8.   print pair HashMap 
                        

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    HashMap<String, Integer> hm = new HashMap<>();
	    
	    
	    //insert the key and value
	    hm.put("Adarsh", 10);
	    hm.put("Rahul", 20);
	    hm.put("Shobhit",30);
	    hm.put("Kohli",40);
	    
	    //GetKey value 
	    System.out.println(hm.get("Adarsh"));       //true return value of Adarsh
	    System.out.println(hm.get("Mindedcode")); //false   //no exist value then return null
	    
	    //Remove operations HashMap 0(1)
	    System.out.println(hm.remove("Rahul")); 
	    System.out.println(hm.remove("Pal"));  //no exist value then return null
	    
	    //containsKey(key:"value");
	    System.out.println(hm.containsKey("Adarsh")); //true
	    System.out.println(hm.containsKey("Subham")); //false;
	    
	    //get size HashMap
	    System.out.println(hm.size()); //True
	    
	    //check isEmpty HashMap()
	    System.out.println(hm.isEmpty()); // if HashMap is isEmpty then return true
	    
	    // only print keys
	    Set<String> keys = hm.keySet();
	    System.out.println(keys + " \n");
	    
	    //print key and value both 
	    for(String k:keys){
	        System.out.print(k + " => " + hm.get(k) +", ");
	    }
	    
	    //print pair HashMap 
	    System.out.println("\n\n"+hm.entrySet() + " \n");
	}
}



"Output of the program: "
 10
null
20
null
true
false
3
false
[Adarsh, Kohli, Shobhit] 

Adarsh => 10, Kohli => 40, Shobhit => 30, 

[Adarsh=10, Kohli=40, Shobhit=30]
