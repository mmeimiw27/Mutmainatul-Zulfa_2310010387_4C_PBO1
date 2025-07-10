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
    // Accessor (Getter)
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }
    // Mutator (Setter)
    public void setStok(int stok) {
        this.stok = stok;
    }
   
    // Method
    public void kurangiStok() {
        if (stok > 0) stok--;
    }
    
    //Polymorphism (akan dioverride oleh subclass)
    public String info() {
        return nama + " - Rp" + harga + " [" + (stok > 0 ? "Tersedia" : "Habis") + "]";
    }
}
