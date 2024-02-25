#include <stdio.h>

// globle declaration no occupy any space bcoz int a;
struct Test_struct_student
{
    /* data */
    int roll;
    int age;
};

void display(struct Test_struct_student);

void main()
{
    // int max = 5>6 ? 5 : 6;
    // printf("%d",max);

    struct Test_struct_student s1, s2;
    s1.roll = 10;
    printf("%d",s1.roll);
    printf("\n%d", s1.roll = 20);

    // calling function
    display(s1);
}
void display(struct Test_struct_student t)
{
    printf("\n%d", t.roll = 30);
}
