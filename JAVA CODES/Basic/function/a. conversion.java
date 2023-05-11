// **********************************************
//       BYTE CONVERSION  --- > RETURN VALUE BYTE TYPE
//       BOOLEAN CONVERSION --> RETURN VALUE BOOLEAN TYPE
//       INT CONVERSION ------> RETURN VALUE INTEGER TYPE
//       DOUBLE CONVERSION ---> RETURN VALUE DOUBLE TYPE
//       STRING CONVERSION --->  STRING 
//       LONG ---------------->  LONG TYPE
// **********************************************


byte fun(int a, double b, float c, boolean d, long e) {
    byte result = (byte) (a + b + c + (d ? 1 : 0) + e);
    return result;
}

public static void main(String[] args) {
    int a = 2;
    double b = 2.0;
    float c = 2.0f;
    boolean d = true;
    long e = 2L;

    byte output = fun(a, b, c, d, e);
    System.out.println(output);
}


Output of the program:
// In this example, the variables a, b, c, d, and e are set to the value 2. 
// The fun method is called with these values, and the resulting byte value is 
// stored in the output variable. Finally, the output value is printed, which would 
// be the sum of all the variables (2 + 2.0 + 2.0 + 1 + 2 = 9). Therefore, the output would be 9.
