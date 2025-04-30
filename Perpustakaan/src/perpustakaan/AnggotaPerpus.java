/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author CruxBrain
 */
public class AnggotaPerpus {
    // Field
    private String nama;
    private String nim;

    // Constructor dengan keyword this
    public AnggotaPerpus(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Method untuk menampilkan informasi buku yang dipinjam
    public void pinjamBuku(Buku buku) {
        System.out.println("Anggota " + nama + " (NIM: " + nim + ")");
        System.out.println("Meminjam buku: " + buku.getJudul());
        System.out.println("--------------------------");
    }

    // Method untuk menampilkan info anggota
    public void tampilkanInfo() {
        System.out.println("Informasi Anggota:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("--------------------------");
    }
}