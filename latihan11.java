import java.util.Scanner;
public class latihan11{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int pilih;
        System.out.println("       SILAHKAN PILIH PROGRAM       ");
        System.out.println("+====================================+");
        System.out.println("| 1. Konversi Waktu                  |");
        System.out.println("| 2. Konversi Suhu                   |");
        System.out.println("| 3. Program Menghitung rata - rata  |");
        System.out.println("+====================================+");
        System.out.println("");

        System.out.print("  Silahkan masukkan pilihan : ");
        pilih = scan.nextInt();
        System.out.println("");
        if(pilih == 1){
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
        else if(pilih == 2){
          int celcius;
          double k,f,r;
          System.out.println("|     Program Java Konversi Suhu     |");
          System.out.println("+====================================+");
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
        else if(pilih == 3){
          String nama,nim;
          double nilai;
          int uts,tugas,uas;
          System.out.println("|   Program Java Nilai Mahasiswa         |");
          System.out.println("==========================================");
          System.out.print("Masukan Nama        : ");
          nama = in.nextLine();
          System.out.print("Masukan NIM         : ");
          nim = in.nextLine();
          System.out.print("Masukan Nilai UTS   : ");
          uts = in.nextInt();
          System.out.print("Masukan Nilai TUGAS : ");
          tugas = in.nextInt();
          System.out.print("Masukan Nilai UAS   : ");
          uas = in.nextInt();
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
        else{
            System.out.println("ERROR!!!!!");
        }
    }
}