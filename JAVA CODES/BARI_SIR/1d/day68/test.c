#include <stdio.h>

// globle declaration no occupy any space bcoz int a; // Structure to ptr

struct Student
{
    /* data */
    int roll;
    int age;
};

void display(struct Student *ptr)
{

    // both statement is ptr to Structure
    printf("%d", (*ptr).roll = 11); // here membership ('.') opr 🔺⏫high, precedence/priority/preference, '*' 🔻⏬low precedence.
    // but *ptr is a unary and indirection/dereferencing/value at opr.
    printf("\n%d", ptr->roll = 12);
}

void main()
{
    struct Student s1, s2;
    display(&s1);
}