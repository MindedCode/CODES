class Emp{
    int id;
    String name;
    int  salary;
    
    public void printDatails(){
        
        System.out.println("New Employee id is " + id + " " + " And name is " + name);
        System.out.println("Salary is "+ salary + " LPA ");
    }
    
}
public class Main{
    public static void main (String[] args) {
        Emp ad = new Emp();
        
        ad.id = 12;
        ad.name = "Adarsh Kumar";
        ad.salary = 13;
        
        
        // System.out.println("New Employee id is " + ad.id + " " + " And name is " + ad.name);

        Emp tim = new Emp();
        
        tim.id = 13;
        tim.name = " Tim Barucha";
        tim.salary = 34;
        
        ad.printDatails();
        tim.printDatails();
        
    }
}


Output of the program:

New Employee id is 12  And name is Adarsh Kumar
Salary is 13 LPA 

New Employee id is 13  And name is  Tim Barucha
Salary is 34 LPA 
