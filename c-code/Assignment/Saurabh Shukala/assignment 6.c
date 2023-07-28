/******************************************************************************

                            1. print size of an int, a float, a char and a double type variable
                            2. find first digit of a given three digit number
                            3. find middle digit of a given three digit number
			    4. last digit of a number stored in a variable as zero. (Example - if x=2345 then make it x=2340)
        		5. input a number from the user and also input a digit. Append a digit in the number and print the resulting number.
                		(Example - number=234 and digit=9 then the resulting number is 2349)
                	6. Assume price of 1 USD is INR 76.23. Write a program to take the amount in INR and convert it into USD.
            		
	      		7. to take a three digit number from the user and rotate its digits by one position towards the right.

*******************************************************************************/
#include<stdio.h>
int main(){
    char a = 12;
	int b = 12;
	float c = 12;
	double d = 12;
	long double e = 12;
	short f = 12;
	long g = 12;
// 	void h = 12;
	printf("%lu\n", sizeof(a));
	printf("%lu\n", sizeof(b));
	printf("%lu\n", sizeof(c));
	printf("%lu\n", sizeof(d));
	printf("%lu\n", sizeof(e));
	printf("%lu\n", sizeof(f));
	printf("%lu\n", sizeof(g));
// 	printf("%lu\n", sizeof(h));
	
	
	return 0;
	
}


Output:
// 1
// 4
// 4
// 8
// 16
// 2
// 8

// ------------------------------------------------------------
#include <stdio.h>

int main() {
    int number;
    printf("Enter a three-digit number: ");
    scanf("%d", &number);

    int firstDigit = number / 100;

    printf("The first digit is: %d\n", firstDigit);

    return 0;
}



#include <stdio.h>

int main() {
    int number;
    printf("Enter a three-digit number: ");
    scanf("%d", &number);

    int middleDigit = (number / 10) % 10;

    printf("The middle digit is: %d\n", middleDigit);

    return 0;
}

/*****************************************************************************/

#include<stdio.h>

void onePosiRotate(int n){
    int digit = n%10;  //4
    int ans = ans + digit  * 1000;  //4 
    n/=10;  //123
    ans = ans + n;
    printf("\nAns: %d", ans);
    
}
int main(){
    int number = 1234;
    
    
    int digit = number/10;
        
    int ans = digit*10;
    printf("%d", ans);
    
    onePosiRotate(number);
}


