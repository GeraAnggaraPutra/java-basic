import java.util.Scanner;
public class contoh6{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t;
        System.out.print("Masukan total pembelian : ");
        t = scan.nextInt();
        System.out.println("");
        if(t >= 500000){
            int b;
            System.out.println("Anda mendapatkan diskon");
            System.out.print("Masukan jumlah barang : ");
            b = scan.nextInt();
            if(b > 5){
                System.out.println("Anda mendapatkan strika ajaib");
            }
        }else if(t >= 100000){
            int b;
            System.out.println("Anda mendapatkan diskon");
            System.out.print("Masukan jumlah barang : ");
            b = scan.nextInt();
            if(b > 3){
                System.out.println("Anda mendapatkan payung");
            }
        }else if(t >= 50000){
            int b;
            System.out.println("Anda mendapatkan diskon");
            System.out.print("Masukan jumlah barang : ");
            b = scan.nextInt();
            if(b > 2){
                System.out.println("Anda mendapatkan ballpoint");
            }
        }else{
            int b;
            System.out.print("Masukan jumlah barang : ");
            b = scan.nextInt();
            }
        
    }
}