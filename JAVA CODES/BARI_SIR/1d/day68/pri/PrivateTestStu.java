package day68.pri;

public class PrivateTestStu {
    public static void main(String[] args) {
        // int max = 5>4 ? 5 : 4;
        // System.out.println(max);

        //constructed object help of new keywrd in a heap mem
        Student s1 = new Student();

        s1.setMarks(99, 98, 100);   //vaild ofcourse
        System.out.println("Display the total of marks: "+s1getTotal());


    }
}
/**
 *  getter and setter methods available in class modify and displaying marks
 */
public class Student  {
    private int mark1;
    private int mark2;
    private int mark3;

    // setter methods(property)
    public long getTotal(){
        return mark1+mark2+mark3;
    }

    public void setMarks(int m1, int m2, int m3){
        mark1 = m1;
        mark2 = m2; mark3 = m3;
    }

    
}
