****/WAP find the greatest common divisor between two numbers/****
#include<stdio.h>
int recgcd (int, int );
int main()
{
    int a, b, gcd;
    printf("Enter two numbers");
    scanf("%d%d",&a, &b);
    gcd = recgcd(a, b); //calling function
    printf("G.C.D of %d and %d is  = %d", a, b, gcd);
}
int recgcd (int x, int y)
{
    int r;
    if(y==0)
        return (x);
    else
        {
            r=x%y;    // the main calculation
            return (recgcd(y,r));
        }
}

**/Output of the program :/**

Enter two numbers88 66
G.C.D of 88 and 66 is  = 22

