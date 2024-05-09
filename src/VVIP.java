class VVIP extends TiketKonser { //kelas turunan
    // Do your magic here...
    //akses semua atribut dan method di kelas TiketKonser
    //konstruktor
    public VVIP(){
        //dengan nama khusus akan menginisialisasi atribut jenisTiket di kelas TiketKonser
        super("UNLIMITED EXPERIENCE");
    }

    //implementasi dari method abstrak
    @Override
    public int getHarga(){
        //harga IDR 2.000.000
        return 2000000;
    }
}