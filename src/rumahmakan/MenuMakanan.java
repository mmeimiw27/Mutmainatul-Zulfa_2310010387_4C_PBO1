package rumahmakan;

//Inheritance : MenuMakanan mewarisi dari MenuItem
public class MenuMakanan extends MenuItem {
    private String jenis;
    
    public MenuMakanan(String nama, double harga, String jenis) {
        super(nama, harga); 
        this.jenis = jenis;
    }
    
}
