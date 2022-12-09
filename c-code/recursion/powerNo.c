/*program to ask a number to be  calculated for that number.*/
#include<stdio.h>
int power(int, int );
int main()
{
    int n, p, result;
    printf("Enter the number  ");
    scanf("%d",&n);
    printf("\n Enter the power to be calculated ",n, p, result);
    scanf("%d",&p);
    result = power (n,p);
    printf("The result of %d to power %d is %d ", n,p,result);

}
int power(int n, int p)
{
    static int r= 1;
    if(p==0)
        return 1;
    else
    {
        r*=n;
        power(n,p-1);
    }
    return (r);
}

Output of the program :

 Enter the power to be calculated  2
The result of 5 to power 2 is 25 
