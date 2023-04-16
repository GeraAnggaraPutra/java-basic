import java.util.Scanner;
public class latihan4{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        String nama,jk,alamat,nohp,nim;

        System.out.println("|            Program Java BIODATA            |");
        System.out.println("==============================================");
        System.out.print("Masukan Nama            : ");
        nama = input.nextLine();
        System.out.print("Masukan NIM             : ");
        nim = input.nextLine();
        System.out.print("Masukan Jenis Kelamin   : ");
        jk = input.nextLine();
        System.out.print("Masukan Alamat          : ");
        alamat = input.nextLine();
        System.out.print("Masukan Nomor Handphone : ");
        nohp = input2.nextLine();
        System.out.println("");
        System.out.println("+--------------------------------------------+");
        System.out.println("|           Data Biodata Mahasiswa           |");
        System.out.println("+--------------------------------------------+");
        System.out.println("| Nama          : "+ nama);
        System.out.println("| NIM           : "+ nim);
        System.out.println("| Jenis Kelamin : "+ jk);
        System.out.println("| Alamat        : "+ alamat);
        System.out.println("| Nomor HP      : "+ nohp);
        System.out.println("+--------------------------------------------+");
    }
}