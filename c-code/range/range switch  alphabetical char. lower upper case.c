/*this c code is diaplay the rangeing switch case,
and display the Alfabetical charater check the lower(a,b....y,Z)
or upper case(A,B...Y,Z```````)  */
#include<stdio.h>
int main()
{
    char ch;
    for(int i=1; i<5; i++)
    {
        printf("Enter the Alfabetical charater::\n");
        scanf(". %c",&ch);
         
        switch(ch)
        {
            case 'a'...'z': //lower case
                printf("%c lower case",ch);
                break;
            case 'A'...'Z': //upper case
                printf("%c upper case\n",ch);
                break; // no use the default case becoz that we user  enter the Alphabetical charater (lower or upper) 
            
        } 
        
    }
    return 0;
}
