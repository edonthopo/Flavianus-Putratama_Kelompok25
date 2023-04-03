import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        System.out.println("Selamat datang, " + nama + "!");
        System.out.println("Silakan pilih jurusan:");
        System.out.println("1. Teknik Komputer");
        System.out.println("2. Arsitektur");
        System.out.println("3. Teknik Sipil");

        int pilihan = getInput(input);

        if (pilihan == 0) {
            System.out.println("Jurusan ini tidak tersedia.");
        } else {
            tampilkanPilihan(pilihan);
        }
    }
