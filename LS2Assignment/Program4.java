package LS2Assignment;

import java.util.Scanner;

public class Program4 {

	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a text: ");
        char[] str = scanner.nextLine().toCharArray();
        System.out.print("Reverse text: ");
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(str[i]);
        }
        System.out.print("\n");
    }
}


