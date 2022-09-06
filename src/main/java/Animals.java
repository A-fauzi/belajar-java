// Interface
interface Animals {
    public void animalSound(); // Interface method (does not have a body)
    public void run(); // interface method (Does not have a body)
}

// Untuk mengakses metode interface, interface harus "diimplementasikan" (seperti yang diwarisi) oleh kelas lain dengan implements kata kunci (bukan extends).
// Tubuh metode antarmuka disediakan oleh kelas "implement":
