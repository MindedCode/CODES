*/Example/*
Input:
P=999
R=9
T=9
Output:
809.19
Explanation:
The simple interest on 999 at a rate 
of 9% across 9 time periods is 809.19

*/Code Here/*
class Solution {
  public:
    double simpleInterest(int P, int R, int T) {
        // code here
        //  P,R,T;
        // int sum=0;
        // sum=(P(1+(R*T)));
         return (double)P*R*T/100;
    }
   
};
