/*program to display  the  reverse  of an  integer number  entered  by user*/
#include<stdio.h>
int revsInt (int);
int main()
{
    int n, result;
    printf("Enter the number " );
    scanf("%d", &n);
    result = revsInt(n);
    printf("The reverse of number %d is %d",n, result);
}
int revsInt (int p)
{
    int d;
    static int r = 0;
    if(p==0)
        return(p);
    else
    {
        d=p%10;
        r=r*10+d;
        revsInt(p/10);
    }
return (r);
}

The output of the program :

Enter the number 12345
The reverse of number 12345 is 54321
