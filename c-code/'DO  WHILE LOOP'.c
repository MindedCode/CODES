/* THE PROGRAM IS 'DO WHILE LOOP'*/
Usually used when initializing value display and then checking condition. we don't know When the condition will be true, 

code ....
#include<stdio.h>
int main()
{
   int x=0;  
    do
    {        
    printf("%d\n",x);   
    x=x+1;
    }while(x<=10);
   
}

____________Output here_____________\

0    
1
2
3
4
5
6
7
8
9
10

___________________2 program________________________
#include<stdio.h>
int main()
{
    char ch ;
    // int i;
    do{
        printf("Welcome to system lang. learner::\n"); // while loop out side execute before code
        printf("1. c programing lang...\n");
        printf("2. c++ programing lang...\n");
        printf("3. Java programing lang..\n");
        printf("4. Python programing lang..\n");
        printf("press key a or A but any press key see this again manu ");
        scanf("%c",&ch);
        // ch=getch();
    }while(ch!='a'&& ch!='A'); /// condition check
            printf(" Thank you for visting");
            return 0;
}

_____Output here :______

first output :

Welcome to system lang. learner::
1. c programing lang...
2. c++ programing lang...
3. Java programing lang..
4. Python programing lang..
press key a or A but any press key see this again manu A
 Thank you for visting
 
 Second output :

Welcome to system lang. learner::
1. c programing lang...
2. c++ programing lang...
3. Java programing lang..
4. Python programing lang..
press key a or A but any press key see this again manu b

 Thank you for visting
 
  Third output :

Welcome to system lang. learner::
1. c programing lang...
2. c++ programing lang...
3. Java programing lang..
4. Python programing lang..
press key a or A but any press key see this again manu b

 Thank you for visting
