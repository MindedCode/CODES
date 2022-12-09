//This is program of a calculator

#include <stdio.h>
#include <conio.h>
int main ()
{
    char op;
    printf("Enter the single operator:");
    scanf("%c",&op);
    
    int a,b;
    printf("Enter the two operands:");
    scanf("%d%d",&a,&b);
    float c;
    switch(op)
    {
        case '+':
        c= a+b;
        printf("%f",c);break;
        
        case '-':
        c= a-b;
        printf("%f",c);break;
        
        case '*':
        c= a*b;
        printf("%f",c);break;
        
        case '/':
        c= a/b;
        printf("%f",c);break;
        
        default:
        printf("this wrong statement ");
        break;
        
        
    }
}
