import java.util.Scanner;
public class latihan6{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int celcius;
        double k,f,r;
        
        System.out.println("|     Program Java Konversi Suhu     |");
        System.out.println("======================================");
        System.out.println("");
        System.out.print("Masukan Suhu(Celcius) : ");
        celcius = scan.nextInt();
        k = celcius + 273.15;
        f = (celcius * 1.8) + 32;
        r = celcius * 0.8;

        System.out.println("");
        System.out.println("+-------------------------------------+");
        System.out.println("|      Hasil Konversi Suhu            |");
        System.out.println("+-------------------------------------+");
        System.out.println("Kelvin                : " + k);
        System.out.println("Fahrenheit            : " + f);
        System.out.println("Reamur                : " + r);



    }
}