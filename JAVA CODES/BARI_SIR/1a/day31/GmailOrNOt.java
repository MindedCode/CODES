package day32.bari.day31;

class GmailOrNot{

            //using boolean bl = str.contains()
    // static boolean gmailOrN(String str){
    //     boolean flag = str.contains("@");
    //     boolean flag1 = str.contains("gmail.com");
    //     if(flag == flag1) return flag;
    //     else return false;
    // }

    static void gmailOrN(String str){
        int i = str.indexOf('@');
        String uName = str.substring(0, i);
        String domain = str.substring(i+1, str.length());

        System.out.println("Username : "+ uName);
        System.out.println("Domain name: "+ domain);

        System.out.println(domain.startsWith("gmail"));
        System.out.println(str.endsWith(domain));


        
    }
    public static void main(String[] args) {
        // if(gmailOrN("abc@gmail.com")){
        //     System.out.println("This Gmail is valid");
        // }
        // else System.out.println("Not is valid gmail you enter");

        gmailOrN("abc@gmail.com");
    }
}