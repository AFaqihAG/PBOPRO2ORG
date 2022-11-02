public class Bakmi extends Mie {
    private final int[] hargaUkuran = {0, 4000, 8000};

    public Bakmi(String ukuran) {
        super(14000, ukuran);
    }

    public void setHargaBakmi() {
        int tambahHarga = 0;
        if (super.getUkuran().equalsIgnoreCase("kecil")) {
            tambahHarga = hargaUkuran[0];
        } else if (super.getUkuran().equalsIgnoreCase("sedang")) {
            tambahHarga = hargaUkuran[1];
        } else if (super.getUkuran().equalsIgnoreCase("besar")) {
            tambahHarga = hargaUkuran[2];
        }
        super.setHarga(super.getHarga() + tambahHarga);
    }
}