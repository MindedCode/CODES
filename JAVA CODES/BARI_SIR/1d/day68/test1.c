#include <stdio.h>

// globle declaration no occupy any space bcoz int a; // Structure to ptr
struct Student
{
    /* data */
    int roll;
    int age;
    // printf("%u\n",sizeof(struct Student));   error : no write  only keep hetrogeneous data 
    
};
void display(struct Student*);
void main()
{
    struct Student s1, s2;
    display(&s1);
    printf("%u\n",sizeof(struct Student));  
    printf("%u\n",sizeof(s2.roll));
    printf("%u\n",sizeof(s1.age));
    printf("%u\n",sizeof ++s1.age);
    printf("%d\n",s1.age);
}
void display(struct Student *ptr)
{
    // both statement is ptr to Structure
    printf("%d", (*ptr).roll = 11); 
    printf("\n%d",((*ptr).roll) = 12);  //how to parenthesized help of priority and with Associate
    printf("\n%d",(ptr->roll) = 13);    //indirection operator
    printf("\n%d",ptr->roll = 14);

    printf("\n%u\n",sizeof(struct Student));   
    printf("%u\n",sizeof(ptr->roll));   
    // int p = 1;
    // int *p1 = &p;
    // int **a = &p1;
    // printf("%d",a);

}