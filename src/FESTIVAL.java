class FESTIVAL extends TiketKonser { //kelas turunan
    //Do your magic here...
    //akses semua atribut dan method di kelas TiketKonser
    //konstruktor
    public FESTIVAL() {
        super("FESTIVAL");
    }

    //implementasi dari method abstrak
    @Override
    public int getHarga(){
        //harga IDR 800.000
        return 800000;
    }
}
