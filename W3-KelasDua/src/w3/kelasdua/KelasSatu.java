package w3.kelasdua;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-01-31
 */

public class KelasSatu 
{
    // Urutan pemanggilan blok yaitu static, non-static, public
    // Blok non-static dapat dipanggil setiap kali program dijalankan
    // Yang kedua diproses
    {
        System.out.println(11);
    }
    
    /* Blok static adalah yang pertama kali diproses, hanya dapat dijalankan dan dipanggil sekali 
    static dapat dipanggil tanpa harus membuat instansi objek */
    static
    {
        System.out.println(2);        
    }
    
    // Yang pertama diproses setelah memproses method KelasSatu objek dua karena terdapat parameter integer
    // Blok public ini dapat dijalankan/diakses dengan parameter
    public KelasSatu(int i) {
        System.out.println(3);        
    }
    
    // Yang ketiga diproses karena yang dipanggil adalah KelasSatu tanpa parameter
    // Blok public ini dapat dijalankan/diakses tanpa memiliki parameter
    public KelasSatu()
    {
        System.out.println(4);        
    }
}
