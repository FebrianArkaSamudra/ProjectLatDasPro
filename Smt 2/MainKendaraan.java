import java.util.Scanner;

public class MainKendaraan {
    //Simpan data kendaraan dan transaksi
    static Kendaraan[] kendaraanList = new Kendaraan[10];
    static int kendaraanCount = 0;
    static TransaksiPajak head = null;
    static TransaksiPajak tail = null;

    public static void main(String[] args) {
        // Tambah data Daftar Kendaraan
        sumKendaraan(new Kendaraan("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4));
        sumKendaraan(new Kendaraan("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3));
        sumKendaraan(new Kendaraan("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2));
        sumKendaraan(new Kendaraan("B 1234 AG", "Sisa", "Motor", 150, 2020, 1));

        Scanner sc = new Scanner(System.in);
        int choice;
        
        // Menu utama
        do {
            System.out.println("");
            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi berdasar nama Pemilik");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5): ");
            choice = sc.nextInt();
            sc.nextLine();  
            
            switch (choice) {
                case 1:
                    listKendaraan();
                    //Tampilkan daftar kendaraan
                    break;
                case 2:
                    bayarPajak(sc);
                    //Membayar pajak
                    break;
                case 3:
                    displayAlltransaksi();
                    //Tampilkan semua transaksi
                    break;
                case 4:
                    sortTransaksibyname();
                    //Urutan transaksi berdasarkan nama pemilik
                    displayAlltransaksi();
                    //Tampilkan transaksi yang sudah diurutkan
                    break;
                case 5:
                    System.out.println("Thank You");
                    //Keluar dari menu
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    // pesan pilihan tidak valid
            }
        } while (choice != 5);

        sc.close();
    }

    static void sumKendaraan(Kendaraan kendaraan) {
        kendaraanList[kendaraanCount] = kendaraan;
        kendaraanCount++;
    }

    static Kendaraan findKendaraan(String noTNKB) {
        for (int i = 0; i < kendaraanCount; i++) {
            if (kendaraanList[i].noTNKB.equalsIgnoreCase(noTNKB)) {
                return kendaraanList[i];
            }
        }
        return null;
    }

    static long calculateNominalBayar(Kendaraan kendaraan) {
        if (kendaraan.jenis.equalsIgnoreCase("Motor")) {
            if (kendaraan.cc < 100) return 100000;
            if (kendaraan.cc <= 250) return 250000;
            return 500000;

        } else {
            if (kendaraan.cc < 1000) return 750000;
            if (kendaraan.cc <= 2500) return 1000000;
            return 1500000;

        }
    }

    static long calculateDenda(Kendaraan kendaraan, int bulanBayar) {

        int bulanHarusBayar = kendaraan.bulanHarusBayar;
        if (bulanBayar <= bulanHarusBayar) return 0;
        int lateMonths = bulanBayar - bulanHarusBayar;
        if (lateMonths <= 3) return 50000 * lateMonths;
        return 50000 * 3 + 100000 * (lateMonths - 3);

    }

    static void bayarPajak(Scanner scanner) {

        System.out.print("Masukkan No.TNKB: ");
        String noTNKB = scanner.nextLine();
        System.out.print("Masukkan Bulan Bayar: ");
        int bulanBayar = scanner.nextInt();

        Kendaraan kendaraan = findKendaraan(noTNKB);

        if (kendaraan != null) {
            long nominalBayar = calculateNominalBayar(kendaraan);
            long denda = calculateDenda(kendaraan, bulanBayar);
            TransaksiPajak transaksi = new TransaksiPajak(nominalBayar, denda, bulanBayar, kendaraan);
            addTransaksi(transaksi);
            System.out.println("Transaksi berhasil!");
            displayTransaksi(transaksi);
        } else {
            System.out.println("Kendaraan tidak ditemukan!");
        }

    }

    static void addTransaksi(TransaksiPajak transaksi) {

        if (head == null) {
            head = transaksi;
            tail = transaksi;
        } else {
            tail.next = transaksi;
            transaksi.prev = tail;
            tail = transaksi;
        }

    }

    static void displayTransaksi(TransaksiPajak transaksi) {

        System.out.println("----------------------------------------------------------");
        System.out.println("Masukkan Data Pembayaran");
        System.out.println("----------------------------------------------------------");
        System.out.printf("| %-5s | %-10s | %-15s | %-8s | %-8s |\n", "Kode", "TNKB", "Nama", "Nominal", "Denda");
        System.out.printf("| %-5d | %-10s | %-15s | %-8d | %-8d |\n", 
                transaksi.kode, transaksi.kendaraan.noTNKB, transaksi.kendaraan.nama, 
                transaksi.nominalBayar, transaksi.denda);
        System.out.println("----------------------------------------------------------");
        displayRules();

    }

    static void displayAlltransaksi() {

        System.out.println("Daftar transaksi:");
        System.out.printf("| %-5s | %-10s | %-15s | %-8s | %-8s |\n", 
                "Kode", "TNKB", "Nama", "Nominal", "Denda");
        TransaksiPajak current = head;
        long totalRevenue = 0;
        while (current != null) {
            displayTransaksiRow(current);
            totalRevenue += current.nominalBayar + current.denda;
            current = current.next;
        }
        System.out.println("Total pendapatan: " + totalRevenue);

    }

    static void displayTransaksiRow(TransaksiPajak transaksi) {

        System.out.printf("| %-5d | %-10s | %-15s | %-8d | %-8d |\n", 
                transaksi.kode, transaksi.kendaraan.noTNKB, transaksi.kendaraan.nama, 
                transaksi.nominalBayar, transaksi.denda);

    }


    static void listKendaraan() {

        System.out.println("Daftar kendaraan:");
        System.out.printf("| %-10s | %-15s | %-10s | %-5s | %-5s | %-2s |\n", 
                "No TNKB", "Nama pemilik", "Jenis", "CC", "Tahun", "Bulan harus bayar");
        for (int i = 0; i < kendaraanCount; i++) {
            Kendaraan k = kendaraanList[i];
            System.out.printf("| %-10s | %-15s | %-10s | %-5d | %-5d | %-2d |\n", 
                    k.noTNKB, k.nama, k.jenis, k.cc, k.tahun, k.bulanHarusBayar);
        }

    }

    static void sortTransaksibyname() {

        if (head == null) return;
        boolean swapp;
        do {
            swapp = false;
            TransaksiPajak current = head;
            while (current.next != null) {
                if (current.kendaraan.nama.compareTo(current.next.kendaraan.nama) > 0) {
                    // Swap data
                    long tempNominalBayar = current.nominalBayar;
                    long tempDenda = current.denda;
                    int tempBulanBayar = current.bulanBayar;
                    Kendaraan tempKendaraan = current.kendaraan;

                    current.nominalBayar = current.next.nominalBayar;
                    current.denda = current.next.denda;
                    current.bulanBayar = current.next.bulanBayar;
                    current.kendaraan = current.next.kendaraan;

                    current.next.nominalBayar = tempNominalBayar;
                    current.next.denda = tempDenda;
                    current.next.bulanBayar = tempBulanBayar;
                    current.next.kendaraan = tempKendaraan;

                    swapp = true;
                }
                current = current.next;
            }

        } while (swapp);

    }

    static void displayRules() {

        System.out.println("Beberapa ketentuan terkait dengan nominal pembayaran dan denda mengikuti aturan berikut ini:");
        System.out.println("1. Jenis kendaraan terdiri dari motor dan mobil");
        System.out.println("2. Untuk motor, cc terdiri dari kurang dari 100, antara 100 sampai 250, dan lebih dari 250. Tarif pajak secara urut dari cc adalah 100000, 250000, dan 500000.");
        System.out.println("3. Untuk mobil, cc terdiri dari kurang dari 1000, antara 1000 sampai 2500, dan lebih dari 2500. Tarif pajak secara urut dari cc adalah 750000, 1000000, dan 1500000.");
        System.out.println("4. Pembayaran dikenakan denda ketika bulan bayar > bulan harus bayar. ketika telat 1-3 bulan dikenakan denda 50000, sedangkan > 3 bulan denda akan dikalikan dengan 50000 setiap bulannya.");
        
    }

}
