/******************************************************************************

                            1. print size of an int, a float, a char and a double type variable

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
	void h = 12;
	printf("%lu\n", sizeof(a));
	printf("%lu\n", sizeof(b));
	printf("%lu\n", sizeof(c));
	printf("%lu\n", sizeof(d));
	printf("%lu\n", sizeof(e));
	printf("%lu\n", sizeof(f));
	printf("%lu\n", sizeof(g));
	printf("%lu\n", sizeof(h));
	
	
	return 0;
	
}



#include <iostream>
using namespace std;

int main() {
    char a = 12;
    int b = 12;
    float c = 12;
    double d = 12;
    long double e = 12;
    short f = 12;
    long g = 12;
    // 'void h' is not allowed in C++ as a variable declaration.

    cout << sizeof(a) << endl;
    cout << sizeof(b) << endl;
    cout << sizeof(c) << endl;
    cout << sizeof(d) << endl;
    cout << sizeof(e) << endl;
    cout << sizeof(f) << endl;
    cout << sizeof(g) << endl;

    return 0;
}

Output is cpp:
1
4
4
8
16
2
8


public class DataTypeSizes {
    public static void main(String[] args) {
        byte a = 12;
        int b = 12;
        float c = 12;
        double d = 12;
        double e = 12;
        short f = 12;
        long g = 12;
        // 'void h' is not allowed in Java as a variable declaration.

        System.out.println(Byte.SIZE / 8);
        System.out.println(Integer.SIZE / 8);
        System.out.println(Float.SIZE / 8);
        System.out.println(Double.SIZE / 8);
        System.out.println(Double.SIZE / 8);
        System.out.println(Short.SIZE / 8);
        System.out.println(Long.SIZE / 8);
    }
}


Output is java:
1
4
4
8
8
2
8



a = 12
b = 12
c = 12
d = 12
e = 12
f = 12
g = 12


// In python
print(a.__sizeof__())
print(b.__sizeof__())
print(c.__sizeof__())
print(d.__sizeof__())
print(e.__sizeof__())
print(f.__sizeof__())
print(g.__sizeof__())

28
28
24
24
32
14
28



in PHP:
<?php
$a = 12;
$b = 12;
$c = 12;
$d = 12;
$e = 12;
$f = 12;
$g = 12;

echo strlen($a) . "\n";
echo strlen($b) . "\n";
echo strlen($c) . "\n";
echo strlen($d) . "\n";
echo strlen($e) . "\n";
echo strlen($f) . "\n";
echo strlen($g) . "\n";
?>


2
2
2
2
4
2
2


in Javascript:
const a = 12;
const b = 12;
const c = 12;
const d = 12;
const e = 12;
const f = 12;
const g = 12;

console.log(Buffer.byteLength(a));
console.log(Buffer.byteLength(b));
console.log(Buffer.byteLength(c));
console.log(Buffer.byteLength(d));
console.log(Buffer.byteLength(e));
console.log(Buffer.byteLength(f));
console.log(Buffer.byteLength(g));


2
4
4
8
8
4
8

