/******************************************************************************

                            Nested Loop Pattern

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    for(int i=1; i<4; i++){
	        for(int j=1; j<4; j++){
	            for(int k=1; k<4; k++){
	                for(int l=1; l<4; l++){
	                    for(int m=1; m<4; m++){
	                        System.out.print(i);
	                    }
	                    System.out.println();
	                }
	                System.out.println();
	            }
	           // System.out.println();
	        }
	       //System.out.println();
	    }
		System.out.println("Hello World");
	}
}


****//Output of the Program://****
  
111
111
111

111
111
111

111
111
111

111
111
111

111
111
111

111
111
111

111
111
111

111
111
111

111
111
111

222
222
222

222
222
222

222
222
222

222
222
222

222
222
222

222
222
222

222
222
222

222
222
222

222
222
222

333
333
333

333
333
333

333
333
333

333
333
333

333
333
333

333
333
333

333
333
333

333
333
333

333
333
333

Hello World
