import java.util.Scanner;
public class latihan14{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int pilih,jk;
        double broca;
        String nama,nim;
        float berat,tinggi,bmi,meter;

        System.out.println("");
        System.out.println("Program penggabungan switch case dan if dalam java ");
        System.out.println("1. Program Memilih Jurusan");
        System.out.println("2. Program Memilih Bulan");
        System.out.println("3. Program Menghitung Berat Badan");
        System.out.print("Masukkan Pilihan : ");
        pilih = scan.nextInt();
        if(pilih == 1){
            System.out.print("Masukkan nama : ");
            nama = in.nextLine();
            System.out.print("Masukkan nim  : ");
            nim = in.nextLine();
            System.out.println("Pilihan : ");
            System.out.println("1. Teknik Kendaraan Ringan Otomotif");
            System.out.println("2. Teknik Bisnis Sepeda Motor");
            System.out.println("3. Teknik Rekayasa Perangkat Lunak");
            System.out.println("");
            System.out.print("Masukkan Pilihan : ");
            int pilih1 = scan.nextInt();
            System.out.println("");
            switch (pilih1){
                case 1:
                System.out.println(nama + " dengan nim "+nim+" memilih jurusan Teknik Kendaraan Ringan Otomotif");
                break;
                case 2:
                System.out.println(nama + " dengan nim "+ nim+" memilih jurusan Teknik Bisnis Sepeda Motor");
                break;
                case 3:
                System.out.println(nama + " dengan nim "+ nim+" memilih jurusan Teknik Rekayasa Perangkat Lunak");
                break;
            }
        }else if(pilih == 2){
            System.out.println("Pilihan : ");
            System.out.println("1. Januari");
            System.out.println("2. Februari");
            System.out.println("3. Maret");
            System.out.println("4. April");
            System.out.println("5. Mei");
            System.out.println("6. Juni");
            System.out.println("7. Juli");
            System.out.println("8. Agustus");
            System.out.println("9. September");
            System.out.println("10. Oktober");
            System.out.println("11. November");
            System.out.println("12. Desember");
            System.out.print("Masukkan pilihan : ");
            int pilih2 = scan.nextInt();
            switch (pilih2){
                case 1:
                System.out.println("Anda memilih bulan Januari");
                break;
                case 2:
                System.out.println("Anda memilih bulan Februari");
                break;
                case 3:
                System.out.println("Anda memilih bulan Maret");
                break;
                case 4:
                System.out.println("Anda memilih bulan April");
                break;
                case 5:
                System.out.println("Anda memilih bulan Mei");
                break;
                case 6:
                System.out.println("Anda memilih bulan Juni");
                break;
                case 7:
                System.out.println("Anda memilih bulan Juli");
                break;
                case 8:
                System.out.println("Anda memilih bulan Agustus");
                break;
                case 9:
                System.out.println("Anda memilih bulan September");
                break;
                case 10:
                System.out.println("Anda memilih bulan Oktober");
                break;
                case 11:
                System.out.println("Anda memilih bulan November");
                break;
                case 12:
                System.out.println("Anda memilih bulan Desember");
                break;
            }
        }else if(pilih == 3){
            System.out.println("PROGRAM JAVA MENGHITUNG BERAT BADAN IDEAL DENGAN BMI & RUMUS BROCA");
            System.out.println(".......................................................");
            System.out.print("Masukkan Jenis Kelamin (1.Laki - laki)|(2.Perempuan): ");
            jk = scan.nextInt();
            System.out.print("Masukkan Berat : ");
            berat = scan.nextFloat();
            System.out.print("Masukkan Tinggi: ");
            tinggi = scan.nextFloat();
            System.out.println(".......................................................");
            meter = tinggi / 100;
            bmi = (berat/(meter * meter));
            if(bmi <=18.5){
                System.out.println("BMI : "+bmi+" (Kurus)");
            }else if(bmi <=22.9){
                System.out.println("BMI : "+bmi+" (Normal)");
            }else if(bmi <=24.9){
                System.out.println("BMI : "+bmi+" (Overweight)");
            }else{
                System.out.println("BMI : "+bmi+" (Obesitas)");
            }
            switch(jk){
                case 1:
                broca = ((tinggi - 100) - (0.10*(tinggi - 100)));
                System.out.println("Berat badan ideal anda (menurut rumus Broca) : "+broca+" Kg");
                break;
                case 2:
                broca = ((tinggi - 100) - (0.15*(tinggi - 100)));
                System.out.println("Berat badan ideal anda (menurut rumus Broca) : "+broca+" Kg");
                break;
            }
        }
    }
}