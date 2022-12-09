/******************************************************************************

Welcome to Online.
there is a program of the fibonacci series number :

*******************************************************************************/
#include <stdio.h>

int main()
{
    int n1=0,n2=1,sum,number;
    int i;
    
    printf("Enter the which fibonacci series number :\n");
    scanf("%d",&number);
    
    printf("there is fibonacci series of : \n ");
    printf("%d %d ",n1,n2);
    for(i=2; i<number; ++i)
    {
        sum = n1+n2;  
        printf("%d ",sum);
        
        n1=n2;
        n2=sum;
    }

    return 0;
}

Output of the program :
Enter the which fibonacci series number :
7
there is fibonacci series of : 
 0 1 1 2 3 5 8 
