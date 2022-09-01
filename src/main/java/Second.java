// Menggunakan beberapa class
// Anda juga dapat membuat objek kelas dan mengaksesnya di kelas lain.
// Ini sering digunakan untuk organisasi kelas yang lebih baik (satu kelas memiliki semua atribut dan metode,
// sedangkan kelas lain memegang main()metode (kode yang akan dieksekusi)).

// Ingat bahwa nama file java harus sesuai dengan nama kelas. Dalam contoh ini, kami telah membuat dua file di direktori/folder yang sama:
public class Second {
    public static void main(String[] args) {
        Main myObj1 = new Main();
        Main myObj2 = new Main();

        System.out.println(myObj1.x * myObj2.x);
    }
}
