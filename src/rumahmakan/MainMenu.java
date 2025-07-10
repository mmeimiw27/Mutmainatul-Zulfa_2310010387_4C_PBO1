package rumahmakan;

public class MainMenu {
    public static void main(String[] args) {
        //objek
        MenuItem[] daftarMenu = {
            new MenuMakanan("Nasi Goreng", 15000, "Utama"),
            new MenuMakanan("Nasi Putih", 5000, "Utama"),
            new MenuMakanan("Ayam Bakar", 18000, "Lauk"),
            new MenuMakanan("Tempe Orek", 8000, "Pelengkap"),
            new MenuMinuman("Teh Manis", 5000, true),
            new MenuMinuman("Kopi Hitam", 7000, false)
        };
    }
}
