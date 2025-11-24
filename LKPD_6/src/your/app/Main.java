/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package your.app;

/**
 *
 * @author Novia Zulfa Aulia
 */
public class Main {
    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan();
        perpus.tambahBuku("Belajar JAVA", "Umar Bakrie");
        perpus.tambahBuku("Java Untuk Pemula", "Amir Mahmud");
        perpus.tambahBuku("Java untuk Ahli", "Salim Iklim");
        System.out.println("Jumlah buku: " + perpus.jumblahBuku()); // 3
        perpus.tambahBuku("Java untuk Mahasiswa", "Farid Akbar");

        // cari buku
        String cari = "Pemula";
        System.out.println("Cari buku dengan kata kunci: " + cari);
        Buku buku = perpus.cariBuku(cari);
        if (buku == null) {
            System.out.println("Buku tidak ditemukan");
        } else {
            System.out.println("Buku ditemukan dengan judul: " + buku.getjudul() +", pengarang: " + buku.getpengarang());
        }

        // ganti buku
        perpus.gantiBuku(0, "Belajar JAVA Baru", "Umar Bakrie Salim");
        buku = perpus.lihatBuku(0);
        System.out.println("Buku diganti dengan judul: " + buku.getjudul() + ", pengarang: " + buku.getpengarang());

        // hapus buku
        perpus.hapusBuku(0);
        System.out.println("Jumlah buku: " + perpus.jumblahBuku());
    }
}

