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
         // Input stok awal
        for (MenuItem item : daftarMenu) {
            int stok = InputMenu.inputInt("Masukkan stok untuk " + item.getNama() + ": ");
            item.setStok(stok);
        }
        
        Kasir kasir = new Kasir();

        int jumlahPesanan = InputMenu.inputInt("\nBerapa item yang ingin Anda pesan? ");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\n== MENU ==");
            for (int j = 0; j < daftarMenu.length; j++) {
                System.out.println((j + 1) + ". " + daftarMenu[j].info());
            }

            int pilih = InputMenu.inputInt("Pilih nomor menu: ") - 1;
            if (pilih >= 0 && pilih < daftarMenu.length) {
                kasir.tambahPesanan(daftarMenu[pilih]);
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        kasir.cetakStruk();
    }
}
