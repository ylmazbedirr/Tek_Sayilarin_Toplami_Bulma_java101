import java.util.Scanner;

public class Pratik2_Tek_Sayilarin_Toplami_Bulma {
    public static void main(String[] args) {

        int n;
        int total = 0;
        Scanner input = new Scanner(System.in);


        do {
            System.out.print("Sayi giriniz :");
            n = input.nextInt();

            if ((n % 2 == 0) && (n % 4 == 0)) {
                total += n;
            }
        } while (n % 2 == 0);

        System.out.println("Toplam Sayi :" + total);
    }
}
