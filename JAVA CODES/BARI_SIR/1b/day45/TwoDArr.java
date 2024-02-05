package day45;

public class TwoDArr {
public static void main(String[] args) {
    System.out.println("Hii Ganesh!\n");

    int a[][] = new int[3][4];

    System.out.println("Row of Array length : "+a.length);
    System.out.println("One column of Array length : "+a[0].length+"\n");

    a[0][0] = 1;
    a[0][1] = 3;
    a[0][2] = 2;
    a[1][0] = 4;
    a[1][1] = 6;
    a[1][2] = 5;

    // a[] = {1,3,4,5};
    
for (int[] i : a) {
    for (int j : i) {
        System.out.print(j+" ");
    }
    System.out.println();
}

System.out.println();

    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println();

    // for (var each : a) {
    //     for (var j : a[0]) {
    //         System.out.println(j);
            
    //     }
    // }
}
}
