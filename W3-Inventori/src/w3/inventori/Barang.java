package w3.inventori;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-01-31
 */

public class Barang {
    // Kamus Data
    String kode_barang;
    String nama_barang;
    // Mengganti access modifier variabel stok menjadi private
    private int stok;
    
    // Constructor Barang
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
    
    // Membuat getter Stok untuk mendapatkan nilai dari variabel stok
    public int getStok() {
        return stok; // Mengembalikan nilai stok
    }
    
    // Membuat setter Stok untuk memasukkan nilai variabel stok
    public void setStok(int stok) {
        // Tambahkan operasi matematika penjumlahan untuk perhitungan stok
        // Penjumlahan dari jumlah stok awal barang dan jumlah barang baru
        this.stok = this.stok + stok;
    }
}
