public class TokoBuku {

    // Menghitung total harga semua buku
    public static int hitungTotal(Buku[] keranjang) {
        int total = 0;

        for (Buku b : keranjang) {
            total += b.hargaAkhir();
        }

        return total;
    }

    public static void main(String[] args) {

        // Membuat objek buku
        BukuCetak cetak1 = new BukuCetak(
                "Pemrograman Java", "John Doe", 120000, 750);

        BukuCetak cetak2 = new BukuCetak(
                "Algoritma Dasar", "Jane Smith", 95000, 400);

        BukuDigital digital = new BukuDigital(
                "Belajar OOP", "Ani Wijaya", 80000, 12.5);

        BukuAudio audio = new BukuAudio(
                "Kisah Programmer", "Budi Santoso", 60000, 240);

        // Membuat keranjang
        Buku[] keranjang = {cetak1, cetak2, digital, audio};

        // Membuat daftar buku yang bisa diunduh
        BisaDiunduh[] unduhan = {digital, audio};

        /*
        Percobaan membuat objek Buku:

        Buku b = new Buku("X", "Y", 1);

        Error:
        Buku is abstract; cannot be instantiated.
        */

        // Menampilkan isi keranjang
        System.out.println("=============== KERANJANG ===============");

        for (Buku b : keranjang) {
            b.tampilkanInfo();
        }

        System.out.println("-----------------------------------------");

        // Menghitung total pembayaran
        System.out.println("Total bayar   : "
                + Buku.formatRupiah(hitungTotal(keranjang)));

        // Menampilkan link unduhan
        System.out.println("\n============== LINK UNDUH ===============");

        for (BisaDiunduh b : unduhan) {
            System.out.println(b.linkUnduh());
        }
    }
}
