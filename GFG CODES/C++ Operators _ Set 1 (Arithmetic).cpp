
*/Example/*

Input: A = 1,  B = 2
Output: 3 2 1 2
Explanation:
A + B = 3
A * B = 2
Since B>A, therefore the result of
subtraction and division are
B - A = 1 and B / A = 2 respectively.

class Solution {
  public:
 
    vector<int>cppOperators(int A, int B) {
        vector<int>ans;
        // code here
     
    //   ans.push_back(A+B);
     
    //   ans.push_back(A*B);
    
    //   ans.push_back(B-A);

    //   ans.push_back(B/A);
    
      ans.push_back(A+B);
     
      ans.push_back(A*B);
      
      if(A>B){
        ans.push_back(A-B);

      ans.push_back(A/B); 
      }
      else{
          ans.push_back(B-A);

          ans.push_back(B/A);
      }
     return ans;
      }
     
};
