class phoneFunc{
    public void ring(){
        System.out.println("Phone ringing");
    }
    public void call(){
        System.out.println("Phone calling");
    }
    public void callFri(){
        System.out.println("Call mukesh\n");
    }
}

class car{
    public void operate(){
        System.out.println("the car is operating");
    }
    public void repare(){
        System.out.println("the car is repering");
    }
    public void drive(){
        System.out.println("the car is drive through the driver\n");
    }
}

class Tense{
    public void present(){
        System.out.println("I am definetely success person ");
    }
    public void past(){
        System.out.println("Well I has niced ");
    }
    public void future(){
        System.out.println("so what i will big millionour \n");
    }
}

class Emp{
    public void work(){
        System.out.println("The employee is working");
    }
    public void scold(){
        System.out.println("The boss is scolding ");
    } 
    public void meet(){
        System.out.println("The boss and employee are meeting\n");
    }
}
public class Main{
    public static void main(String [] args){
        
        phoneFunc  acer = new phoneFunc();
        
        acer.ring();
        acer.call();
        acer.callFri();
        
        
        car hundai = new car();
        
        hundai.operate();
        hundai.repare();
        hundai.drive();
    
    
    
        Emp adarsh = new Emp();
        
        adarsh.work();
        adarsh.scold();
        adarsh.meet();
        
        Tense t = new Tense();
        
        t.present();
        t.past();
        t.future();
    }    
}


output of the program:

Phone ringing
Phone calling
Call mukesh

the car is operating
the car is repering
the car is drive through the driver

The employee is working
The boss is scolding 
The boss and employee are meeting

I am definetely success person 
Well I has niced 
so what i will big millionour 
