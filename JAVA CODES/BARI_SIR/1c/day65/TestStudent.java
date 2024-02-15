package day65;


public class TestStudent {
       
    public static void main(String[] args) {
        int max = 6>7 ? 6 : 7;
        System.out.println(max);

        Student s1 = new Student();

        s1.roll = 12;
        s1.course = "B.Tech";
        s1.eng = 99f;
        s1.math = 98f;
        s1.javaM = 97;


        // System.out.println("\nStudent datails: "+s1.details());
        System.out.println("Roll no of the Student: "+s1.roll);
        System.out.println("Course of Student: "+s1.course);
        System.out.println("Total no of the Marks: "+s1.total());
        System.out.println("Average of marks: "+s1.avg());
        System.out.println("Grade of Student: "+s1.grade());

        Student s2 = new Student();

        s2.roll = 13;
        s2.course = "B.Tech";
        s2.eng = 90f;
        s2.math = 90f;
        s2.javaM = 80;


        System.out.println("\nRoll no of the Student: "+s2.roll);
        System.out.println("Course of Student: "+s2.course);
        System.out.println("Total no of the Marks: "+s2.total());
        System.out.printf("Average of marks: %.2f",s2.avg());
        System.out.println("\nGrade of Student: "+s2.grade());

        Student s3 = new Student();

        s3.roll = 14;
        s3.course = "B.Tech";
        s3.eng = 80f;
        s3.math = 70f;
        s3.javaM = 75;


        System.out.println("\nRoll no of the Student: "+s3.roll);
        System.out.println("Course of Student: "+s3.course);
        System.out.println("Total no of the Marks: "+s3.total());
        System.out.printf("Average of marks: %.2f",s3.avg());
        System.out.println("\nGrade of Student: "+s3.grade());

        Student s4 = new Student();

        s4.roll = 15;
        s4.course = "B.Tech";
        s4.eng = 55f;
        s4.math = 60f;
        s4.javaM = 70;


        System.out.println("\nRoll no of the Student: "+s4.roll);
        System.out.println("Course of Student: "+s4.course);
        System.out.println("Total no of the Marks: "+s4.total());
        System.out.printf("Average of marks: %.2f",s4.avg());
        System.out.println("\nGrade of Student: "+s4.grade());
    
        Student s5 = new Student();

        s5.roll = 16;
        s5.course = "B.Tech";
        s5.eng = 30f;
        s5.math = 60f;
        s5.javaM = 40;


        System.out.println("\nRoll no of the Student: "+s5.roll);
        System.out.println("Course of Student: "+s5.course);
        System.out.println("Total no of the Marks: "+s5.total());
        System.out.printf("Average of marks: %.2f",s5.avg());
        System.out.println("\nGrade of Student: "+s5.grade());

        Student s6 = new Student();

        s6.roll = 17;
        s6.course = "B.Tech";
        s6.eng = 30f;
        s6.math = 20f;
        s6.javaM = 40;


        System.out.println("\nRoll no of the Student: "+s6.roll);
        System.out.println("Course of Student: "+s6.course);
        System.out.println("Total no of the Marks: "+s6.total());
        System.out.printf("Average of marks: %.2f",s6.avg());
        System.out.println("\nGrade of Student: "+s6.grade());
        System.out.println(s1);
    }
}

class Student{
    //properties
    public int roll;
    public String course;
    public float eng, math, javaM;
    
    //methods
    public double total(){
        return eng+math+javaM;
    }
    public double avg(){
        return total()/3;
    }
    public char grade(){

        if(90 <= avg()){
            return 'A';
        }
        else if (90 >= avg() && 80 < avg()){
            return 'B';
        } 
        else if(80 >= avg() && 65 < avg()) 
        return 'C';
        else if (65 >= avg() && 45 < avg())
        return 'D';
        else if(45 >= avg() && 33 < avg())
        return 'E';
        else return 'F';
    }
    public String toString(){
        return "Name"+" Adarsh";
    }
}
