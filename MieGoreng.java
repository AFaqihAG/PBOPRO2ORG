public class MieGoreng extends Mie {
    private final int[] hargaUkuran = {0, 3000, 7000};

    public MieGoreng(String ukuran) {
        super(10000, ukuran);
    }

    public void setHargaMieGoreng() {
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
