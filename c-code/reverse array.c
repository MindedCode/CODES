#include<stdio.h>
int main()
{

int i,n;
int a[0];
printf("Enter the size of array::");
scanf("%d",&n);

printf("Enter the element of array::");
for (i=1; i<=n;i++)
scanf("%d",&a[i]);

printf("this is reverse array::");
for(i=n; i>=1; i--)
printf("%d",a[i]);
}

