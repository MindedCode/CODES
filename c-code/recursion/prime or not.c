/*The program to check if the entered number is prime number or not*/
#include<stdio.h>
int prime(int);
int main()
{
//   for(int i=0; i<=4; i++)
//   {
    int n,f=0;
    printf("\n Enter the number  ");
    scanf("%d",&n);
    if(n==2)
        printf("The number is prime ");
    else if(n<2)
        printf("The smallest prime number is 2 ");
    else 
    {
        f=prime(n);
        if(f)
            printf("Number is  prime");
        else printf("Not  prime");
    }
}
// }
int prime(int a)
{
    static int d = 2, flag = 1;
    if(d==a)
        return(0);
    else
    {
        if(a%d==0)
            {
                flag = 0;
                d++;
            }
        else
        {
            d++;
            flag = 1;
            prime(a);
        }
    }
    return(flag);
}

Output of the program :

 Enter the number  9
Not  prime
// prime numbers => 2,3,5,7,11,13,17,19....
