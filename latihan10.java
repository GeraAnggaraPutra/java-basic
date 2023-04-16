import java.util.Scanner;
public class latihan10{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int pilih,barang,bayar,kembalian,h1 = 45000,h2 = 65000,h3 = 30000,h4 = 15000,total;
        String menu;

        System.out.println("Daftar Menu Pilihan : ");
        System.out.println("======================================");
        System.out.println("");
        System.out.println("1. Sapu          : Rp.45000");
        System.out.println("2. Lap pel       : Rp.65000");
        System.out.println("3. Ember         : Rp.30000");
        System.out.println("4. Gayung        : Rp.15000");
        System.out.println("======================================");
        System.out.println("");
        System.out.print("Masukan menu pilihan :");
        pilih = in.nextInt();
        System.out.println("");
        System.out.println("======================================");
        if(pilih==1){
            menu = "sapu";
            System.out.println("Anda memilih "+menu);
            System.out.println("Harga satuan "+menu+" : "+h1);
            System.out.print("Silahkan mau beli berapa : ");
            barang = in.nextInt();
            total = barang * h1;
            System.out.println("Total harga pembelian : "+total);
            System.out.println("======================================");
            System.out.println("");
            System.out.print("Input Bayar : Rp.");
            bayar = in.nextInt();
            kembalian = bayar - total;
            System.out.println("Total kembalian anda Rp."+kembalian);
         }else if(pilih==2){
            menu = "lap pel";
            System.out.println("Anda memilih "+menu);
            System.out.println("Harga satuan "+menu+" : "+h2);
            System.out.print("Silahkan mau beli berapa : ");
            barang = in.nextInt();
            total = barang * h2;
            System.out.println("Total harga pembelian : "+total);
            System.out.println("======================================");
            System.out.println("");
            System.out.print("Input Bayar : Rp.");
            bayar = in.nextInt();
            kembalian = bayar - total;
            System.out.println("Total kembalian anda Rp."+kembalian);
         }else if(pilih==3){
            menu = "ember";
            System.out.println("Anda memilih "+menu);
            System.out.println("Harga satuan "+menu+" : "+h3);
            System.out.print("Silahkan mau beli berapa : ");
            barang = in.nextInt();
            total = barang * h3;
            System.out.println("Total harga pembelian : "+total);
            System.out.println("======================================");
            System.out.println("");
            System.out.print("Input Bayar : Rp.");
            bayar = in.nextInt();
            kembalian = bayar - total;
            System.out.println("Total kembalian anda Rp."+kembalian);
         }else if(pilih==4){
            menu = "gayung";
            System.out.println("Anda memilih "+menu);
            System.out.println("Harga satuan "+menu+" : "+h4);
            System.out.print("Silahkan mau beli berapa : ");
            barang = in.nextInt();
            total = barang * h4;
            System.out.println("Total harga pembelian : "+total);
            System.out.println("=======================================");
            System.out.println("");
            System.out.print("Input Bayar : Rp.");
            bayar = in.nextInt();
            kembalian = bayar - total;
            System.out.println("Total kembalian anda Rp."+kembalian);
         }else{
            System.out.println("Maaf Error !!!");
        }
        System.out.println("");
        System.out.println("+-------------------------------------------+");
        System.out.println("|       Terimakasih Telah Berkunjung        |");
        System.out.println("+-------------------------------------------+");
  
    }
}