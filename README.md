# Modifer
> Access modifier digunakan untuk mengatur tingkat akses untuk class, attribute, method, dan constructor
> 
> modifier dibagi menjadi 2 group
> - Access Modifiers -> mengontrol tingkat akses
> - Non-Access Modifiers ->  tidak mengontrol tingkat akses, tetapi menyediakan fungsionalitas lain
> 

## Access modifier
> Untuk class dapat menggunakan public atau default
> > public : class dapat di akses oleh class lain
> > 
> > default: Class hanya dapat diakses oleh Class dalam paket yang sama.
>
> Untuk attribute, method, dan constructor
> > public: Code dapat di akses oleh class lain
> >
> > private: Kode hanya dapat diakses di dalam kelas yang dideklarasikan
> >
> > default: Kode hanya dapat diakses dalam paket yang sama.
> >
> > protected: Kode dapat diakses dalam paket dan subkelas yang sama.

## Non Access Modifier
> Untuk Class, dapat menggunakan salah satu final atau abstract
> > final: Class tidak dapat di warisi oleh Class lain
> > 
> > abstract: Kelas tidak dapat digunakan untuk membuat objek (Untuk mengakses kelas abstrak, kelas harus diwarisi dari kelas lain