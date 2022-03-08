import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("yılı giriniz:");
        int yıl = s.nextInt();

        boolean yılhesap = yıl % 100 == 0 && yıl % 400 != 0;
        if (yılhesap) {
            System.out.print("Artık yıl değildir");
        } else {
            if (yıl % 4 == 0) {
                System.out.print("Artık yıldır");
            } else {
                System.out.print("Artık yıl değildir");
            }
        }
    }
}

