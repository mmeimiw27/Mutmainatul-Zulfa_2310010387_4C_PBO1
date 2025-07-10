package rumahmakan;

import java.util.ArrayList;
//Mengimpor kelas ArrayList

public class Kasir {
    //membuat list untuk menyimpan objek menuItem
    private ArrayList<MenuItem> daftarPesanan = new ArrayList<>();
    
    public void tambahPesanan(MenuItem item) {
        //Seleksi: cek stok sebelum menambahkan pesanan
        if (item.getStok() > 0) {
            item.kurangiStok(); // stok dikurangi saat dipesan
            daftarPesanan.add(item);
            System.out.println(item.getNama() + " ditambahkan ke pesanan.");
        } else {
            System.out.println("Maaf, " + item.getNama() + " sedang habis.");
        }
    }
    public void cetakStruk() {
        System.out.println("\n== STRUK PESANAN ==");
        double total = 0;

        // Perulangan
        for (MenuItem item : daftarPesanan) {
            System.out.println("- " + item.getNama() + ": Rp" + item.getHarga());
            total += item.getHarga();
        }

        System.out.println("TOTAL: Rp" + total);
    }
}
