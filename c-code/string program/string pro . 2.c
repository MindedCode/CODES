/******************************************************************************
display my name 

*******************************************************************************/
#include <stdio.h>

int main()
{
    char name[7]={'A','D','A','R','S','H','\0'}; //intialize in character form
    char last_n[]="PATEL"; //intialize in word form
    int i=0; //intialize index value
    printf("My name is :" ); 
    while(name[i]!='\0') 
    {
        printf("%c",name[i]);//disply my first name //ADARSH
        
        i++;
    }
    printf(" %s",last_n); // disply my last_name // PATEL

    return 0;
}

O/P :

My name is :ADARSH PATEL
