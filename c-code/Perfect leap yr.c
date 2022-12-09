//(100,200, 300, 900, 810, 1000, 1500, 1800, 1900,  2000, 2020, 2021, 2022)  leap yrs yes or not 

#include<stdio.h>
int main()
{
    int year; 
    for(int i =0; i<=12; i++)
        {
            printf("Enter the yr \n ");
            scanf("%d",&year);
        
            if(year%400==0)
                        {
                            printf("%d is leap yr ::\n \n",year);
                        }
                        
            else if(year%100==0)
                        {
                            printf(" %d is ordinary year::\n \n",year);
                        }   
            else if(year%4==0)                      
                        {
                            printf("%d is leap yr ::\n \n",year);
                        }  
                
            else
                printf(" %d is ordinary year::\n\n",year);
        }
}



******************* Output here :*******************

Enter the yr 
 100
 100 is ordinary year::

Enter the yr
 200
 200 is ordinary year::

Enter the yr
 300
 300 is ordinary year::

Enter the yr
 900
 900 is ordinary year::

Enter the yr
 810
 810 is ordinary year::

Enter the yr
 1000
 1000 is ordinary year::

Enter the yr
 1500
 1500 is ordinary year::

Enter the yr
 1800
 1800 is ordinary year::

Enter the yr
 1900
 1900 is ordinary year::

Enter the yr
 2000
2000 is leap yr ::

Enter the yr
 2020
2020 is leap yr ::

Enter the yr
 2021
 2021 is ordinary year::

Enter the yr
 2022
 2022 is ordinary year::
