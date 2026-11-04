import java.util.Scanner;

public class StudiKasus221 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa  : ");
        String nama = input.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = input.nextLine().trim();

        String status;

        // Level 1: activity type
        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA")
                || jenis.equalsIgnoreCase("MANDIRI")) {
            // Competition: ask for documents and rank
            System.out.print("Jumlah dokumen  : ");
            int dokumen = input.nextInt();
            System.out.print("Peringkat juara : ");
            int peringkat = input.nextInt();

            // Level 2: rank must be 1, 2, or 3
            if (peringkat >= 1 && peringkat <= 3) {
                // Level 3: document completeness
                if (dokumen == 4) {
                    status = "Berhak menerima dana penghargaan (juara " + peringkat + ").";
                } else {
                    status = "Dokumen tidak lengkap (kurang " + (4 - dokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Tidak berhak menerima dana penghargaan (hanya untuk juara 1/2/3).";
            }

        } else if (jenis.equalsIgnoreCase("PKM")) {
            // PKM: ask for documents and funding status
            System.out.print("Jumlah dokumen  : ");
            int dokumen = input.nextInt();
            System.out.print("Status pendanaan PKM (1 = disetujui, 0 = tidak) : ");
            int pendanaan = input.nextInt();

            // Level 2: proposal approved?
            if (pendanaan == 1) {
                // Level 3: document completeness
                if (dokumen == 4) {
                    status = "Berhak menerima dana penghargaan (proposal PKM disetujui didanai).";
                } else {
                    status = "Dokumen tidak lengkap (kurang " + (4 - dokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Tidak berhak menerima dana penghargaan (proposal PKM tidak disetujui).";
            }

        } else if (jenis.equalsIgnoreCase("LAINNYA")) {
            status = "Tidak berhak menerima dana penghargaan (jenis kegiatan tidak termasuk ketentuan).";
        } else {
            status = "Jenis kegiatan tidak dikenali.";
        }

        System.out.println("Status : " + status);
        input.close();
    }
}
