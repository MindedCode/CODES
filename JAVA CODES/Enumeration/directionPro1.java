    /*
    enumeration
    */

public class Main
{
    // create enumeration 
    enum Direction{
        East, West, North, South
    }
    
    
	public static void main(String[] args) {
	    
	    // Declare a variable of type of Direction (DateType-int, float, double)
	   // and  Instantiate  the enum Direction (DtaTy)
	   
	    Direction dir = Direction.East;
	    Direction dir1 = Direction.West;
	    Direction dir2 = Direction.South;
	    Direction dir3 = Direction.North;
	    
	   // but Instantiate the enum Direction
	   // dir= Direction.East;
	    
		System.out.println("Value: " + dir);
		System.out.println("Value: " + dir1);
		System.out.println("Value: " + dir2);
		System.out.println("Value: " + dir3);
	}
}


// output of the Program
// Value: East
// Value: West
// Value: South
// Value: North

