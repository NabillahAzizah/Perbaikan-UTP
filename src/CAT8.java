public class CAT8 extends TiketKonser { //kelas turunan
    //Do your magic here...
    //akses semua atribut dan method di kelas TiketKonser
    //konstruktor
    public CAT8(){
        super("CAT8");
    }

    //implementasi dari method abstrak
    @Override
    public int getHarga(){
        //harga IDR 450.000
        return 450000;
    }
}