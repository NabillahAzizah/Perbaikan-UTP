class CAT1 extends TiketKonser { //kelas turunan
    //Do your magic here...
    //akses semua atribut dan method di kelas TiketKonser
    //konstruktor
    public CAT1(){
        super("CAT1");
    }

    //implementasi dari metho abstrak
    @Override
    public int getHarga(){
        //harga IDR 650.000
        return 650000;
    }
}