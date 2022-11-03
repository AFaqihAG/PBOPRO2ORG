public class Pembeli {
    private String nama;
    private int uang;
    
    // tes comment dari branch lain
    public Pembeli() {

    }

    public Pembeli(String nama, int uang) {
        this.nama = nama;
        this.uang = uang;
    }

    public String getNama() {
        return nama;
    }

    public int getUang() {
        return uang;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }
}
