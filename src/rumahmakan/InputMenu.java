package rumahmakan;

import java.util.Scanner;

public class InputMenu {
    private static Scanner sc = new Scanner(System.in);
    public static int inputInt(String pesan) {
        while (true) {
            try {
                System.out.print(pesan);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input harus angka!");
            }
        }
    }
    
    public static String inputString(String pesan) {
        System.out.print(pesan);
        return sc.nextLine();
    }
}
