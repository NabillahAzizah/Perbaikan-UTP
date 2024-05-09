import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main { //kelas utama
    public static void main(String[] args) {
        //Do your magic here...
        //input dari pengguna yaitu nama pembeli dan tiket yang dipilih
        Scanner in = new Scanner(System.in);
        //inisialisasi secara global
        String namaPemesan;
        String jenisTiket;

        //kondisi tetap valid untuk loop tampilan terbaca oleh pengguna
        while (true){
            System.out.println("\nSelamat datang di Pemesanan Tiket!");
            System.out.print("Masukkan nama pemesan: ");
            namaPemesan = in.nextLine();

            System.out.println("Pilih jenis tiket:");
            System.out.println("1. CAT 8");
            System.out.println("2. CAT 1");
            System.out.println("3. FESTIVAL");
            System.out.println("4. VIP");
            System.out.println("5. UNLIMITED EXPERIENCE");
            System.out.print("Masukkan pilihan: ");
            int pilihTiket = in.nextInt();

            //membaca inputan angka 1-5 disimpan sebagai pilihTiket
            switch (pilihTiket){
                case 1:
                    jenisTiket = "CAT8";
                    break;
                case 2:
                    jenisTiket = "CAT1";
                    break;
                case 3:
                    jenisTiket = "FESTIVAL";
                    break;
                case 4:
                    jenisTiket = "VIP";
                    break;
                case 5:
                    jenisTiket = "UNLIMITED EXPERIENCE";
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    continue;
                    //perulangan tetap dilanjutkan
            }
            break;
            //jika valid, perulangan berhenti dan dilanjutkan program selanjutnya
        }

        //membuat objek PemesananTiket untuk menyimpan semua inputan sebelumnya
        PemesananTiket orderan = new PemesananTiket(namaPemesan, jenisTiket);

        //mencetak nota pemesanan dengan memanggil method dari objek orderan
        orderan.cetakNotaPemesanan();
    }

    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan kode pesanan atau kode booking
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String generateKodeBooking() {
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int length = 8;

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan waktu terkini
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }
}