# Sistem Data Buku — Single Linked List

Program Java ini menyimpan data buku menggunakan struktur data **Single Linked List**.
Program berjalan lewat menu interaktif yang mendukung operasi dasar: menambah buku,
menghapus buku terakhir, mencari buku berdasarkan kode, serta menampilkan seluruh buku.

## Fitur

1. **Tambah Buku** — menambah buku di akhir daftar (kode maksimal 5 karakter, tidak boleh kosong).
2. **Hapus Buku** — menghapus buku terakhir dari daftar.
3. **Cari Buku** — mencari buku berdasarkan kode (tidak membedakan huruf besar/kecil).
4. **Lihat Semua Buku** — menampilkan seluruh buku beserta totalnya.
5. **Keluar** — mengakhiri program (memberi peringatan bila data kurang dari 5 buku).

## Struktur File

1. `PerpustakaanLinkedList.java` berisi seluruh program:
   - `class Node` menyimpan data satu buku (kode, judul, penulis) dan pointer `next`.
   - `class LinkedList` berisi operasi `push`, `pop`, `cari`, dan `tampilkan`.
   - `class PerpustakaanLinkedList` menjalankan menu utama.

## Cara Menjalankan

```bash
javac PerpustakaanLinkedList.java
java PerpustakaanLinkedList
```

## Contoh Output Program

```text
bwrdn@bima MINGW64 /d/Bima Folder/S1-Binus-University/binus-dsa-personal-assignment-2
$ javac PerpustakaanLinkedList.java

bwrdn@bima MINGW64 /d/Bima Folder/S1-Binus-University/binus-dsa-personal-assignment-2
$ java PerpustakaanLinkedList.java

===== SISTEM DATA BUKU =====
1. Tambah Buku
2. Hapus Buku
3. Cari Buku
4. Lihat Semua Buku
5. Keluar
Pilih menu: 2
Tidak ada data untuk dihapus.

===== SISTEM DATA BUKU =====
1. Tambah Buku
2. Hapus Buku
3. Cari Buku
4. Lihat Semua Buku
5. Keluar
Pilih menu: 1

Masukkan Kode Buku: BK12345678
Kode buku maksimal 5 karakter.
Masukkan Kode Buku: BK1
Masukkan Judul: BUKU 1
Masukkan Penulis: PENULIS 1
Data berhasil ditambahkan!

===== SISTEM DATA BUKU =====
1. Tambah Buku
2. Hapus Buku
3. Cari Buku
4. Lihat Semua Buku
5. Keluar
Pilih menu: 1 

Masukkan Kode Buku: BK2   
Masukkan Judul: BUKU 2
Masukkan Penulis: PENULIS 2
Data berhasil ditambahkan!

===== SISTEM DATA BUKU =====
1. Tambah Buku
2. Hapus Buku
3. Cari Buku
4. Lihat Semua Buku
5. Keluar
Pilih menu: BUKU 3
Menu tidak valid, pilih 1-5.

===== SISTEM DATA BUKU =====
1. Tambah Buku
2. Hapus Buku
3. Cari Buku
4. Lihat Semua Buku
5. Keluar
Pilih menu: 1

Masukkan Kode Buku: BK3
Masukkan Judul: BUKU 3
Masukkan Penulis: PENULIS 3
Data berhasil ditambahkan!

===== SISTEM DATA BUKU =====
1. Tambah Buku
2. Hapus Buku
3. Cari Buku
4. Lihat Semua Buku
5. Keluar
Pilih menu: 1

Masukkan Kode Buku: BK4
Masukkan Judul: BUKU 4
Masukkan Penulis: PENULIS 4
Data berhasil ditambahkan!

===== SISTEM DATA BUKU =====
1. Tambah Buku
2. Hapus Buku
3. Cari Buku
4. Lihat Semua Buku
5. Keluar
Pilih menu: 1

Masukkan Kode Buku: BK5
Masukkan Judul: BUKU 5
Masukkan Penulis: PENULIS 5
Data berhasil ditambahkan!

===== SISTEM DATA BUKU =====
1. Tambah Buku
2. Hapus Buku
3. Cari Buku
4. Lihat Semua Buku
5. Keluar
Pilih menu: 1

Masukkan Kode Buku: BK6
Masukkan Judul: BUKU 6
Masukkan Penulis: PENLUIS 6
Data berhasil ditambahkan!

===== SISTEM DATA BUKU =====
1. Tambah Buku
2. Hapus Buku
3. Cari Buku
4. Lihat Semua Buku
5. Keluar
Pilih menu: 4
Daftar Buku:
Kode: BK1 | Judul: BUKU 1 | Penulis: PENULIS 1
Kode: BK2 | Judul: BUKU 2 | Penulis: PENULIS 2
Kode: BK3 | Judul: BUKU 3 | Penulis: PENULIS 3
Kode: BK4 | Judul: BUKU 4 | Penulis: PENULIS 4
Kode: BK5 | Judul: BUKU 5 | Penulis: PENULIS 5
Kode: BK6 | Judul: BUKU 6 | Penulis: PENLUIS 6
Total Buku: 6

===== SISTEM DATA BUKU =====
1. Tambah Buku
2. Hapus Buku
3. Cari Buku
4. Lihat Semua Buku
5. Keluar
Pilih menu: 2
Buku terakhir berhasil dihapus!

===== SISTEM DATA BUKU =====
1. Tambah Buku
2. Hapus Buku
3. Cari Buku
4. Lihat Semua Buku
5. Keluar
Pilih menu: 3

Masukkan Kode Buku: BK3
Buku ditemukan:
Kode    : BK3
Judul   : BUKU 3
Penulis : PENULIS 3

===== SISTEM DATA BUKU =====
1. Tambah Buku
2. Hapus Buku
3. Cari Buku
4. Lihat Semua Buku
5. Keluar
Pilih menu: 3

Masukkan Kode Buku: 12345
Buku tidak ditemukan.

===== SISTEM DATA BUKU =====
1. Tambah Buku
2. Hapus Buku
3. Cari Buku
4. Lihat Semua Buku
5. Keluar
Pilih menu: 4
Daftar Buku:
Kode: BK1 | Judul: BUKU 1 | Penulis: PENULIS 1
Kode: BK2 | Judul: BUKU 2 | Penulis: PENULIS 2
Kode: BK3 | Judul: BUKU 3 | Penulis: PENULIS 3
Kode: BK4 | Judul: BUKU 4 | Penulis: PENULIS 4
Kode: BK5 | Judul: BUKU 5 | Penulis: PENULIS 5
Total Buku: 5

===== SISTEM DATA BUKU =====
1. Tambah Buku
2. Hapus Buku
3. Cari Buku
4. Lihat Semua Buku
5. Keluar
Pilih menu: 5
Terima kasih, program selesai.
```
