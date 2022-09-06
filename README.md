# Interface
> Cara lain untuk membuat abstraction di java, adalah dengan interface
> 
> Interface adalah class abstract sepenuhnya yang digunakan untuk mengelompokan method terkait dengan bpdy kosong

> Catatan untuk interface: 
> - Seperti abstract class, interface tidak dapat digunkan untuk membuat object
> - Method interface tidak memiliki body, body disediakan oleh class "implement"
> - Pada implementasi interface, harus mengganti semua method nya @overriding
> - Methode interface secara default abstract dan public
> - Attribute interface secara default public, static dan final
> - interface tidak dapat berisi constructor(karena tidak dapat digunakan untuk membuat object)
>
> Mengapa dan kapan menggunakan interface?
>  - Untuk mencapai keamanan - sembunyikan detail tertentu dan hanya tampilkan detail penting dari suatu objek (interface).
>  - Java tidak mendukung "multiple inheritance" (Sebuah class hanya dapat mewarisi dari satu superclass).
>  - Namun itu dapat dicapai dengan interface, karena class dapat mengimplementasikan banyak interface.
>  - Catatan: untuk mengimplementasi beberapa interface, pisahkan dengan koma (,)