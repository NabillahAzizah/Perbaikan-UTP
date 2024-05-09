abstract class TiketKonser implements HargaTiket { //kelas abstrak yang implementasikan interface
    // Do your magic here...
    //inisialisasi atribut
    protected String jenisTiket;
    //konstruktor dengan parameter
    public TiketKonser(String jenisTiket){
        this.jenisTiket = jenisTiket;
    }
    //method untuk mendapatkan harga dengan implementasi dari Interface
    public abstract int getHarga();
}
