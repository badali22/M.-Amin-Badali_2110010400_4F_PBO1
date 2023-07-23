# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi Cek Nomor Resi Ekspedisi menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa Nama dan Nomor RESI, dan memberikan output berupa informasi detail dari Nomor Resi tersebut seperti Kode Provinsi, Kode Kota/kabupaten, Nama Eksedisi dan Nomor Registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `CekResi`, `CekresiDetail`, dan `CekresiBeraksi` adalah contoh dari class.

```bash
public class CekResi {
    ...
}

public class CekresiDetail extends CekResi {
    ...
}

public class CekresiBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `resi1[i] = new CekresiDetail(nama, resi);` adalah contoh pembuatan object.

```bash
resi1[i] = new CekresiDetail(nama, resi);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `resi` adalah contoh atribut.

```bash
String nama;
String resi;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `CekResi` dan `CekresiDetail`.

```bash
public CekResi(String nama, String resi) {
        this.nama = nama;
        this.resi = resi;
}

public CekresiDetail(String nama, String resi) {
        super(nama, resi);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setResi` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
}

public void setResi(String resi) {
        this.resi = resi;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getResi`, `getProvinsi`, `getKabupaten`, `getEkspedisi`, dan `getNoReg` adalah contoh method accessor.

```bash
public String getNama() {
        return nama;
}

public String getResi() {
        return resi;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `resi` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String resi;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `CekresiDetail` mewarisi `Cekresi` dengan sintaks `extends`.

```bash
public class CekresiDetail extends CekResi{
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Cekresi` merupakan overloading method `displayInfo` dan `displayInfo` di `CekresiDetail` merupakan override dari method `displayInfo` di `CekResi`.

```bash
public String displayInfo(String ekspedisi){
        return displayInfo() + "\nEkspedisi : "+ekspedisi;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getProvinsi` dan seleksi `switch` dalam method `getKabupaten`,`getEkspedisi`.

```bash
public String getProvinsi(){
        String kodeProv = getResi().substring(0, 2);
        //seleksi if
        if(kodeProv.equals("20")){
            return "Kalimantan Selatan";
        } else {
            return "Provinsi lain";
        }
}

public String getKabupaten(){
        String kodeKab = getResi().substring(2, 4);
        //seleksi switch
        switch(kodeKab){
            case "01":
                return "Kota Banjarmasin";
            case "02":
                return "Kota Banjarbaru"; 
            case "03":
                return "Kab.Banjar";  
            case "04":
                return "Kab.Tanah Laut";
            case "05":
                return "Kab.Tapin";
            case "06":
                return "Kab.Hulu Sungai Selatan";
            case "07":
                return "Kab.Hulu Sungai Utara";
            case "08":
                return "Kab.Hulu Sungai Tengah";    
            case "09":
                return "Kab.Balangan";
            case "10":
                return "Kab.Tabalong";
            case "11":
                return "Kab.Tanah Bumbu";
            case "12":
                return "Kab.KotaBaru";
            case "13":
                return "Kab.Batola";
            default:
                return "Kab/Kota Tidak Ditemukan";
        }
}
    
public String getEkspedisi(){
        String kodeEks = getResi().substring(4, 6);
        //seleksi switch
        switch(kodeEks){
            case "01":
                return "JNT";
            case "02":
                return "JNE";
            case "03":
                return "Sicepat";
            case "04":
                return "Kantor Pos";
            case "05":
                return "Shoppe Express";
            case "06":
                return "Tiki";
            default:
                return "Ekspedisi Lain";
        }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<resi1.length; i++){
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Anda "+(i+1)+": ");
String nama = scanner.nextLine();
System.out.print("Masukkan Kode Resi Anda "+(i+1)+": ");
String resi = scanner.nextLine();

System.out.println();
System.out.println("|===================|");
System.out.println("|   Data CEK RESI   |");
System.out.println("|===================|");
System.out.println(data.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `CekresiDetail[] resi1 = new CekresiDetail[2];` adalah contoh penggunaan array.

```bash
CekresiDetail[] resi1 = new CekresiDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan format nomor resi : "+e.getMessage());
} catch (Exception e) {
            System.out.println("Kesalahan Umum : "+e.getMessage());
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

Nama: M. Amin Badali
NPM: 2110010400
