/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package your.app;

import java.util.ArrayList;

/**
 *
 * @author Novia Zulfa Aulia
 */
public class Perpustakaan {
    
    private ArrayList  <Buku>KoleksiBuku = new ArrayList<>();
    
    // jumblah Buku
    public int jumblahBuku(){
        return KoleksiBuku.size();
    }
    //tambah buku
    public void tambahBuku(String judul,String pengarang){
        KoleksiBuku.add(new Buku(judul,pengarang));
    }
    //edit buku baru 
    public void gantiBuku(int index,String judul,String pengarang){
        KoleksiBuku.set(index, new Buku(judul,pengarang));
    }
    //edit buku dengan buku lama
    public void gantiBuku(int index,Buku baru){
        KoleksiBuku.set(index, baru);
    }
    //hapus buku dari array
    public void hapusBuku(int index){
        KoleksiBuku.remove(index);
    }
    //cari buku berdasarkan index
    public Buku lihatBuku(int index){
        return KoleksiBuku.get(index);
    }
    //cari buku berdaasarkan judul
    public Buku cariBuku(String judul){
        for (Buku buku : KoleksiBuku){
            if (buku.getjudul().contains(judul)){
                return buku;
            }
        }
        return null;
    }
    //cari index buku berdasarkan objek buku
    public int cariIndexBuku(Buku buku){
        for (int i =0; i<KoleksiBuku.size();i++){
            if (KoleksiBuku.get(i).equals(buku)){
                return i;
            } 
        }
        return -1;
    }
}
        
    
    
    

