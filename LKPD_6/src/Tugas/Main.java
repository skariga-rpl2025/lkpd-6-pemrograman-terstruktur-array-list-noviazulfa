/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author Novia Zulfa Aulia
 */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DatabaseMahasiswa db = new DatabaseMahasiswa();
        int pilih;

        do {
            System.out.println("\n=== MENU MAHASISWA ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Cari Mahasiswa");
            System.out.println("3. Edit Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Lihat Semua");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {

                case 1:
                    System.out.print("NPM: ");
                    String npm = input.nextLine();
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = input.nextLine();
                    db.tambahMahasiswa(npm, nama, alamat);
                    System.out.println("Data berhasil ditambah!");
                    break;

                case 2:
                    System.out.print("Masukkan NPM yang dicari: ");
                    String cari = input.nextLine();
                    Mahasiswa m = db.cariMahasiswa(cari);
                    if (m != null) System.out.println(m.tampil());
                    else System.out.println("Mahasiswa tidak ditemukan!");
                    break;

                case 3:
                    System.out.print("NPM mahasiswa yang ingin diedit: ");
                    String npmedit = input.nextLine();
                    System.out.print("Nama baru: ");
                    String namabaru = input.nextLine();
                    System.out.print("Alamat baru: ");
                    String alamatbaru = input.nextLine();
                    db.editMahasiswa(npmedit, namabaru, alamatbaru);
                    System.out.println("Data berhasil diedit!");
                    break;

                case 4:
                    System.out.print("Masukkan index data yang ingin dihapus: ");
                    int idx = input.nextInt();
                    db.hapusMahasiswa(idx);
                    System.out.println("Data dihapus!");
                    break;

                case 5:
                    System.out.println("\n== DATA MAHASISWA ==");
                    for (int i = 0; i < db.jumlahMahasiswa(); i++) {
                        System.out.println(i + ". " + db.lihatMahasiswa(i).tampil());
                    }
                    break;
            }

        } while (pilih != 0);

        System.out.println("Program selesai.");
        input.close();
    }
}
