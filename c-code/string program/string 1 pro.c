/******************************************************************************


This c program is display the string(single character, name, Sentence etc)

*******************************************************************************/
#include <stdio.h>
int main()
{
    // char name[0]='a';
    char ch[]={'a','b','c','\0'}; //initialisation
    char name[] ="Adarsh";
    // name[1]='b';
    // name[2]='c'
    printf("%d\n",ch[0]); //display zero position is. print ASCII value
    printf("%c\n",ch[1]); //display one position is 
    
    printf("%c\n",ch[2]);  //display two position is 
    // printf("%s",name[3]);
    
    

    return 0;
}


Output hare :

97
b
c
