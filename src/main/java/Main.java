import java.awt.*;

/**
 * Untuk penamaan class di java harus sama dengan nama file
 */
public class Main {

    /**
     * fungsi main adalah fungsi utama untuk menjalankan program di Java
     *
     * @param args
     */
    public static void main(String[] args) {
        // Array
        String[] name = {"User 1", "User 2",  "User 3", "User 4", "User 5"};

        // Access element in array by index
        System.out.println(name[0]);

        // Cek panjang element pada array
        System.out.println(name.length);

        // Mengganti element pada array berdasarkan index
        name[0] = "User 1 Update";
        System.out.println(name[0]);


        // Loop Through an Array
        // Anda dapat mengulang elemen array dengan forloop, dan menggunakan length properti untuk menentukan berapa kali loop harus dijalankan.
        //
        // Contoh berikut menampilkan semua elemen dalam array mobil :
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println("index ke " + i + ":" + cars[i]);
        }

        // Menggunakan foreach untuk mengakses array
        for (String e : cars){
            System.out.println(e);
        }

        //  Arrays multidimensi
        // Array multidimensi adalah array dari array.
        int[][] arrMulDim = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(arrMulDim[0][2]); // 3

        // Kita juga bisa menggunakan for loopinside another for loopuntuk mendapatkan elemen array dua dimensi (kita masih harus menunjuk ke dua indeks):
        for (int i = 0; i < arrMulDim.length; ++i) {
            for(int j = 0; j < arrMulDim[i].length; ++j) {
                System.out.println(arrMulDim[i][j]);
            }
        }
    }

}
