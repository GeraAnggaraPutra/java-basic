import java.util.Scanner;
public class latihan5{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String nama,nim;
        double nilai;
        int uts,tugas,uas;
        System.out.println("|   Program Java Nilai Mahasiswa         |");
        System.out.println("==========================================");
        System.out.print("Masukan Nama        : ");
        nama = scan.nextLine();
        System.out.print("Masukan NIM         : ");
        nim = scan.nextLine();
        System.out.print("Masukan Nilai UTS   : ");
        uts = scan.nextInt();
        System.out.print("Masukan Nilai TUGAS : ");
        tugas = scan.nextInt();
        System.out.print("Masukan Nilai UAS   : ");
        uas = scan.nextInt();
          nilai = (uts+tugas+uas) / 3;
        System.out.println("");
        System.out.println("+----------------------------------------+");
        System.out.println("|        Data Nilai Mahasiswa            |");
        System.out.println("+----------------------------------------+");
        System.out.println("| Nama      : "+ nama);
        System.out.println("| NIM       : "+ nim);
        System.out.println("| Rata-rata : "+ nilai);
        System.out.println("+----------------------------------------+");
        


    }
}