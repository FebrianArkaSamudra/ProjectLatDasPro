public class TransaksiPajak {
    static int kodeCounter = 0;
    int kode;
    long nominalBayar;
    long denda;
    int bulanBayar;
    Kendaraan kendaraan;
    TransaksiPajak next;
    TransaksiPajak prev;

    public TransaksiPajak(long nominalBayar, long denda, int bulanBayar, Kendaraan kendaraan) {
        this.kode = ++kodeCounter;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
        this.kendaraan = kendaraan;
        this.next = null;
        this.prev = null;
    }
}
