package Aldur;
import java.util.Scanner;

class Aldur {
    
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        int min = Integer.MAX_VALUE;
        int temp = Integer.MAX_VALUE;
        
        
        while (sc.hasNextInt()) {
            temp = sc.nextInt();
            if (temp < min) min = temp;
        }
        System.out.println(min);
    }
} 