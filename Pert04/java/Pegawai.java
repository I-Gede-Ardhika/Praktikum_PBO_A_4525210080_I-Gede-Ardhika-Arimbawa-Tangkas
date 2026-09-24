/**
 * Sesi 4 — kelas induk.
 * Menampung apa yang BENAR-BENAR SAMA di semua jenis pegawai.
 *
 * Catatan: `abstract` dan `interface` dibahas tuntas di pertemuan 6.
 * Untuk sekarang cukup pahami: kelas abstract tidak bisa di-new langsung,
 * dan method abstract wajib dilengkapi turunannya.
 */
public abstract class Pegawai {

    protected final String nip;
    protected final String nama;
    protected final double gajiPokok;

    protected Pegawai(String nip, String nama, double gajiPokok) {
        // TODO 1: Validasi gaji pokok tidak boleh negatif.
        if (gajiPokok <0) {
            throw new IllegalArgumentException("Gaji Pokok tidak boleh negatif");
        }
        this.nip = nip;
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    /**
     * TODO 2: Mengembalikan gaji pokok apa adanya. */

    public double hitungGaji() {
        return gajiPokok;
    }

    public abstract String jenis();

    public String getNama() { 
        return nama; 
    }

    public String getNip() { 
        return nip; 
    }

    @Override
    public String toString() {
        return String.format("%-14s %-9s %-20s Rp%,.2f", nip, jenis(), nama, hitungGaji());
    }
}
