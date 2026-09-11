import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Barang 1
        System.out.print("Nama barang 1   : ");
        String namaBarang1 = scanner.nextLine();

        System.out.print("Harga satuan    : ");
        int harga1 = scanner.nextInt();

        System.out.print("Jumlah          : ");
        int jumlah1 = scanner.nextInt();

        scanner.nextLine();

        // Barang 2
        System.out.print("Nama barang 2   : ");
        String namaBarang2 = scanner.nextLine();

        System.out.print("Harga satuan    : ");
        int harga2 = scanner.nextInt();

        System.out.print("Jumlah          : ");
        int jumlah2 = scanner.nextInt();

        scanner.nextLine();

        // Barang 3
        System.out.print("Nama barang 3   : ");
        String namaBarang3 = scanner.nextLine();

        System.out.print("Harga satuan    : ");
        int harga3 = scanner.nextInt();

        System.out.print("Jumlah          : ");
        int jumlah3 = scanner.nextInt();

        // Menghitung subtotal
        int subtotal1 = harga1 * jumlah1;
        int subtotal2 = harga2 * jumlah2;
        int subtotal3 = harga3 * jumlah3;

        // Menghitung total belanja
        int totalBelanja = subtotal1 + subtotal2 + subtotal3;

        // Input uang dibayar
        System.out.print("Uang dibayar    : ");
        int uangDibayar = scanner.nextInt();

        // Menghitung kembalian
        int kembalian = uangDibayar - totalBelanja;

        // Menampilkan struk
        System.out.println();
        System.out.println("===== STRUK BELANJA =====");

        System.out.println(namaBarang1 + " " + jumlah1 + " x " + harga1 + " = " + subtotal1);
        System.out.println(namaBarang2 + " " + jumlah2 + " x " + harga2 + " = " + subtotal2);
        System.out.println(namaBarang3 + " " + jumlah3 + " x " + harga3 + " = " + subtotal3);

        System.out.println("-------------------------");
        System.out.println("Total belanja = " + totalBelanja);
        System.out.println("Uang dibayar  = " + uangDibayar);
        System.out.println("Kembalian     = " + kembalian);

        scanner.close();
    }
}