import java.util.Scanner;

public class Deleni {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Zadej číslo");
        int deleni = scan.nextInt();
        if(deleni % 7 == 0) {
            System.out.println("Číslo je dělitelné");
        }
        else {
            System.out.println("Čislo není dělitelné");
        }
    }
}