class Show{
    
    public static void main (String[] args) {
         
    // instanciate the Object
    // 1st class //memorry allocator  /// constructor 
    // name
    Student s1 = new Student();
    
    //  call the  memorry using instanciate
    s1.showDetails();
    
    }
   
    
}



/*
learn the create the Object help of new operator
*/


class Student{
    
    // Attibutes
    String name = "MindeCode";
    int value = 500;
    
    // no use static keyword because the instantiate the class Object
    public void showDetails(){
        System.out.println(name);
        System.out.println(value);
    }
}

"Output of the program"

//  MindeCode
// 500
// 
  
  
  
