import java.util.Scanner;
public class latihan8{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int umur;
        String nama,hi;

        System.out.println("|  Program Java Menentukan Umur  |");
        System.out.println("==================================");
        System.out.println("");
        System.out.print("Silahkan masukan nama : ");
        nama = in.nextLine();
        System.out.print("Berapa Umur Anda? (angka saja) : ");
        umur = in.nextInt();
        if(umur<=5){
            hi = "Wah Masih Balita Ternyata";
        }else if(umur<=12){
            hi = "Kamu Mah Masih Bocah";
        }else if(umur<=18){
            hi = "Cie Yang Udah Remaja";
        }else if(umur<=40){
            hi = "Sudah Masuk kategori Dewasa";
        }else if(umur<=60){
            hi = "Orangtua, Sudah Bisa Banyak Istirahat";
        }else{
            hi = "Panjang Umur Perjuangan, Sehat Terus Dan Bahagia :)";
        }
        System.out.println("");
        System.out.println("Hi !, "+nama);
        System.out.println("Umur Kamu "+umur+" Tahun, "+hi);
    }
}