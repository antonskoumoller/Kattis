package KikiBoba;


import java.util.Scanner;

public class KikiBoba {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int [] count = countKandB(str); 

        if (count[0] == 0 && count[1] == 0) {
            System.out.println("none");
        } else if (count[0] == count[1]) {
            System.out.println("boki");
        } else if (count[0] < count[1]) {
            System.out.println("boba");
        } else if (count[0] > count[1]) {
            System.out.println("kiki");
        }

    }

    public static int[] countKandB(String str) {
        int len = str.length();
        int[] count = new int[2];
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'k') count[0]++;
            if (str.charAt(i) == 'b') count[1]++;
        }

        return count;
    }
}
