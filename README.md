# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data Kendaraan menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa idKendaraan dan namaKendaraan dari Kendaraan, dan memberikan output berupa informasi detail dari idKendaraan tersebut seperti jenis kendaraan, tahun produksi dan warna kendaraan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Kendaraan`, `KendaraanDetail`, dan `KendaraanBeraksi` adalah contoh dari class.

```bash
public class Kendaraan {
    ...
}

public class KendaraanDetail extends Kendaraan {
    ...
}

public class KendaraanBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `kendaraan[i] = new KendaraanDetail(idKendaraan, namaKendaraan);` adalah contoh pembuatan object.

```bash
kendaraan[i] = new KendaraanDetail(idKendaraan, namaKendaraan);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `idKendaraan` dan `namaKendaraan` adalah contoh atribut.

```bash
String idKendaraan;
String namaKendaraan;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Kendaraan` dan `KendaraanDetail`.

```bash
public Kendaraan(String idKendaraan, String namaKendaraan) {
    this.idKendaraan = idKendaraan;
    this.namaKendaraan = namaKendaraan;
}

public KendaraanDetail(String idKendaraan, String namaKendaraan) {
    super(idKendaraan, namaKendaraan);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setIdKendaraan` dan `setNamaKendaraan` adalah contoh method mutator.

```bash
public void setIdKendaraan(String idKendaraan) {
    this.idKendaraan = idKendaraan;
}

public void setNamaKendaraan(String namaKendaraan) {
    this.namaKendaraan = namaKendaraan;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getIdKendaraan`, `getNamaKendaraan`, `getJenis`, `getTahunProduksi`, dan `getWarna`adalah contoh method accessor.

```bash
public String getIdKendaraan() {
    return idKendaraan;
}

public String getNamaKendaraan() {
    return namaKendaraan;
}

public String getJenis() {
    String kodeJenis = getIdKendaraan().substring(0, 2);
    if(kodeJenis.equals("MO")) {     
        return "Motor";
    }else if(kodeJenis.equals("MB")) {
        return "Mobil";
    }else if(kodeJenis.equals("TR")) {
        return "Truk";
    }else if(kodeJenis.equals("BU")) {
        return "Bus";
    }else {
        return "Jenis Kendaraan Lain";
    }
}

public int getTahunProduksi() {
    return Integer.parseInt(getIdKendaraan().substring(2, 6));
}

public String getWarna() {
    String kodeWarna = getIdKendaraan().substring(6, 8);
    switch(kodeWarna) {
        case "RD":
            return "Merah";
        case "BL":
            return "Biru";
        case "BK":
            return "Hitam";
        case "WT":
            return "Putih";
        default:
            return "Warna Lain";           
    }
}

```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `idKendaraan` dan `namaKendaraan` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String idKendaraan;
private String namaKendaraan;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `KendaraanDetail` mewarisi `Kendaraan` dengan sintaks `extends`.

```bash
public class KendaraanDetail extends Kendaraan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `kendaraanInfo(String)` di `Kendaraan` merupakan overloading method `kendaraanInfo` dan `kendaraanInfo` di `KendaraanDetail` merupakan override dari method `kendaraanInfo` di `Kendaraan`.

```bash
public String kendaraanInfo(String jenisBahanBakar) {
    return kendaraanInfo() + 
           "\nJenis Bahan Bakar: " + jenisBahanBakar;
}

@Override
public String kendaraanInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getJenis` dan seleksi `switch` dalam method `getWarna`.

```bash
public String getJenis() {
    String kodeJenis = getIdKendaraan().substring(0, 2);
    // Seleksi if else
    if(kodeJenis.equals("MO")) {     
        return "Motor";
    }else if(kodeJenis.equals("MB")) {
        return "Mobil";
    }else if(kodeJenis.equals("TR")) {
        return "Truk";
    }else if(kodeJenis.equals("BU")) {
        return "Bus";
    }else {
        return "Jenis Kendaraan Lain";
    }
}

public String getWarna() {
    String kodeWarna = getIdKendaraan().substring(6, 8);
    // Seleksi switch
    switch(kodeWarna) {
        case "RD":
            return "Merah";
        case "BL":
            return "Biru";
        case "BK":
            return "Hitam";
        case "WT":
            return "Putih";
        default:
            return "Warna Lain";           
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i = 0; i < kendaraan.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Id Kendaraan " + (i+1) + "\t\t: ");
String idKendaraan = scanner.nextLine();

System.out.println("================================");
System.out.println("DATA KENDARAAN " + (i + 1));
System.out.println("================================");
System.out.println(kendaraan[i].kendaraanInfo() + "\n");
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `KendaraanDetail[] kendaraan = new KendaraanDetail[2];` adalah contoh penggunaan array.

```bash
KendaraanDetail[] kendaraan = new KendaraanDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (NumberFormatException e) {
    System.out.println("Kesalahan Format Nomor: " + e.getMessage());
} catch (StringIndexOutOfBoundsException e) {
    System.out.println("Kesalahan Format Id Kendaraan: " + e.getMessage());
} catch (Exception e) {
    System.out.println("Kesalahan Umum: " + e.getMessage());
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

Nama: Muhammad Irwan
NPM: 2210010375
