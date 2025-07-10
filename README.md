# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi rumah makan prasmanan menggunakan Java sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini menerima input berupa daftar menu makanan dan minuman, beserta stoknya. Pengguna dapat memilih menu yang diinginkan, dan sistem akan mengurangi stok serta menghitung total harga. Aplikasi ini menampilkan struk akhir yang berisi semua pesanan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, 'MenuItem', 'MenuMakanan', 'MenuMinuman', 'Kasir', dan 'Main' adalah contoh dari class.
```bash
public class MenuItem { ... }
public class MenuMakanan extends MenuItem { ... }
public class MenuMinuman extends MenuItem { ... }
public class Kasir { ... }
public class Main { ... }
```

2. **Object** adalah instance dari class. Pada kode ini, 'MenuItem nasi = new MenuMakanan(...)' adalah contoh pembuatan object.
```bash
MenuItem[] daftarMenu = { new MenuMakanan(...), new MenuMinuman(...) };
Kasir kasir = new Kasir();
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, 'nama', 'harga', dan 'stok' adalah contoh atribut.
```bash
private String nama;
private double harga;
private int stok;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class 'MenuItem', 'MenuMakanan', dan 'MenuMinuman'.
```bash
public MenuItem(String nama, double harga) { ... }
```

5. **Mutator** setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, 'setStok' adalah contoh method mutator.
```bash
public void setStok(int stok) { ... }
```

6. **Accessor** getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, 'getNama', 'getHarga', dan 'getStok' adalah contoh method accessor.
```bash
public int getStok() { ... }
public String getNama() { ... }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut 'nama', 'harga', dan 'stok' dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.
```bash
private String nama;
private int stok;
// Akses melalui getter/setter
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, 'MenuMakanan' dan 'MenuMinuman' mewarisi 'MenuItem' dengan sintaks 'extends'.
```bash
public class MenuMakanan extends MenuItem { ... }
```

9. **Overriding (Polymorphism)** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Pada kode ini, method 'info()' di class 'MenuItem' dioverride di class 'MenuMakanan' dan 'MenuMinuman' untuk menampilkan informasi spesifik sesuai jenisnya.
```bash
@Override
public String info() { ... }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi 'if else' dalam method 'tambahPesanan' di class 'Kasir'.
```bash
if (item.getStok() > 0) { ... } else { ... }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop 'for' untuk menampilkan daftar menu dan pesanan.
```bash
for (MenuItem item : daftarMenu) { ... }
```

12. **Input Output Sederhana**digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class 'Scanner' untuk menerima input dan method 'System.out.println' untuk menampilkan output.
```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan stok: ");
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, 'MenuItem[] daftarMenu = new MenuItem[5];' adalah contoh penggunaan array, dan 'ArrayList<MenuItem>' digunakan untuk menyimpan pesanan.
```bash
MenuItem[] daftarMenu = new MenuItem[5];
ArrayList<MenuItem> daftarPesanan = new ArrayList<>();
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan 'try catch' untuk menangani kesalahan input user.
```bash
try {
    return Integer.parseInt(input);
} catch (NumberFormatException e) {
    System.out.println("Input harus angka!");
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama:  Mutmainatul Zulfa
NPM:   2310010387
