public class Pembeli {
    private String nama;
    private int uang;

    public Pembeli() {

    }

    /**
     * @param nama adalah nama dari pembeli
     * @param uang adalah uang dari pembeli
     */
    public Pembeli(String nama, int uang) {
        this.nama = nama;
        this.uang = uang;
    }

    /**
     * @return nama untuk mengembalikan nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @return uang untuk mengembalikan uang
     */
    public int getUang() {
        return uang;
    }

    /**
     * @param nama untuk mengubah nilai dari nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @param uang untuk mengubah nilai dari uang
     */
    public void setUang(int uang) {
        this.uang = uang;
    }
}
