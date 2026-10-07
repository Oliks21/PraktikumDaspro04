import java.util.Scanner;
public class StudiKasus1_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon = 0, totalBayar;
        int Kembalian, Kurang;

        System.out.println("Masukkan jumlah cup: ");
        jumlahCup = input.nextInt();
        System.out.println("Masukkan jumlah uang: ");
        uangBayar = input.nextInt();

        totalHarga = jumlahCup * hargaPerCup;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        } 
            
            totalBayar = totalHarga - diskon;

            System.out.println("Total harga : Rp " +totalHarga);
            System.out.println("Diskon      : Rp " +diskon);
            System.out.println("Total bayar : Rp " +totalBayar);

        if (uangBayar >= totalBayar) {
            Kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian anda : Rp " + Kembalian);
        } else {
            Kurang = totalBayar - uangBayar;
            System.out.println("Uang anda tidak cukup, kurang Rp " + Kurang);
        }

    
        

    }
    
    
}
