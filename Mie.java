public class Mie extends Menu {
    private int harga;
    private String ukuran;

    public Mie() {

    }

    public Mie(int harga, String ukuran) {
        this.harga = harga;
        this.ukuran = ukuran;
    }
 
    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public void deskripsiMenu() {
        System.out.println("Mie adalah mie, bisa dimasak menjadi mie goreng atau mie kuah (tau penjelasannya jelek)");
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
