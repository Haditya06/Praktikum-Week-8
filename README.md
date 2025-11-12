# Praktikum-Week-7
# 📦 Aplikasi Ritel Makanan & Laundry  
Proyek ini dibuat sebagai bagian dari praktikum **Pemrograman Berorientasi Objek (Java)**.  
Tujuan proyek ini adalah memahami dan menerapkan konsep **kelas dan objek**, serta penggunaan **BufferedReader** untuk input data dari pengguna.

--- 

## 🧾 Deskripsi Proyek

Proyek ini terdiri dari dua bagian utama:

### 🛒 1. Aplikasi Ritel Makanan
Aplikasi ini digunakan untuk mencatat data barang pada perusahaan ritel makanan.  
Setiap barang memiliki atribut berikut:

| No | Nama Atribut   | Tipe Data |
|----|----------------|-----------|
| 1  | Kode Barang    | String    |
| 2  | Nama Barang    | String    |
| 3  | Produsen       | String    |
| 4  | Berat Bersih   | Integer   |
| 5  | Harga Beli     | Double    |
| 6  | Harga Jual     | Double    |

Aplikasi ini memungkinkan pengguna untuk:
- Melakukan input data barang melalui terminal  
- Menyimpan data dalam objek kelas `Barang`  
- Menampilkan hasil input menggunakan method `viewData()`  

Struktur utama aplikasi mencakup dua kelas:
- `Barang` → merepresentasikan entitas barang  
- `Ritel` → kelas utama untuk menjalankan program  

---

### 🧺 2. Aplikasi Laundry (Praktikum Mandiri)
Sebagai latihan mandiri, proyek ini juga mengembangkan modul pendaftaran **data pelanggan** untuk aplikasi laundry.

Setiap pelanggan memiliki minimal **8 atribut**, antara lain:
- ID Pelanggan  
- Nama  
- Alamat  
- Nomor Telepon  
- Jenis Layanan  
- Berat Cucian  
- Tanggal Masuk  
- Tanggal Selesai  
- Total Biaya  

---

## ⚙️ Konsep yang Dipelajari
- Penerapan **Kelas dan Objek (Class & Object)**  
- Pembuatan **Konstruktor**  
- Implementasi **Setter dan Getter**  
- Penggunaan **BufferedReader** untuk input data  
- Pemisahan proses dengan **method inputData() dan viewData()**  
- Konsep **Encapsulation dan Modularisasi Kode**

---

## 🧩 Inputan Data Barang 
```
=== Input Data Barang ===
Kode         : DIT064
Nama         : Haditya
Produsen     : PT LOMBOK
Berat Bersih : 1000
Harga Beli   : 12000
Harga Jual   : 15000

=== Menampilkan detil barang ===
Kode         : DIT064
Nama         : HADITYA
Produsen     : PT LOMBOK
Berat Bersih : 1000 gram
Harga Beli   : Rp12000.0
Harga Jual   : Rp15000.0
```
