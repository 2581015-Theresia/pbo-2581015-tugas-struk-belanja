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