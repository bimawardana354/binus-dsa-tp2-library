import java.util.Scanner;
 
// Node menyimpan data satu buku dan pointer ke node berikutnya
class Node {
    String kodeBuku;
    String judul;
    String penulis;
    Node next;
 
    Node(String kodeBuku, String judul, String penulis) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.next = null;
    }
}
 
// Single Linked List untuk daftar buku
class LinkedList {
    Node head;
    int jumlah;
 
    // Push: menambah buku baru di akhir daftar
    void push(String kode, String judul, String penulis) {
        Node baru = new Node(kode, judul, penulis);
        if (head == null) {
            head = baru;
        } else {
            Node bantu = head;
            while (bantu.next != null) {
                bantu = bantu.next;
            }
            bantu.next = baru;
        }
        jumlah++;
    }
 
    // Pop: menghapus buku terakhir dari daftar
    void pop() {
        if (head == null) {
            System.out.println("Tidak ada data untuk dihapus.");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            Node bantu = head;
            while (bantu.next.next != null) {
                bantu = bantu.next;
            }
            bantu.next = null;
        }
        jumlah--;
        System.out.println("Buku terakhir berhasil dihapus!");
    }
 
    // Mencari buku berdasarkan kode, mengembalikan null jika tidak ada
    Node cari(String kode) {
        Node bantu = head;
        while (bantu != null) {
            if (bantu.kodeBuku.equalsIgnoreCase(kode)) {
                return bantu;
            }
            bantu = bantu.next;
        }
        return null;
    }
 
    // Menampilkan semua buku sesuai urutan input
    void tampilkan() {
        if (head == null) {
            System.out.println("Daftar buku masih kosong.");
            System.out.println("Total Buku: 0");
            return;
        }
        System.out.println("Daftar Buku:");
        Node bantu = head;
        while (bantu != null) {
            System.out.println("Kode: " + bantu.kodeBuku + " | Judul: " + bantu.judul + " | Penulis: " + bantu.penulis);
            bantu = bantu.next;
        }
        System.out.println("Total Buku: " + jumlah);
    }
}
 
public class PerpustakaanLinkedList {
 
    // Menu tambah buku dengan validasi kode maksimal 5 karakter
    static void tambahBuku(Scanner input, LinkedList daftar) {
        System.out.println();
        String kode;
        while (true) {
            System.out.print("Masukkan Kode Buku: ");
            kode = input.nextLine().trim();
            if (kode.length() == 0) {
                System.out.println("Kode buku tidak boleh kosong.");
            } else if (kode.length() > 5) {
                System.out.println("Kode buku maksimal 5 karakter.");
            } else {
                break;
            }
        }
        System.out.print("Masukkan Judul: ");
        String judul = input.nextLine().trim();
        System.out.print("Masukkan Penulis: ");
        String penulis = input.nextLine().trim();
 
        daftar.push(kode, judul, penulis);
        System.out.println("Data berhasil ditambahkan!");
    }
 
    // Menu cari buku berdasarkan kode
    static void cariBuku(Scanner input, LinkedList daftar) {
        System.out.println();
        System.out.print("Masukkan Kode Buku: ");
        String kode = input.nextLine().trim();
        Node hasil = daftar.cari(kode);
        if (hasil == null) {
            System.out.println("Buku tidak ditemukan.");
        } else {
            System.out.println("Buku ditemukan:");
            System.out.println("Kode    : " + hasil.kodeBuku);
            System.out.println("Judul   : " + hasil.judul);
            System.out.println("Penulis : " + hasil.penulis);
        }
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList daftar = new LinkedList();
        boolean jalan = true;
 
        while (jalan) {
            System.out.println();
            System.out.println("===== SISTEM DATA BUKU =====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Lihat Semua Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            String pilihan = input.nextLine().trim();
 
            switch (pilihan) {
                case "1":
                    tambahBuku(input, daftar);
                    break;
                case "2":
                    daftar.pop();
                    break;
                case "3":
                    cariBuku(input, daftar);
                    break;
                case "4":
                    daftar.tampilkan();
                    break;
                case "5":
                    // Keluar selalu diperbolehkan, jumlah data hanya diberi peringatan
                    if (daftar.jumlah < 5) {
                        System.out.println("Catatan: jumlah data minimal 5 buku, saat ini baru ada " + daftar.jumlah + " buku.");
                    }
                    System.out.println("Terima kasih, program selesai.");
                    jalan = false;
                    break;
                default:
                    System.out.println("Menu tidak valid, pilih 1-5.");
            }
        }
        input.close();
    }
}
