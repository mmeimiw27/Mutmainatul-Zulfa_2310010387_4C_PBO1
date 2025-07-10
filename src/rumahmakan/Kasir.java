package rumahmakan;

import java.util.ArrayList;
//Mengimpor kelas ArrayList

public class Kasir {
    //membuat list untuk menyimpan objek menuItem
    private ArrayList<MenuItem> daftarPesanan = new ArrayList<>();
    
    public void tambahPesanan(MenuItem item) {
        // Materi 10: Seleksi → cek stok sebelum menambahkan pesanan
        if (item.getStok() > 0) {
            item.kurangiStok(); // stok dikurangi saat dipesan
            daftarPesanan.add(item);
            System.out.println(item.getNama() + " ditambahkan ke pesanan.");
        } else {
            System.out.println("Maaf, " + item.getNama() + " sedang habis.");
        }
    }
}
