import java.util.Scanner;

public class StudiKasus121 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable declarations based on the flowchart
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        // Input
        System.out.print("Masukkan jumlah cup  : ");
        jumlahCup = input.nextInt();
        System.out.print("Masukkan uang bayar  : ");
        uangBayar = input.nextInt();

        // Calculate total price, initial discount = 0
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        // 10% discount if total price >= Rp100,000
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga          : Rp " + totalHarga);
        System.out.println("Diskon               : Rp " + diskon);
        System.out.println("Total bayar          : Rp " + totalBayar);

        // Check whether the money is enough
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian            : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }

        input.close();
    }
}
