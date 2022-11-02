public class Mie implements Menu {
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
        System.out.println("Menu Mie disini dapat dipilih mulai dari Mie goreng, Mie kuah, dan Bakmi. Fresh from wajan hehe ");
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
