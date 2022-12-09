/*program to generate  fibonacci  series. The user enter the limit  of series.*/
#include<stdio.h>
int fseries(int);
int main()
{
    int limit, f0=0,f1=1;
    printf("Enter the limit of fibonacci fseries ");
    scanf("%d",&limit);
    if(limit>2)
    {
        printf("%d\n%d", f0, f1);
        fseries(limit -2);
        
    }
    else if(limit ==2)
    {
        printf("\n %d \n %d",f0,f1);
    }
    else if(limit == 1)
    {
        printf("%d",f1);
    }
    else
    {
        printf("Series not possible ");
    }
}
int fseries(int p)
{
    int fib;
    static int f0=1, f1=1;
    if(p==0)
    {
        printf("\n The series ends here ");
    }
    else
    {
        fib = f0 + f1;
        f0 = f1;
        f1 = fib;
        printf("\n %d", fib);
        fseries(p-1);
    }
}

output of the program :

Enter the limit of fibonacci fseries 5
0
1
 2
 3
 5
 The series ends here 
