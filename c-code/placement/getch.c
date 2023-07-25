#include<stdio.h>
#include<conio.h>

int main(){
    // getch();
    printf("Hellow\n");
    int a = getch();
    printf("\nEnter character\n");
    getch();
    printf("\nEnter character\n");
    printf("Hellow is %d\n ", a);
    printf("\nEnter character\n");
    getch();
    printf("\nEnter character\n");


    int b = getch();
    int c = getch();
    printf("age : %d%d", b, c);
    
}

Output is:
Hellow

Enter character

Enter character
Hellow is 50

Enter character

Enter character age : 5051  // ye value char 2 and 1 ko liye hai  bs '2' and '1' character ko ascii language se convert kiya hai becoz humne display 
    krne format specifier %d hi diya hai
