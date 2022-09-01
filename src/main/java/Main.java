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
        String day = "ddd";

        // Java Switch Statements
        // Gunakan switchpernyataan untuk memilih salah satu dari banyak blok kode yang akan dieksekusi.
        switch (day.toLowerCase()) {
            case "senin":
                System.out.println("Kerja");
                break;
            case "selasa":
                System.out.println("Kerja");
                break;
            case "rabu":
                System.out.println("Kerja");
                break;
            case "kamis":
                System.out.println("Kerja");
                break;
            case "jumat":
                System.out.println("Kerja");
                break;
            case "sabtu":
                System.out.println("Libur");
                break;
            case "minggu":
                System.out.println("Libur");
                break;

                // default akan dijalankan jika kondisi tidak ada kecocokan
            default:
                System.out.println("Hari tidak ada");

        }
    }

}
