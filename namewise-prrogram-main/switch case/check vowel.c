/******************************************************************************

Welcome to Online plateform.
What to check whether it is a alphabet vowel or not

*******************************************************************************/
#include <stdio.h>

int main()
{
    char alphabet;
    
    printf("enter the a alphabet\n");
    scanf("%c",&alphabet);
    
    switch(alphabet)
    {
        case 'a':
            printf("this is a vowel ");break;
        
        case 'e':
            printf("this is a vowel");break;
        
        case 'i':
            printf("this is a vowel");break;
        
        case 'o':
            printf("this is a vowel");break;
        
        case 'u':
            printf("this is a vowel");break;
        
        case 'A':
            printf("this is a vowel ");break;
        
        case 'E':
            printf("this is a vowel");break;
    
        case 'I':
            printf("this is a vowel");break;
        
        case 'O':
            printf("this is a vowel");break;
        
        case 'U':
            printf("this is a vowel");break;
            
        default:
            printf("this is a Consonet");
    }

    return 0;
}

OUTPUT OF THE PROGRAM :

enter the a alphabet
A
this is a vowel 

