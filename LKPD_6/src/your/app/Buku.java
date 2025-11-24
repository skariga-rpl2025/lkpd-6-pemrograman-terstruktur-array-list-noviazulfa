/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package your.app;

/**
 *
 * @author Novia Zulfa Aulia
 */
public class Buku {
    private final String Judul;
    private final String Pengarang;

    public Buku(String judul,String pengarang){
        this.Judul=judul;
        this.Pengarang=pengarang;
    }
     public String getjudul(){
         return Judul;
    }
     public String getpengarang(){
         return Pengarang;
    }
     public String tampil(){
         return"Judul:"+Judul+",Pengarang:"+Pengarang;
     }
    }
         
     

    
     
         
         
     
    
            
    

