package ÚllenDúllenDoff;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UllenDullen {
public static void main(String[] args) throws FileNotFoundException  {
    File file = new File("ÚllenDúllenDoff/input.txt");
    Scanner sc = new Scanner(file);
    int numFriends = sc.nextInt();
    sc.nextLine();
    String[] friends = sc.nextLine().split(" ");

    if(numFriends == 13) {
        System.out.println(friends[12]);
        return;
    }
    if(13 % numFriends == 0) {
        System.out.println(friends[0]);
        return;
    } 
    System.out.println(friends[13 % numFriends -1]);

    }
}
