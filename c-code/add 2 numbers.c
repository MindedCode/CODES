The program displays the result for adding two numbers. This is the add two numbers it program. In this program, the 
user enters two integers. These two integers are then stored in variables. These two numbers then are added using
the + operator, and the result is displayed in the sum variable

//-----------Here codes --------------
#include<stdio.h>
int main ()
{ 
  int  first_no;
  int  second_no;
  int sum;
  printf ("Enter the first number :: ");
  scanf ("%d", &first_no);
  printf ("Enter the second_no :: ");
  scanf ("%d", &second_no);
  sum = first_no + second_no;
  printf ("\nsum of two numbers ==> %d + %d = %d", first_no, second_no, sum);
  return 0;
}
