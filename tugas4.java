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
// Method untuk meminta input pilihan dari pengguna
    public static int getInput(Scanner input) {
        int pilihan;
        do {
            System.out.print("Masukkan pilihan Anda (1-3): ");
            pilihan = input.nextInt();
            if (pilihan < 1 || pilihan > 3) {
                pilihan = 0;
                break;
            }
        } while (pilihan < 1 || pilihan > 3);
        return pilihan;
    }

public static void tampilkanPilihan(int pilihan) {
        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Teknik Komputer.");
                break;
            case 2:
                System.out.println("Anda memilih Arsitektur.");
                break;
            case 3:
                System.out.println("Anda memilih Teknik Sipil.");
                break;
        }
    }
}

