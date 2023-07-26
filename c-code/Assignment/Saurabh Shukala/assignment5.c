/******************************************************************************
                        Assignment 5 by Saurabh Sir!
                        
                            1. Area of Circle
                            2. Valume of Cuboid
                            3. simple Interest
                            4. The Area of a rectangle (A) = l x b
                            5. Ascii (American std code for info interchange) Code
                            6. Profit percentage
                            7. Area of Triangle (A = 1/2 × b × h.)

*******************************************************************************/
/* 
Formulas
1. Volume of a cuboid = l × b × h [cubic units]
     Where, l = length. b = breadth. h = height.
2. A = P (1 + rt)
    A	=	final amount
    P	=	initial principal balance
    r	=	annual interest rate
    t	=	time (in years)
    
            S.I. = (P × R × T)/100
3. Profit = Selling Price - Cost Price.
        Profit percentage = (Profit/Cost Price) × 100
        
*/

#include<stdio.h>

#define PI 3.14
void areaOfCircle(int r){
    float area = PI*r*r;
    printf("Area of Circle : %f\n", area);
}

void volumeOfCuboid(int l, int b, int h){
    int volume = l*b*h;
    printf("Volume of Cuboid : %d\n", volume);
}

void simpleInterest(int principal, int rate, int tim){
    float si = (principal*rate*tim)/100;
    printf("Simple Interest : %f\n", si);
}

void areaOfRact(int length, int breadth){
    float area = length*breadth;
    printf("Area of Ractangle : %f", area);
}

void printAscii(){
    printf("single digit for Ascii Code -\n");
    for(int i=48; i<=57; i++){
        printf("%d => %c\n", i,i);
    }
    printf("\n");
    printf("English Uppercase letters for Ascii Code -\n");
     for(int i = 65; i <= 90; i++){
        printf("%d => %c\n", i,i);
        // printf("%c",65);
    }
    printf("\n");
    printf("English Lowercase letters for Ascii Code -\n");
     for(int i = 91; i <= 122; i++){
        printf("%d => %c\n", i,i);
        // printf("%c",65);
    }
    printf("\n");
}

void profitPercentage(float sellingP, float costP){
    float profit = sellingP - costP;
    float profitPercentage = (profit/costP) * 100; 
    printf("Profit: %.2f\n", profit);                                                 // %.2f% likhna must hai
    printf("Profit percentage of Product or service : %.2f%%\n", profitPercentage);   // round krne ke liye 2f means 2 time roundoff
}

void areaOfTri(float breadth, float height){
    float area = 0.5 *breadth*height;
    printf("Area of Triangle : %.2f%%\n", area);
}


int main()
{
	areaOfCircle(2);
	volumeOfCuboid(2,3,4);
	simpleInterest(500, 7, 5);
	areaOfRact(10, 23);
	printAscii();
	profitPercentage(395, 300);
	areaOfTri(95, 75);
}



Output of the Program:
// Area of Circle : 12.560000
// Volume of Cuboid : 24
// Simple Interest : 175.000000
// Area of Ractangle : 230.000000single digit for Ascii Code -
// 48 => 0
// 49 => 1
// 50 => 2
// 51 => 3
// 52 => 4
// 53 => 5
// 54 => 6
// 55 => 7
// 56 => 8
// 57 => 9

// English Uppercase letters for Ascii Code -
// 65 => A
// 66 => B
// 67 => C
// 68 => D
// 69 => E
// 70 => F
// 71 => G
// 72 => H
// 73 => I
// 74 => J
// 75 => K
// 76 => L
// 77 => M
// 78 => N
// 79 => O
// 80 => P
// 81 => Q
// 82 => R
// 83 => S
// 84 => T
// 85 => U
// 86 => V
// 87 => W
// 88 => X
// 89 => Y
// 90 => Z

// English Lowercase letters for Ascii Code -
// 91 => [
// 92 => \
// 93 => ]
// 94 => ^
// 95 => _
// 96 => `
// 97 => a
// 98 => b
// 99 => c
// 100 => d
// 101 => e
// 102 => f
// 103 => g
// 104 => h
// 105 => i
// 106 => j
// 107 => k
// 108 => l
// 109 => m
// 110 => n
// 111 => o
// 112 => p
// 113 => q
// 114 => r
// 115 => s
// 116 => t
// 117 => u
// 118 => v
// 119 => w
// 120 => x
// 121 => y
// 122 => z

// Profit: 95.00
// Profit percentage of Product or service : 31.67%
// Area of Triangle : 3562.50%

