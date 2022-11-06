import java.util.Scanner;

public class Beli {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pembeli pembeli = new Pembeli("Faqih", 1000000);
        int inputMenu;
        boolean yesNo = true;

        while(yesNo) {
            System.out.println("Selamat datang di Restoran Mie");
            System.out.println("Disini anda bisa membeli :");
            System.out.println("1. Mie Goreng");
            System.out.println("2. Mie Kuah");
            System.out.println("3. Bakmi");
            System.out.println("Masukkan input menu (1, 2, 3): ");
            inputMenu = in.nextInt();

            switch (inputMenu) {
                case 1:
                    System.out.println("Tentukan ukuran mie goreng yang ingin anda beli (kecil/sedang/besar): ");
                    MieGoreng mieGoreng = new MieGoreng(in.next());
                    mieGoreng.setHargaMieGoreng();
                    System.out.println("Anda membeli mie goreng ukuran " + mieGoreng.getUkuran() + " dengan harga " + mieGoreng.getHarga());
                    System.out.println("Uang " + pembeli.getNama() + " berkurang " + mieGoreng.getHarga());
                    pembeli.setUang(pembeli.getUang() - mieGoreng.getHarga());
                    System.out.println("Sisa uang " + pembeli.getNama() + " : " + pembeli.getUang());
                    break;
                case 2:
                    System.out.println("Tentukan ukuran mie kuah yang ingin anda beli (kecil/sedang/besar): ");
                    MieKuah mieKuah = new MieKuah(in.next());
                    mieKuah.setHargaMieKuah();
                    System.out.println("Anda membeli mie kuah ukuran " + mieKuah.getUkuran() + " dengan harga " + mieKuah.getHarga());
                    System.out.println("Uang " + pembeli.getNama() + " berkurang " + mieKuah.getHarga());
                    pembeli.setUang(pembeli.getUang() - mieKuah.getHarga());
                    System.out.println("Sisa uang " + pembeli.getNama() + " : " + pembeli.getUang());
                    break;
                case 3:
                    System.out.println("Tentukan ukuran bakmi yang ingin anda beli (kecil/sedang/besar): ");
                    Bakmi bakmi = new Bakmi(in.next());
                    bakmi.setHargaBakmi();;
                    System.out.println("Anda membeli bakmi ukuran " + bakmi.getUkuran() + " dengan harga " + bakmi.getHarga());
                    System.out.println("Uang " + pembeli.getNama() + " berkurang " + bakmi.getHarga());
                    pembeli.setUang(pembeli.getUang() - bakmi.getHarga());
                    System.out.println("Sisa uang " + pembeli.getNama() + " : " + pembeli.getUang());
                break;
            }
            System.out.println("Apakah anda ingin membeli kembali? \n ketik 'ya' jika anda ingin membeli kembali");
            if(in.next().equals("ya")) {
                continue;
            }
            yesNo = false;
        }
        

        in.close();
    }
}
