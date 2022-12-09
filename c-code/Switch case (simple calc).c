By using the switch statement, you will create a simple calculator in C programming.

To understand this example, you should be familiar with the following topics:
calculator multiple operand perform


#include <stdio.h>

int main()
{// main program
    char ope;
    printf("Enter the operator -,+,=,*,/,<,>  ");
    scanf("%c",&ope);
    int a,b;
    printf("Enter the two operands :: ");
    scanf("%d%d",&a,&b);
    int c;
    // switch case
    switch(ope){
        case '+':
        c=a+b;
        printf("sum =%d ",c);break;
        
        case '-':
        c=a-b;
        printf("difference %d",c);break;
        
        case '*':
        c=a*b;
        printf("product %d",c);break;
        
        case '/':
        c=a/b;
        printf("divide %d",c);break;
        
        case '%':
        c=a%b;
        printf("modulo %d",c);break;
        
        case '=':{
        c=a==b;
        if(a==c){
        printf("expression is equal");}
        else
        printf("expression is not equal");break;}
        
        case '<':
        c=a<b;
        printf("less than ");break;
        
        case '>':
        c=a>b;
        printf("grater than ");break;
        
        default:
        printf("this wrong statement ");
    }

    return 0;
}
