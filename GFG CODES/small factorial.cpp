

*/Code here/*
class Solution
{
	public:
		long long int find_fact(int n)
		{
		
		 if(n == 1 || n == 0){
         return 1;
     }
     
     long recResult = find_fact(n-1);
     
     long result = n*recResult;
     
     return result;
		}
		
{
// // 		using for loop
//         long long fact =1;
//         for(int i=1; i<=n; i++){
        
//         fact = fact*i;
//     }return fact;
// }
		
        
// 		{
// 		    // Code here.
// 		    if (n>=1)
//         return n*find_fact(n-1);
//     else
//         return 1;
// 		}
};
