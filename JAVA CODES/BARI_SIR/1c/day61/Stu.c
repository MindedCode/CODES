#include <stdio.h>
#include <string.h>
struct
{
    char man_name[20];
    char w_name[10];
} family, family2; // globle type ka variable hai along with userdefined dtype

typedef struct Dr
{
    char name[50];
    // int rol = 9;  error bcoz tum fir se main ke inside or other funtion me initialize hua hai
    int rol;
    char w_name[10];
    int j;
    
} Div, Vib;

struct Dr2
{
    char name[50];
    char w_name[10];
} div;

int main()
{
    // int max = 5 > 6 ? 5 : 6;
    // printf("%d",max);

    // family.man_name = "ADar";   error arr name is not a lvalue

    strcpy(family.man_name, "Adarsh Kumar");
    printf("name of man: %s", family.man_name);

    strcpy(family.w_name, "Divyansh");
    printf("\nwife of man: %s", family.w_name);

    // Div d;
    // strcpy(d.name ,"Divyansh Gandi");

    //using typedef function------------------------------------------------------

    Div d = {"ADarsh", 8, "Kumar"};

    printf("\n%s %d %s", d.name, d.rol, d.w_name);
    printf(" %d",d.j);

    printf(" %u", d);//// o/p this line => struct type ka adress hai => 1918977089

    Vib g = d;

    printf("\n%s %d %s", g.name, g.rol, g.w_name);
    g.j = 56;
    printf(" %d",g.j);

    printf(" %u", d);    /// same address

    

    // printf("Dr. Name: %s", Div.name);

    // strcpy(Vib.w_name, "Vansika");
    // printf("wife of dr.: %s", Vib.w_name);

    // struct family = d;   error     /// here datatype ka name family hai, here d is a family variable

    // struct Dr2 d2 = d;
}