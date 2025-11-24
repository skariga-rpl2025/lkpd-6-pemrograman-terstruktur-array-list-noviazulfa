/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

import java.util.ArrayList;

/**
 *
 * @author Novia Zulfa Aulia
 */
public class DatabaseMahasiswa {
    private ArrayList<Mahasiswa> data = new ArrayList<>();

    public int jumlahMahasiswa() {
        return data.size();
    }

    public void tambahMahasiswa(String npm, String nama, String alamat) {
        data.add(new Mahasiswa(npm, nama, alamat));
    }

    public void hapusMahasiswa(int index) {
        if (index >= 0 && index < data.size()) {
            data.remove(index);
        }
    }

    public Mahasiswa lihatMahasiswa(int index) {
        if (index >= 0 && index < data.size()) {
            return data.get(index);
        }
        return null;
    }

    public Mahasiswa cariMahasiswa(String npm) {
        for (Mahasiswa m : data) {
            if (m.getNpm().equals(npm)) {
                return m;
            }
        }
        return null;
    }

    public void editMahasiswa(String npm, String namaBaru, String alamatBaru) {
        Mahasiswa m = cariMahasiswa(npm);
        if (m != null) {
            m.setNama(namaBaru);
            m.setAlamat(alamatBaru);
        }
    }
}
