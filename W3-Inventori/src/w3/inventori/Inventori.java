package w3.inventori;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-01-31
 */

public class Inventori {
    
    Barang[] barangs;
    
    // Membuat objek barang yang terdiri dari kode, nama, dan stok awal barang
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }
    
    // Menampilkan nama dan jumlah stok barang
    void showBarang() {
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
    }
    
    // Proses manipulasi jumlah stok barang
    void pengadaan() {
        initBarang();
        
        barangs[0].setStok(60); // Menambah stok 60 pada barang indeks ke-0
        barangs[1].setStok(50); // Menambah stok 50 pada barang indeks ke-1
        //barangs[0].stok -= 30; // Bisa juga dikurangi dong?
        //barangs[0].stok *= 30; // Dikali juga bisa dong?
        showBarang();
    }
    
    // Main class untuk membuat pengadaan barang/menambah stok barang
    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}
