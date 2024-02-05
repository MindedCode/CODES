package day35.bari.re;
import java.util.Scanner;

import javax.xml.stream.events.EntityReference;

// import day34.bari.re.string;

/**
 * MultiCalc
 */
public class MultiCalc {
    static double calculator(String op, double op1, double op2){

        switch(op) {
            case "ADD": return op1+op2;
            case "DIFF": return op1-op2;
            case "MULTI": return op1*op2;  //product
            case "DIVIDE": return op1/op2; //ratio
            case "modulo": return op1%op2;        

            default: return -1;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first operation name in string, u perform like.: ");
        String operation = sc.nextLine();
        
        System.out.println("Enter the first operator: ");
        double op1 = sc.nextDouble();

        System.out.println("Enter the Second operator: ");

        double op2 = sc.nextDouble();


        operation = operation.toUpperCase();

        double result = calculator(operation, op1, op2);
        System.out.println("This result: "+result);

        sc.close();
    }
}