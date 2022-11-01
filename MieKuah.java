public class MieKuah extends Mie {
    private final int[] hargaUkuran = {0, 2000, 5000};

    public MieKuah(String ukuran) {
        super(12000, ukuran);
    }

    public void setHargaMieKuah() {
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
