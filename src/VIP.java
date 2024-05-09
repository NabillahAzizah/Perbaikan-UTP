class VIP extends TiketKonser { //kelas turunan
    // Do your magic here...
    //akses semua atribut dan method di kelas TiketKonser
    //konstruktor
    public VIP(){
        super("VIP");
    }

    //implementasi dari method abstrak
    @Override
    public int getHarga(){
        //harga IDR 1.600.000
        return 1600000;
    }
}
