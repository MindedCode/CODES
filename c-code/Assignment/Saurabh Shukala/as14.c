/******************************************************************************

            number of combinations one can make from n items and r selected at a time. (TSRS)

*******************************************************************************/
#include <stdio.h>

// C(n, r) = n! / (r! * (n - r)!),
unsigned long long fact(int n){
        unsigned long long result = 1;
        int i = 1;
        while(n>=i){
            result *= i;
            i++;
        }
        return result;
    }
unsigned long long combinations(int r, int n){
    if (r > n) {
        return 0; // Invalid input
    }
        unsigned long long fn = fact(n);
        unsigned long long fr = fact(r);
        unsigned long long n_r = fact(n-r);
        return fn/(fr * n_r);
    }
int main(){
    unsigned long long f = fact(5);
    printf("The value of num is: %llu\n", f);
    unsigned long long cn = combinations(3, 5);
    printf("%llu\n", cn);
    return 0;
}
