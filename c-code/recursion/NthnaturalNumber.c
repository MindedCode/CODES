/*Program to find the sum of first ten natural numbers using recursion.*/
#include<stdio.h>
int sum();
int main()
{
    int x,y;
    printf("Enter any positive int number");
    scanf("%d",&y);
    printf("The sum of first %d integers = %d\n", y, sum(y));
}

int sum(int y)    //user defined function
{
    if(y==0) // base return out of function  condition
    {
       return 0;
    }
    else
        return (y + sum(y-1));
      /*
      lets y=5;
      call 1:sum(5)=   5+sum(4)=5+10=>15;
      call 2: sum(4)=  4+sum(3)=4+6=>10;
      call 3:  sum(3)= 3+SUM(2)=3+3=>6;
      call 4:  sum(2)= 2+sum(1)=2+1=>3;
      call 5; sum(1)=  1+sum(0)=1+0  =>1;
      */
}
   
