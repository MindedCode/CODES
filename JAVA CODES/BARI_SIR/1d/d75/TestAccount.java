package Lecs.d75;

public class TestAccount {
    public static void main(String[] args) {
        System.out.println("Hii Ganesh");

        //constructed the obj of base class
        // String accN, String n, String addr, String dob, String phoneN
        Account a1 = new Account("12345678910120","MINDED CODE","GZB","4 Feb 2000", "0");

        a1.setAddress("Ghaziabad");
        a1.setPhoneNo("1234567890");

        //Calling the getter methods
        System.out.println("User Address: "+a1.getAddress());
        System.out.println("User Phone No: "+a1.getPhoneNo());
        System.out.println("User Name: "+a1.getName());
        // System.out.println("User Deposite: "+a1.toString());

        Account test = new SAccount();
        // System.out.println("Test line: "+test.test);


        //constructed the obj of clild class(Saving Account)
        SAccount sA1 = new SAccount();

        
        System.out.println("User Deposite: "+sA1.toString());

    }
}

//Parent class/base/super
class Account{
    // protected String name, addr, pAddr, dob, email;
    // protected byte age;
    // protected int AccountN, balance;
    private String accountN, name, address, phoneNo, dob;
    protected long balance;

    public Account(){};

    // create a Constructor
    public Account(String accN, String n, String addr, String dob, String phoneN){
        accountN = accN;
        name = n;
        address = addr;
        this.dob = dob;
        phoneNo = phoneN;
    }

    public String getAccountN() {
        return accountN;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getDob() {
        return dob;
    }

    public long getBalance() {
        return balance;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }    
}

//inheriting base class(Account)
class SAccount extends Account{
    
    long a, w;

    @Override
    public String toString() {
        return "This is User deposite: "+a+"\nThis is withdrawn: "+w;
    }

    public void deposite(long amt){
        balance+=amt;
        a=amt;
    }
    public void withdrawn(long amt){
        balance-=amt;
        w = amt;
    }
    

    //call getter method

    public double test(long amt){
        return amt;
    }
    
    // public double fixedDeposite(int AccN, int b){
    //     return 0;
    // }
    // public double lequidate(int AccN, int b){
    //     return 0;
    // }
}

//inheriting base class(Account)
class LoanAccount extends Account{
    public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }
} 

