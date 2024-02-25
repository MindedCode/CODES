package day68.pri;

public class PrivateTestBank {
    public static void main(String[] args) {
        // int max = 4>6 ? 4 : 6;
        // System.out.println(max);

        //construct object Account class
        Account a1 = new Account();

        a1.setAccNum(12345567891091L);

        System.out.println("Displayed the account number: "+a1.displayAccNum());

    }
}


// only write and read method present in account class 
class Account{
    private long accNum;

    //only writable property method
    public void setAccNum(long accN){
        accNum = accN;
    }

    public long displayAccNum(){   //read method
        return accNum;
    }
}
