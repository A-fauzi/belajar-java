// create class
public class Constructor {
    // menambahkan attribute car
    String carName;
    String carModel;
    int carYear;


    int x; // deklarasi attribute nilai awal

    // buat constructor pada class "()"
    public Constructor(){
        x = 5; // inisialisasi nilai dari attribute class constructor
    }

    // Parameter constructor
    // Konstruktor juga dapat mengambil parameter, yang digunakan untuk menginisialisasi atribut.
    // Contoh berikut menambahkan int y parameter ke konstruktor. Di dalam konstruktor kita set x ke y (x=y).
    // Saat kita memanggil konstruktor, kita meneruskan parameter ke konstruktor (10), yang akan menetapkan nilai x menjadi 10:
    public Constructor(int y) {
        x = y;
    }

    // Menambahkan banyak parameter constructor
    public Constructor(String carName, String carModel, int carYear){
        this.carName = carName;
        this.carModel = carModel;
        this.carYear = carYear;
    }
}
