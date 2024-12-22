package BestaGjöfin;

import java.util.Scanner;
import java.util.stream.IntStream;

public class BestaGjofin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reps = sc.nextInt();
        sc.nextLine();
        String[] input;

        input = sc.nextLine().split(" ");

        String guest = input[0];
        int fav = Integer.parseInt(input[1]);


        for (int i = 0; i < reps-1; i++) {
            input = sc.nextLine().split(" ");
            if(fav < Integer.parseInt(input[1])) {
                fav = Integer.parseInt(input[1]);
                guest = input[0];
            }
        }
        System.out.println(guest);

    }
}
