package w3.kelasdua;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-01-31
 */

public class KelasDua 
{
    {
        System.out.println(5);        
    }
    
    // Program akan masuk ke method main saat pertama kali mengakses class KelasDua
    public static void main(String[] args) {
        // Menampilkan output 6
        System.out.println(6);
        // Lalu program akan memproses method KelasSatu objek satu
        KelasSatu satu = new KelasSatu();
        // Setelah memproses method KelasSatu objek satu, lalu memproses method KelasSatu objek dua
        KelasSatu dua = new KelasSatu(10);
    }
    
}
