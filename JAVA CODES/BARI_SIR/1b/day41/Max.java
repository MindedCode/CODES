package day41;

public class Max {
    static void max(char CArr[]) {
        for (int i = 0; i < CArr.length; i++) {
            if (CArr[i] == 9) {
                System.out.print(i + " " + CArr[i]);
                // System.exit(3);
            }
            
        }
        System.out.println("Not Present element");
    }

    public static void main(String[] args) {
        char CArr[] = new char[7];

        for (int i = 0; i < CArr.length; i++) {
            CArr[i] = (char) (i + 3);
        }

        int ch = 0;
        for (char c : CArr) {
            ch = (char) c;
            System.out.print(ch + " ");
        }

        System.out.println("\nHum hai kon");

        max(CArr);

        System.out.println("Aap ho kon");

        System.out.println(" ");
        // find max elements
        int max = 0;
        for (int c : CArr) {
            if (c > max) {
                max = c;
            }
            // no imp bcoz there is only condition
        }
        System.out.println("This is a Maximum element in existing Array : " + max);

        // Searching Eles
        // for (char c : CArr) {
        // if(c==9) System.out.println();
        // }

        System.out.println("skjhfd");
        System.out.println("Thksfjskhjfsk");
    }
}
