**/exmple/**
N = 5
names[] = { "Geek", "Geeks", "Geeksfor",
  "GeeksforGeek", "GeeksforGeeks" }

Output:
GeeksforGeeks
Display longest name
**/code here/**
class Solution{
    public:
    string longest(string names[], int n)
     {
        int index;
        int length = 1;
        for(int i=0;i<n;i++){
            if(names[i].length() > length ){
                length = names[i].length();
                index = i;
            }
        }
        return names[index];
    }
};
