package rumahmakan;

//Class
public class MenuItem {
    //Atribute (encapsulation : Modifier Private)
    private String nama;
    private double harga;
    private int stok;
    
    //Constructor
    public MenuItem(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
        this.stok = 1; 
    }
}
