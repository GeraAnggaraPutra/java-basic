import java.util.Scanner;
public class latihan16{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int pilih,n;
        System.out.println("Program Pengulangan Dalam Bahasa Java");
        System.out.println("1. Program Menerima Inputan N Ganjil dan Genap Java");
        System.out.println("2. Program Menghitung Rata-rata Java");
        System.out.println("3. Program Menghitung N Faktorial");
        System.out.println("");
        System.out.print("Masukkan pilihan (1-3) :");
        pilih = scan.nextInt();
        System.out.println("");
        if(pilih == 1){
            System.out.println("1. Program Menerima Inputan N Ganjil dan Genap Java");
            System.out.println("");
            System.out.print("Masukkan bilangan N :");
            n = scan.nextInt();
            System.out.println("");
            System.out.println("Bilangan N : "+n);
            System.out.println("");
            int g1,g2,h;
            g1=1;
            g2=-1;
             if(n > 0){
              while(g1 <= n){
                h = g1%2;
                if(h==0){
                        System.out.println("Bilangan ke - "+g1+" adalah bilangan genap");
                }
                else{
                       System.out.println("Bilangan ke - "+g1+" adalah bilangan ganjil");
                }
                g1++;
              }
           }
        }else if(pilih == 2){
            System.out.println("2. Program Menghitung Rata-rata Java");
            System.out.println("");
            System.out.print("Masukkan N :");
            n = scan.nextInt();
            System.out.println("Masukkan "+n+" buah bilangan :");
            int b;
            float b1,jumlah,rata;
            b =1;
            jumlah = 0;
            while(b <= n){
                System.out.print("bilangan ke - "+b+" : ");
                b1 = scan.nextFloat();
                jumlah += b1;
                b++;
            }
            rata = jumlah / n;
            System.out.println("Rata-ratanya adalah : "+rata);
        }else if(pilih == 3){
            System.out.println("3. Program Menghitung N Faktorial");
            System.out.println("");
            int bil,x;
            System.out.print("Masukkan bilangan : ");
            bil = scan.nextInt();
            x = 1;
            System.out.print(bil+"! = ");
            do{
                if(bil == 1){
                    System.out.print(bil+" = ");
                }
                else{
                    System.out.print(bil+" x ");
                }
                x*= bil;
                bil--;
            }
            while(bil>0);
            System.out.println(x);
        }
    }
}