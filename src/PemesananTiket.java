import java.text.DecimalFormat;
import java.util.Locale;

class PemesananTiket { //kelas untuk proses pemesanan tiket
    // Do your magic here...
    //inisialisasi atribut
    private String namaPemesan;
    private String jenisTiket;
    private double totalHarga;

    //konstruktor dengan parameter
    public PemesananTiket(String namaPemesan, String jenisTiket){
        this.namaPemesan = namaPemesan;
        this.jenisTiket = jenisTiket;
        this.totalHarga = hitungTotalharga(jenisTiket);
    }

    //method untuk menghitung total harga berdasarkan jenis tiket
    private double hitungTotalharga(String jenisTiket){
        //inisialisasi objek untuk menyimpan jenis tiket yang dipilih
        TiketKonser tiket = null;

        //dengan polimorfisme untuk mendapatkan harga berdasar tiap jenis tiket dalam kelas terpisah
        switch (jenisTiket){
            case "CAT8":
                tiket = new CAT8();
                break;
            case "CAT1":
                tiket = new CAT1();
                break;
            case "FESTIVAL":
                tiket = new FESTIVAL();
                break;
            case "VIP":
                tiket = new VIP();
                break;
            case "UNLIMITED EXPERIENCE":
                tiket = new VVIP();
                break;
            default:
                System.out.println("Jenis tiket tidak valid.");
        }

        if (tiket != null){ //jika valid, akan mengembalikan harga dengan memanggil getharga dari kelas TiketKonser
            return tiket.getHarga();
        } else { //jika tidak, akan mencetak pesan case default dan mengembalikan nilai 0
            return 0;
        }
    }

    //method untuk mencetak nota pemesanan
    public void cetakNotaPemesanan(){
        //konversi totalHarga dari IDR ke USD dengan memanggil method konversi
        double totalHarga_USD = konversiIDRkeUSD(totalHarga);

        // penggunaan format USD dengan locale Inggris (US)
        DecimalFormat df = (DecimalFormat) DecimalFormat.getInstance(Locale.US);
        //dengan tanda titik (.) sebagai pemisah
        df.applyPattern("0.0E0");
        // totalHarga diubah menjadi format string
        String totalHarga_USD_String = df.format(totalHarga_USD);

        //output cetak nota pemesanan
        System.out.println("\n----- Detail Pemesanan -----");
        System.out.println("Nama Pemesan: "+namaPemesan);
        System.out.println("Kode Booking: "+Main.generateKodeBooking());
        System.out.println("Tanggal Pesanan: "+Main.getCurrentDate());
        System.out.println("Tiket yang dipesan: "+jenisTiket);
        System.out.printf("Total Harga: %s USD", totalHarga_USD_String);
    }

    //method konversi totalHarga IDR menjadi USD
    private double konversiIDRkeUSD(double hargaPerIDR) {
        //kurs 1 USD = Rp. 14000
        double kursPerUSD = 14000;
        return hargaPerIDR / kursPerUSD;
    }
}
