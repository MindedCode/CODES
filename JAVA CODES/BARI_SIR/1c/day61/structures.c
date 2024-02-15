#include<string.h>
#include <stdio.h>


int main()
{
    // unsigned float max = 5.5 > 6.0 ? 5.5 : 6.9; // not valid bcoz in c pro inherently  signed float provide only,
    // signed float max = 5.5 > 6.0 ? 5.5 : 6.9;
    // unsigned float max = 5.0;
    // signed float max = 5.0;    all above line provide error because only float datype by default signed hota bas(signed, unsigned only integer type represent krte hai)

    // float max = 5 > 6.0 ? 5.5 : 6.0;
    // printf("%f", max);

    /*create a user defined data type: help of struct keyword---------------------------------------------*/
    struct Structure
{
    /* data */
    int roll;
    // char name[];   not vaid  becoz initialize kro ya nhi arr ka size tell me // neither garbage value aayegi
    char name[10];
};

    // printf("%d", structures.roll = 5);   not valid bcoz in c lang not followed expression
    // int test = structures.roll = 5;
    // printf("%d", test);   //not valid (i think hamane abhi Structure/Obj nhi banaya hai)
    struct Structure s1;

    int test1 = s1.roll = 5;
    // char str[20] = s1.name = "Adarsh";// not valid 
    // char ch[] = strcpy(s1.name, "Adrash");  not valid
    strcpy(s1.name, "Adrash"); 
    // printf("%s\n", strcpy(s1.name, "Adrash"));
    printf(strcpy(s1.name, "Adrash\n"));
    printf("%d", test1);

    // char tes[];   // size is missing error
    char tes[10];  

    printf(strcpy(tes, "ADrsh"));

    


}