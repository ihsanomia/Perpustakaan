/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author CruxBrain
 */
public class Perpustakaan {
    public static void main(String[] args) {
        // Membuat objek Buku
        Buku buku1 = new Buku("Pemrograman Java", "Budi Raharjo", 2020);
        Buku buku2 = new Buku("Struktur Data", "Ahmad Santoso", 2018);

        // Membuat objek AnggotaPerpus
        AnggotaPerpus anggota1 = new AnggotaPerpus("Andi", "12345678");
        AnggotaPerpus anggota2 = new AnggotaPerpus("Siti", "87654321");

        // Menampilkan detail buku
        buku1.tampilkanDetail();
        buku2.tampilkanDetail();

        // Menampilkan info anggota
        anggota1.tampilkanInfo();
        anggota2.tampilkanInfo();

        // Simulasi peminjaman buku
        anggota1.pinjamBuku(buku1);
        anggota2.pinjamBuku(buku2);
    }
}
