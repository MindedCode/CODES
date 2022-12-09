/*program to calculate the nth number of the fibonacci series.*/

#include <stdio.h>
int fnum(int);
int main()
{
    int p, num;
    printf("Enter the position of element you want from fibnacci series");
    scanf("%d",&p);
    num=fnum(p);
    printf("The required fibnacci number is %d", num);
}
int fnum(int p)
{
    if(p==0||p==1)
        return (p);
    else
    return (fnum(p-1)+fnum(p-2));
    
            
            /*p=4; following solve from recursion to answer = fib(4) => 3
            
                {(fnum(3)=> 2)                      +         (fnum(2) =>1) ==>2+1=3
        {fnum(2) => 1   +   fnum(0) => 0 ==>1+1=2 }     {(fnum(1) => 1)   + (fnum(0) => 0) ==> 1+0 = 1}
    fnum(1) +  fnum(0)   => 1+0 = 1*/
        }

Output of the program :

Enter the position of element you want from fibnacci series4
The required fibnacci number is 3
