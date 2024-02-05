package day32.bari.Day25;

import java.util.*;
class sec{
    public static void main(String [] args){

        // char arr [] = new char[1000];

        // char store = 'A';
        // for(char i=0; i<1000; i++)

        // arr[i] = i;
        
        // for(char i=0; i<1000; i++){
        //     System.out.print(arr[i]+ " ");
        // }
        // System.out.print("\n" + arr[9]+ " jfkdhfskdm");


        ArrayList<Character> list = new ArrayList<>();

        for(char i=0; i<1000; i++){
            list.add(i);
        }

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

    }
}
