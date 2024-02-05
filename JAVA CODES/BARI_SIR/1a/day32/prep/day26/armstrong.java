package day26;

class armstrong{
    
    static String isArmStrong(int n){
        int temp = n;
        int temp1 = n;

        int result = 0;
        int digitCount = 0;

        //count the digits
        while(temp1>0){
            digitCount++;
            temp1/=10;
        }

        // System.out.println(digitCount);
        while(temp>0){
            result += Math.pow(temp%10, digitCount);
            // System.out.println("Analyze : " + temp%10 + " "+ result + " " +temp);
            temp/=10;
        }
        return (result==n) ? "Yes" : "No";
    }
    public static void main(String [] arg){

        
        int n = 3732; //371, 153

        for(int i=0; i<=10000000; i++){
            if(isArmStrong(i).equals("Yes")){
                System.out.print(i+" ");
            }
        }
    }
}