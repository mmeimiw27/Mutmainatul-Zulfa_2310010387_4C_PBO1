package rumahmakan;

public class MenuMinuman extends MenuItem {
    private boolean dingin;

    public MenuMinuman(String nama, double harga, boolean dingin) {
        super(nama, harga);
        this.dingin = dingin;
    }
    @Override 
    public String info() {
        return "[MINUMAN] " + super.info() + " | " + (dingin ? "Dingin" : "Hangat");
    }
}
