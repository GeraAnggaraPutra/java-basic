import java.util.Scanner;
public class latihan7{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int hari,hari1,jam,jam1,menit,menit1,detik,totaldetik;

        System.out.println("|         Konversi Detik           |");
        System.out.println("+----------------------------------+");
        System.out.print("Masukan Total Detik : ");
        totaldetik = scan.nextInt();
        hari = totaldetik / 86400;
        hari1= totaldetik % 86400;
        jam = hari1 / 3600;
        jam1= hari1 % 3600;
        menit = jam1 / 60;
        menit1= jam1 % 60;
        detik = menit1;
        System.out.println(hari+" Hari "+jam+" Jam "+menit+" Menit "+detik+" Detik ");

    }
}