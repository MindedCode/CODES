Yet Another Palindrome Making Problem
Problem Code:
MAKEPALAGAIN
Contest Code:
LTIME110
Difficulty Rating:1328
ADVERTISEMENT

Want to Remove Ads ?
Upgrade To Pro
Problem
Chef has a string AA (containing lowercase Latin letters only) of length NN where NN is even. He can perform the following operation any number of times:

Swap A_iA 
i
​
  and A_{i + 2}A 
i+2
​
  for any 1 \le i \le (N - 2)1≤i≤(N−2)
Determine if Chef can convert string AA to a palindromic string.

Note: A string is called a palindrome if it reads the same backwards and forwards. For example, \texttt{noon}noon and \texttt{level}level are palindromic strings but \texttt{ebb}ebb is not.

Input Format
The first line contains a single integer TT — the number of test cases. Then the test cases follow.
The first line of each test case contains an integer NN — the length of the string AA.
The second line of each test case contains a string AA of length NN containing lowercase Latin letters only.
Output Format
For each test case, output YES if Chef can convert the string AA to a palindromic string. Otherwise, output NO.

You may print each character of YES and NO in either uppercase or lowercase (for example, yes, yEs, Yes will be considered identical).

Constraints
1 \leq T \leq 2001≤T≤200
1 \leq N \leq 10001≤N≤1000
SS contains lowercase Latin letters only.
NN is even
Sample 1:
Input

3
6
aabbaa
4
abcd
6
zzxyyx
Output
YES
NO
YES
Explanation:
Test case 11: The given string is already a palindrome.

Test case 22: It can be proven that is it not possible to convert AA to a palindromic string.

Test case 33: We can perform the following operations:

Swap A_{1}A 
1
​
  and A_{3}A 
3
​
 . (Now AA becomes xzzyyx)
Swap A_{2}A 
2
​
  and A_{4}A 
4
​
 . (Now AA becomes xyzzyx)
  
  
  ****/Code here:/****

#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        
        string s;
        cin>>s;
        
        string a,b;
       
        for(int i=0;i<n;i+=2)
            a=a+s[i];
            
        for(int i=1;i<n;i+=2)
            b=b+s[i];
            
        sort(a.begin(),a.end());
        
        sort(b.begin(),b.end());
        
        if(a==b)
            cout<<"YES\n";
        else
        cout<<"NO\n";
    }
    return 0;
}


Input and output of the program :

Input

3
6
aabbaa
4
abcd
6
zzxyyx
Output
YES
NO
YES
