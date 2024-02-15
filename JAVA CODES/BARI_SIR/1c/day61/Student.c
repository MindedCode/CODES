#include<stdio.h>
#include<string.h>

struct Student{
    int rol;
    char name[10];
};

void main(){
    struct Student s1;

    int test = s1.rol=12;
    printf("%d", test);
    s1.rol = 23;
    printf("\n%d", s1.rol);
    
    strcpy(s1.name, "Adarsh");
    printf(strcpy(s1.name, "\nAdarsh Patel"));
}