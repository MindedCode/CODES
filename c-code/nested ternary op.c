/* as we know  in ternary operator are two operator. <this is inheritence>  nested ternary operator is  expression [var=(expres..1 ? expres..2 (....nested....) : expres..3)].
Ternary  operator  condition is true then display expression 2 execute.
Condition is false then display 3 expression 
if nested ternary operator use first expresion 2nd */

#include <stdio.h>

int main ()
{
int a,b ;   
int math=90;
int computer=100;

a = ( math!=80 ? ( math!=1 ? 3 : 5) : 7 );

printf(" %d",a);

return 0;
}



output :

3




2..
/* as we know  in ternary operator are two operator. <this is inheritence>  nested ternary operator is  
expression [var=(expres..1 ? expres..2 (....nested....) : expres..3)].
Ternary  operator  condition is true then display expression 2 execute.
Condition is false then display 3 expression 
if nested ternary operator use first expresion 2nd */

#include <stdio.h>

int main ()
{
int age;  
printf("Enter the age :"); // user input 
scanf("%d",&age);

age<30 ? printf("you are adult") : printf("you are minor");  // condition is true then second condition is excute.
                                                    // condition is not true then last condition is true.  


return 0;
}

output :
1..
Enter the age :23
you are adult

2..
Enter the age :30
you are minor



