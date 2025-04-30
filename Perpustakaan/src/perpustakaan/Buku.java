/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author CruxBrain
 */
public class Buku {
    // Field
    String judul;
    String pengarang;
    int tahunTerbit;

    // Constructor
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // Method untuk menampilkan detail buku
    public void tampilkanDetail() {
        System.out.println("Detail Buku:");
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("--------------------------");
    }

    // Getter untuk judul (akan digunakan di class AnggotaPerpus)
    public String getJudul() {
        return judul;
    }
}
