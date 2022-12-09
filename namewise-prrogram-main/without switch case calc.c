//if else ladder 
#include<stdio.h>

// Declare main function
int main()

{
    int a,b,result = 0;
    char ch;
    
    printf("Enter the choice of operator :");
    scanf("%c",&ch);
    
    printf("Enter the first operand : ");
    scanf("%d",&a);
    
    printf("Enter the second operand : ");
    scanf("%d",&b);
    
    
    
    if(ch=='+')
    {
        result+=a+b;
        printf("%d",result);
    }
    else
        if(ch=='-')
        {
            result=a-b;
            printf("%d",result);
        }
    else
       if(ch=='/')
        {
            result=a/b;
            printf("%d",result);
        }
    else 
    printf("Wrong choice");
}

Output of the program :

Enter the choice of operator :+
Enter the first operand : 4
Enter the second operand : 5 
9
