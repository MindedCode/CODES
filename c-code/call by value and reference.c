in this code is call by  value  (address)  is after  fuction call no value change 
and 'call by value ' in this program is after function  calling value change.  pass the address operator 

/* call by value */ // """"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""

// #include<stdio.h>
// int num (int x);
// int main ()
// {
//     int a=50;
//     num(a); // actual parameter  call by value
//     printf(" real value display after then also adding nummber  %d\n ",a); 
//     printf("\n");
    
//     printf(" ...............call by value.................");
// }
//  int num (int x){     // formal parqameter
//      x=x+50;
//      printf(" function adding number %d \n",x);
     
//  }
 
 
 
 /*call by reference ( adaress )  Pointer variable */ // __________________________________________________________++++++++++++
 
 #include<stdio.h>
int num (int *x); // pass the pointer variable
int main ()
{
    int a=50;
        // printf(" before function call value of a %d\n",a); // a= 50
    num(&a); // actual parameter  call by value pass the address operator '&' (ampersent)
    printf(" After function call %d\n",a); //a= 100
    printf("\n");
    
    printf(" ...............call by value.................");
}
 int num (int *x){     // formal parqameter.  pass the pointer variable (pointer argument )
     *x = *x + 50;
    //  printf(" After adding value inside function num %d \n",*x);  //x=100
 }
