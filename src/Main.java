import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan jari-jari yang anda inginkan = ");
        double radius = input.nextDouble();

        try {
            double luasLingkaran = Lingkaran.hitungLuas(radius);
            System.out.println("Luas lingkaran: " + luasLingkaran);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

