// package AToweringProblem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class AToweringProblem {
    public static void main(String[] args) {
        // File file = new File("AToweringProblem/input.txt");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> boxes = new ArrayList<Integer>();

        for (int i = 0; i < 6; i++) {
            boxes.add(sc.nextInt());
        }
        boxes.sort(null);
        Collections.reverse(boxes);

        int heightA = sc.nextInt();
        int heightB = sc.nextInt();

        int a1;
        int a2;
        int a3;
        int b1;
        int b2;
        int b3;
        // System.out.println(boxes.toString());
        // int i = 1;
        // int j = i+1;
        // int k = k+1;
        int[] otherBox;
        for (int i = 0; i < boxes.size(); i++) {
            for (int j = i + 1; j < boxes.size(); j++) {
                for (int k = j + 1; k < boxes.size(); k++) {
                    a1 = boxes.get(i);
                    a2 = boxes.get(j);
                    a3 = boxes.get(k);
                    if (boxHeight(a1, a2, a3) == heightA) {
                        otherBox = findOtherTower(i, j, k);
                        b1 = boxes.get(otherBox[0]);
                        b2 = boxes.get(otherBox[1]);
                        b3 = boxes.get(otherBox[2]);
                        // System.out.println(a1 + " " +a2 + " " + a3 + " " + b1 + " " + b2 + " " + b3);
                        if (boxHeight(b1, b2, b3) == heightB) {
                            System.out.println(a1 + " " + a2 + " " + a3 + " " + b1 + " " + b2 + " " + b3);
                            return;
                        }

                    } else if (boxHeight(a1, a2, a3) == heightB) {
                        otherBox = findOtherTower(i, j, k);
                        b1 = boxes.get(otherBox[0]);
                        b2 = boxes.get(otherBox[1]);
                        b3 = boxes.get(otherBox[2]);
                        if (boxHeight(b1, b2, b3) == heightA) {
                            System.out.println(b1 + " " + b2 + " " + b3 + " " + a1 + " " + a2 + " " + a3);
                            return;
                        }
                    }
                }
            }

        }

        // System.out.println("finished for loops");

    }

    public static int[] findOtherTower(int x, int y, int z) {
        int[] output = new int[3];
        int firstBox = 0;
        int secondBox = 0;
        int thirdBox = 0;
        // System.out.println(x);
        // System.out.println(y);
        // System.out.println(z);

        for (int i = 0; i < 6; i++) {
            if (i != x && i != y && i != z) {
                firstBox = i;
                break;
            }
        }

        for (int i = 0; i < 6; i++) {
            if (i != x && i != y && i != z && i != firstBox) {
                secondBox = i;
                break;
            }
        }

        for (int i = 0; i < 6; i++) {
            if (i != x && i != y && i != z && i != firstBox && i != secondBox) {
                thirdBox = i;
                break;
            }
        }

        // System.out.println(firstBox);
        // System.out.println(secondBox);
        // System.out.println(thirdBox);

        output[0] = firstBox;
        output[1] = secondBox;
        output[2] = thirdBox;

        return output;

    }

    public static int boxHeight(int x, int y, int z) {
        return x + y + z;
    }

}
