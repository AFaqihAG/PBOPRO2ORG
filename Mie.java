public class Mie extends Menu {
    private int harga;
    private String ukuran;

    public Mie() {

    }

    /**
     * @param harga adalah harga dari mie
     * @param ukuran adalah ukuran dari mie
     */
    public Mie(int harga, String ukuran) {
        this.harga = harga;
        this.ukuran = ukuran;
    }
 
    /**
     * @return ukuran untuk mengembalikan ukuran dari mie
     */
    public String getUkuran() {
        return ukuran;
    }

    /**
     * @param ukuran untuk mengubah nilai dari ukuran
     */
    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public void deskripsiMenu() {
        System.out.println("Menu Mie disini dapat dipilih mulai dari Mie goreng, Mie kuah, dan Bakmi. Fresh from wajan hehe ");
    }

    /**
     * @return harga untuk mengembalikan nilai dari harga
     */
    public int getHarga() {
        return harga;
    }

    /**
     * @param harga untuk mengubah nilai dari harga
     */
    public void setHarga(int harga) {
        this.harga = harga;
    }
}
