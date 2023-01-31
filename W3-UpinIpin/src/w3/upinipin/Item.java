package w3.upinipin;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-01-31
 */

public class Item {
    // Deklarasi variabel name dengan access modifier private
    private String name;
    private Item() {
        name = "Ipin";
    }
    public Item(String name) {
        // Proses memasukkan item yang baru
        //this.name = new Item().name;
        this();
        System.out.println(this.name);
    }
}
