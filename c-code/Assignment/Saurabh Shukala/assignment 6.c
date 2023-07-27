/******************************************************************************

                            1. print size of an int, a float, a char and a double type variable
                            2. find first digit of a given three digit number
                            3. find middle digit of a given three digit number

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
