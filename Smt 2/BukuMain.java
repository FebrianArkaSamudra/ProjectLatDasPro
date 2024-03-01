public class BukuMain {

    public static void main(String[] args) {
        Buku bk1 = new Buku();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        bk1.hitungHargaTotal(5);
        bk1.hitungDiskon(5);
        bk1.hitungHargaBayar(5);

        System.out.println("\n===================\n");

        Buku bk2 = new Buku("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
        bk2.gantiHarga(45000);
        bk2.tampilInformasi();
        bk2.hitungHargaTotal(11);
        bk2.hitungDiskon(11);
        bk2.hitungHargaBayar(11);

        System.out.println("\n===================\n"); 

        Buku bukuarka = new Buku("Febrian Arka", "arka", 170, 45, 75000);
        bukuarka.terjual(20);
        bukuarka.tampilInformasi();
        bukuarka.gantiHarga(70000);
        bukuarka.tampilInformasi();
        bukuarka.hitungHargaTotal(20);
        bukuarka.hitungDiskon(20);
        bukuarka.hitungHargaBayar(20);

        System.out.println("\n===================\n");
    }
}