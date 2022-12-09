#include<iostream>
// #include <bits/stdc++.h>

using namespace std;


void PrintArr(int arr[], int n){
    for(int i=0; i<n; i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
void AlternateArr(int arr[], int size){
    for(int i=0; i<size; i+=2){
        // if(i+1<size){
            swap(arr[i],arr[i+1]);
        // }
    }
}
int main(){
    int even[8]= {3,46,34,24,67,82,56,24};
    // int odd[3]={3,7,8};
    
    AlternateArr(even, 8);
    PrintArr(even,8);
    
    
    // AlternateArr(odd,3);
    // PrintArr(odd,3);
    return 0;
    
}


output of the program::

46 3 24 34 82 67 24 56 
