import java.util.Scanner;
public class StudiKasus2_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.println("Pilih Jenis Kegiatan:");
        System.out.println("1. BELMAWA");
        System.out.println("2. BAKORMA");
        System.out.println("3. MANDIRI");
        System.out.println("4. PKM");
        System.out.println("5. LAINNYA");
        System.out.print("Pilih jenis kegiatan (1-5) : ");
        int pilihanKegiatan = sc.nextInt();

        String status = "";

        if (pilihanKegiatan >= 1 && pilihanKegiatan <= 3) {
            
            System.out.print("Jumlah dokumen : ");
            int jumlahDokumen = sc.nextInt();

            System.out.print("Peringkat juara : ");
            int peringkatJuara = sc.nextInt();

            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                if (jumlahDokumen == 4) {
                    status = "Selamat! Anda memenuhi syarat dan berhak menerima dana penghargaan.";
                } else {
                    int kurang = 4 - jumlahDokumen;
                    status = "Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Peringkat juara tidak memenuhi syarat. Dana penghargaan tidak diberikan.";
            }

        } else if (pilihanKegiatan == 4) {
            
            System.out.print("Jumlah dokumen : ");
            int jumlahDokumen = sc.nextInt();

            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int statusPKM = sc.nextInt();

            if (statusPKM == 1) {
                if (jumlahDokumen == 4) {
                    status = "Selamat! Anda memenuhi syarat dan berhak menerima dana penghargaan.";
                } else {
                    int kurang = 4 - jumlahDokumen;
                    status = "Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "PKM tidak lolos pendanaan. Dana penghargaan tidak diberikan.";
            }

        } else {
            status = "Jenis kegiatan tidak memperoleh dana penghargaan.";
        }

        System.out.println("Status : " + status);

        sc.close();
    }
}