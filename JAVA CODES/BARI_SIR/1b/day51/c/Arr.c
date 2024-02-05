#include <stdio.h>
int max(int x, int y){
    return x>y ? x : y;
}
int main(){
    printf("%d\n",max(4,8));

    int ar[4] = {1,2,3};

    printf("%d\n", ar+1);
    printf("%d\n", &ar[0]+1);
    printf("%d\n", &ar[1]);
    printf("%d\n", &ar[0]+0);

    printf("\n%d\n", 1+ar);
    // printf("%d\n", &1+ar[0]);
    printf("%d\n", &1[ar]);
    printf("%d\n", &*(ar+1));
    printf("%d\n", &*(1+ar));
    printf("%d\n", &1+ar[0]);


}