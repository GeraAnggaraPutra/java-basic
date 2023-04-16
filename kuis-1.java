import java.util.Scanner;
import javax.swing.JOptionPane;

public class kuis{
   public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int pilih;
        String u,ulangi;
       do{
        System.out.println();
        System.out.println("     QUIZ REKAYASA PERANGKAT LUNAK\n");
        System.out.println("1. Program Menghitung Gaji Karyawan");
        System.out.println("2. Program Sistem Informasi Reservasi Hotel");
        System.out.println("3. Program Menghitung Rumus Fisika Berbasis java");
        System.out.println("4. Program Array Mencari Nilai Tertinggi dan Terendah Mahasiswa");
        System.out.println("5. Program Array Matrix");
        System.out.println("6. Program Array Bubble Sort");
        System.out.println("7. Program Array Jual Beli Helm");
        System.out.println("8. Program Biodata JOptionPane");
        System.out.println("9. Program Bangun Ruang JOptionPane\n");
        System.out.print("   Masukan Pilihan(1-9) : ");
        pilih = scan.nextInt();   
        if(pilih == 1){
            do{
            System.out.println();
            System.out.println("      Program Perhitungan Gaji Karyawan      ");
            System.out.println("            SMK ASSALAAM BANDUNG");
            System.out.println("============================================");
            String nama,nik;
            int golongan,pajak,total,gg = 0;
            Scanner scan1 = new Scanner(System.in);
            System.out.print("Masukan Nama    : ");
            nama = scan1.nextLine();
            System.out.print("Masukan NIM     : ");
            nik = scan1.nextLine();
            System.out.println();
            String g;
            do{
            System.out.println("1. golongan 1A\n2. golongan 1B\n3. golongan 2A\n4. golongan 2B\n5. golongan 3A\n6. golongan 3B");
            System.out.print("Masukan pilihan golongan : ");
            golongan = scan1.nextInt();
            System.out.println("============================================");
            if(golongan == 1){
                System.out.println("Nama Karyawan            = " + nama);
                System.out.println("NIK Karyawan             = " + nik);
                System.out.println("Gaji Pokok               = 1000000");
                System.out.println("Tunjangan Istri dan Anak = 100000");
                pajak = ((5/2)*(1000000 + 100000)) / 100;
                System.out.println("Pajak                    = " + pajak);
                total = ((1000000 + 100000) - pajak);
                System.out.println("Total Gaji Yang Diterima = " + total);
                System.out.println("============================================");
                System.out.println();                
             }else if(golongan == 2){
                  System.out.println("Nama Karyawan            = " + nama);
                  System.out.println("NIK Karyawan             = " + nik);
                  System.out.println("Gaji Pokok               = 1500000");
                  System.out.println("Tunjangan Istri dan Anak = 200000");
                  pajak = ((5/2)*(1500000 + 200000)) / 100;
                  System.out.println("Pajak                    = " + pajak);
                  total = ((1500000 + 200000) - pajak);
                  System.out.println("Total Gaji Yang Diterima = " + total);
                  System.out.println("============================================");
                  System.out.println();     
             }else if(golongan == 3) {
                  System.out.println("Nama Karyawan            = " + nama);
                  System.out.println("NIK Karyawan             = " + nik);
                  System.out.println("Gaji Pokok               = 2000000");
                  System.out.println("Tunjangan Istri dan Anak = 300000");
                  pajak = ((5/2)*(2000000 + 300000)) / 100;
                  System.out.println("Pajak                    = " + pajak);
                  total = ((2000000 + 300000) - pajak);
                  System.out.println("Total Gaji Yang Diterima = " + total);
                  System.out.println("============================================");
                  System.out.println();
             }else if(golongan == 4){
                  System.out.println("Nama Karyawan            = " + nama);
                  System.out.println("NIK Karyawan             = " + nik);
                  System.out.println("Gaji Pokok               = 2500000");
                  System.out.println("Tunjangan Istri dan Anak = 400000");
                  pajak = ((5/2)*(2500000 + 400000)) / 100;
                  System.out.println("Pajak                    = " + pajak);
                  total = ((2500000 + 400000) - pajak);
                  System.out.println("Total Gaji Yang Diterima = " + total);
                  System.out.println("============================================");
                  System.out.println();                
             }else if(golongan == 5){
                  System.out.println("Nama Karyawan            = " + nama);
                  System.out.println("NIK Karyawan             = " + nik);
                  System.out.println("Gaji Pokok               = 3000000");
                  System.out.println("Tunjangan Istri dan Anak = 500000");
                  pajak = ((5/2)*(3000000 + 500000)) / 100;
                  System.out.println("Pajak                    = " + pajak);
                  total = ((3000000 + 500000) - pajak);
                  System.out.println("Total Gaji Yang Diterima = " + total);
                  System.out.println("============================================");
                  System.out.println();             
             }else if(golongan == 6){
                  System.out.println("Nama Karyawan            = " + nama);
                  System.out.println("NIK Karyawan             = " + nik);
                  System.out.println("Gaji Pokok               = 3500000");
                  System.out.println("Tunjangan Istri dan Anak = 600000");
                  pajak = ((5/2)*(3500000 + 600000)) / 100;
                  System.out.println("Pajak                    = " + pajak);
                  total = ((3500000 + 600000) - pajak);
                  System.out.println("Total Gaji Yang Diterima = " + total);
                  System.out.println("============================================");
                  System.out.println();                 
             }else{
              System.out.println("MOHON MAAF GOLONGAN YANG ANDA MASUKAN TIDAK ADA"); 
             }
             }while(golongan > 6 || golongan < 1);
            System.out.print("Ulangi kembali program (y/n) ");
            ulangi = scan.next();
            }while(ulangi.equalsIgnoreCase("Y")); 


        }else if(pilih == 2){
        do{ 
           System.out.println();
           Scanner scan2 = new Scanner(System.in);
           double kembalian,bayar,diskon = 0;
           int bayar1,tarif = 0;
           String kamar1 = "";
           System.out.println("     --**-- SISTEM INFORMASI PERHOTELAN --**--\n");
           System.out.print("Nama Pelanggan            : ");
           String nama = scan2.nextLine();
           System.out.println("\n");
           System.out.println("Pilih Jenis Kamar");
           System.out.println("1. Deluxe Room Rp 275.000/hari");
           System.out.println("2. Suite Room Rp 300.000/hari");
           System.out.println("3. President Room Rp 370.000/hari");
           System.out.print("Jenis kamar yang dipesan   : ");
           int kamar = scan2.nextInt();
           System.out.println();
           System.out.print("Lama Menginap              : ");
           int lm = scan2.nextInt();
           System.out.println();
           System.out.println("Status Pelanggan\n1. Member\n2. Non Member");
           System.out.print("Pilih status pelanggan     : ");
           int status = scan2.nextInt();
           System.out.println();
             if(kamar == 1){
                kamar1 = "Deluxe Room";
                tarif  = 275000 * lm;
               }else if(kamar == 2){
                  kamar1 = "Suite Room";
                  tarif  = 300000 * lm;
               }else if(kamar == 3){
                  kamar1 = "President Room";
                  tarif  = 370000 * lm;
              }
             if(status == 1){
               if(lm>=4 && lm<=7){
                  diskon = 0.20 * tarif;
               }else if(lm > 7){
                  diskon = 0.35 * tarif;
               }
             }else if(status == 2){
              if(lm>=4 && lm<=7){
                  diskon = 0.10 * tarif;
              }else if(lm > 7){
                  diskon = 0.15 * tarif;
              }
             }
             bayar = tarif - diskon;
        
             System.out.println("---***--- NOTA PEMBAYARAN HOTEL BANDUNG ---***---\n");
             System.out.println("Nama Pelanggan             : " + nama);
             System.out.println("Jenis Kamar                : " + kamar1);
             System.out.println("Tarif Penginapan           : Rp " + tarif);
             System.out.println("Diskon Menginap            : Rp " + diskon);
             System.out.println("Nominal yang harus dibayar : Rp " + bayar);
             do{
               System.out.print("Bayar                      : Rp ");
               bayar1 = scan2.nextInt();
               if(bayar1 < bayar){
               System.out.println("MOHON MAAF UANG ANDA KURANG");
               }
             }while(bayar1 < bayar);
              kembalian = bayar1 - bayar;
            System.out.println("Kembalian anda             : Rp " + kembalian); 
            System.out.println();
            System.out.print("Ulangi kembali program (y/n) ");
            ulangi = scan.next();
            }while(ulangi.equalsIgnoreCase("Y"));


      }else if(pilih == 3){
        String v;
        do{
        System.out.println();
        System.out.println("+----------------------------------+");
        System.out.println("|    Menu Program Rumus Fisika     | ");
        System.out.println("+----------------------------------+");
        System.out.println("| 1. Usaha(W)                      |");
        System.out.println("| 2. Daya(P)                       |");
        System.out.println("| 3. Energi Potensial(Ep)          |");
        System.out.println("| 4. Energi Kinetik(Ek)            |");
        System.out.println("| 5. Energi Mekanik(Em)            |");
        System.out.println("| 6. Selesai                       |");
        System.out.println("+----------------------------------+");
        System.out.print("Pilih Menu (1 s/d 6) : ");
        int menu = scan.nextInt();
        if(menu == 1){
          System.out.println();
          System.out.println("+----------------------------------+");
          System.out.println(" 1. Menghitung Besarnya Usaha(W)");
          System.out.println("+----------------------------------+");
          System.out.print("Masukkan Besarnya Gaya(N) = ");
          int gaya = scan.nextInt();
          System.out.print("Masukkan Perpindahan Benda(m) = ");
          int benda = scan.nextInt();
          System.out.println();
          System.out.println("+Dik. -----------------------------+");
          System.out.println("Gaya(F) = " + gaya);
          System.out.println("Perpindahan(S) = " + benda);
          System.out.println();
          System.out.println("-> Usaha(W) = F * S");
          System.out.println("         W  = "+gaya+" * "+benda);
          double j = gaya * benda;
          System.out.println("         W  = "+j+" Joule");
          System.out.println("+----------------------------------+");
        }else if(menu == 2){
          System.out.println();
          System.out.println("+----------------------------------+");
          System.out.println(" 2. Menghitung Besarnya Daya(P)");
          System.out.println("+----------------------------------+");
          System.out.print("Masukkan Besarnya Usaha(J) = ");
          int usaha = scan.nextInt();
          System.out.print("Masukkan Lamanya Waktu(s) = ");
          int waktu = scan.nextInt();
          System.out.println();
          System.out.println("+Dik. -----------------------------+");
          System.out.println("Usaha(W) = "+usaha);
          System.out.println("Waktu(t) = "+waktu);
          System.out.println();
          System.out.println("-> Daya(P) = W / t");
          System.out.println("        P  = "+usaha+" / "+waktu);
          double p = usaha / waktu;
          System.out.println("        P  = "+p+" J/s");
          System.out.println("+----------------------------------+");
        }else if(menu == 3){
          System.out.println();
          System.out.println("+----------------------------------+");
          System.out.println(" 3. Menghitung Energi Potensial(Ep) ");
          System.out.println("+----------------------------------+");
          System.out.print("Masukkan Massa Benda(Kg) = ");
          int m = scan.nextInt();
          System.out.print("Masukkan Grafitasi Bumi(m/s^2) = ");
          int g = scan.nextInt();
          System.out.print("Masukkan Ketinggian Benda(m) = ");
          int h = scan.nextInt();
          System.out.println();
          System.out.println("+Dik. -----------------------------+");
          System.out.println("Massa Benda(m) = "+m+" Kg");
          System.out.println("Grafitasi Bumi(g) = "+g+" m/s^2");
          System.out.println("Ketinggian Benda(h) = "+h+" m");
          System.out.println();
          System.out.println("-> Energi Potensial(Ep) = m * g * h");
          System.out.println("   Ep = "+m+" * "+g+" * "+h);
          double ep = m * g * h;
          System.out.println("   Ep = "+ep+" Joule");
          System.out.println("+----------------------------------+");
        }else if(menu == 4){
          System.out.println();
          System.out.println("+----------------------------------+");
          System.out.println(" 4. Menghitung Energi Kinetik(Ep) ");
          System.out.println("+----------------------------------+");
          System.out.print("Masukkan Massa Benda(Kg) = ");
          int kg = scan.nextInt();
          System.out.print("Masukkan Kecepatan Benda(m/s) = ");
          int ms = scan.nextInt();
          System.out.println();
          System.out.println("+Dik. -----------------------------+");
          System.out.println("Massa Benda(m) = "+kg+" Kg");
          System.out.println("Kecepatan Benda(v) = "+ms+" ms");
          System.out.println();
          System.out.println("-> Energi Kinetik(Ek) = 0.5 * m * (v^2)");
          System.out.println("Ek = 0.5 * "+kg+" * ("+ms+"^2)");
          double ek = (0.5 * kg) * (ms*ms);
          System.out.println("Ek = "+ek+" Joule");
          System.out.println("+----------------------------------+");
        }else if(menu == 5){
          System.out.println();
          System.out.println("+----------------------------------+");
          System.out.println(" 5. Menghitung Energi Mekanik(Em) ");
          System.out.println("+----------------------------------+");
          System.out.println("-> Menghitung Energi Potensial(Ep)");
          System.out.print("Massa Benda(m) = ");
          int m = scan.nextInt();
          System.out.print("Grafitasi Bumi(g) = ");
          int g = scan.nextInt();
          System.out.print("Ketinggian Benda(h) = ");
          int h = scan.nextInt();
          System.out.println();
          System.out.println("-> Energi Potensial(Ep) = m * g * h");
          System.out.println("   Ep = "+m+" * "+g+" * "+h);
          double ep = m * g * h;
          System.out.println("   Ep = "+ep+" Joule");
          System.out.println("+----------------------------------+");
          System.out.println();
          System.out.println("-> Menghitung Energi Kinetik(Ek) ");
          System.out.print("Massa Benda(m) = ");
          int kg = scan.nextInt();
          System.out.print("Kecepatan Benda(v) = ");
          int ms = scan.nextInt();
          System.out.println();
          System.out.println("-> Energi Kinetik(Ek) = 0.5 * m * (v^2)");
          System.out.println("Ek = 0.5 * "+kg+" * ("+ms+"^2)");
          double ek = (0.5 * kg) * (ms*ms);
          System.out.println("Ek = "+ek+" Joule");
          System.out.println("+----------------------------------+");
          System.out.println();
          System.out.println("+Dik. -----------------------------+");
          System.out.println("Energi Potensial(Ep) = "+ep+" Joule");
          System.out.println("Energi Kinetik(Ek)   = "+ek+" Joule");
          System.out.println();
          System.out.println("-> Energi Mekanik(Em) = Ep + Ek");
          System.out.println(" Em = "+ep+" + "+ek); 
          double em = ep + ek;
          System.out.println(" Em = "+em+" Joule");
          System.out.println("+----------------------------------+");
       }else if(menu == 6){
         System.out.println("Program Selesai Terima kasih");
         System.exit(0);
       }else{
         System.out.println("PILIHAN TIDAK ADA!");
       }
       System.out.println();
       System.out.print("Menghitung dengan rumus fisika lainnya? (Y/N) : ");
       v = scan.next();
      }while(v.equalsIgnoreCase("y"));


     }else if(pilih == 4){
       String c;
       do{
       System.out.println();
       System.out.print("Masukkan jumlah mahasiswa : ");
       int mh = scan.nextInt();
       System.out.println();
       float rtt, rtr;
       int i,j,bt = 3;
       int nilai [][] = new int[mh][bt];
       float[]jumlah = new float[mh];
       float[]rata = new float[mh];
       int[] ntt = new int[bt];
       int[] ntr = new int[bt];
       for(i = 0;i < mh;i++){
         System.out.println("Mahasiswa "+(i + 1));
         for(j = 0;j < bt;j++){
           System.out.print("Nilai tes "+(j + 1)+" : ");
           nilai[i][j] = scan.nextInt();
           jumlah[i] = jumlah[i] + nilai[i][j];
         }
         rata[i] = jumlah[i]/bt;
         System.out.println();
       }
       
       for(j=0;j<bt;j++){
            ntt[j] = nilai[0][j];
            ntr[j] = nilai[0][j];
        }
        rtt = rata[0];
        rtr = rata[0];
       for(i=0;i<bt;i++){
            for( j=0;j<mh;j++){
                if(ntt[i] < nilai[j][i]){
                    ntt[i] = nilai[j][i];
                }
                if(ntr[i] > nilai[j][i]){
                    ntr[i] = nilai[j][i];
                }
            }
        }
       for(i=0;i<mh;i++){
            if(rtt < rata[i]){
                    rtt = rata[i];
                }
                if(rtr > rata[i]){
                    rtr = rata[i];
                }
        }
       System.out.println();
       System.out.println("-----------------------------");
       System.out.println("   DAFTAR NILAI MAHASISWA :");
       System.out.println("-----------------------------");
       System.out.println();
       System.out.println("                Test 1 Test 2 Test 3 Rata-rata");
       for(j=0;j<mh;j++){
            System.out.print("Mahasiswa " + (j+1));
            for(int k=0;k<bt;k++){
                System.out.print("     " + nilai[j][k]);
            }
            System.out.print("   " + rata[j]);
            System.out.println();
        }
        
        System.out.println();
        
        System.out.print("Nilai Tertinggi\t");
        for(j=0;j<bt;j++){
            System.out.print(ntt[j]);
            System.out.print("      ");
        }
        System.out.print(rtt);
        System.out.println();
        
        System.out.print("Nilai Terendah \t");
        for(j=0;j<bt;j++){
            System.out.print(ntr[j]);
            System.out.print("      ");
        }
        System.out.print(rtr);
        System.out.println();
        System.out.println();
        System.out.print("Ulang kembali program(y/n) ");
        c = scan.next();
    }while(c.equalsIgnoreCase("y"));


    }else if(pilih == 5){
      String ss;
      do{
      System.out.println();
      System.out.println("Program Penjumlahan 2 Buah Matriks");
      System.out.print("Masukan Jumlah Baris Matriks : ");
      int baris = scan.nextInt();
      System.out.print("Masukan Jumlah Kolom Matriks : ");
      int kolom = scan.nextInt();
      System.out.println();
      System.out.println("Masukan Data :");
      System.out.println("Matriks 1 :");
      int i,j;
      int nilai[][] = new int[baris][kolom];
      for(i = 0;i < baris;i++){
        for(j = 0;j < kolom;j++){
          System.out.print("Bil baris ke-"+i+" kolom ke-"+j+" : ");
          nilai[i][j] = scan.nextInt();
        }   
      }
      System.out.println();
      System.out.println("Matriks 2 :");
      int a,s;
      int nilai1[][] = new int[baris][kolom];
      for(a = 0;a < baris;a++){
        for(s = 0;s < kolom;s++){
          System.out.print("Bil baris ke-"+a+" kolom ke-"+s+" : ");
          nilai1[a][s] = scan.nextInt();
        }   
      }
      System.out.println();
      System.out.println("Matriks 1");
      for(int d = 0;d < baris;d++){
        for(int t = 0;t < kolom;t++){
          System.out.print(nilai[d][t]+" ");
        }
        System.out.println();
      }
      System.out.println();
      System.out.println("Matriks 2");
      for(int x = 0;x < baris;x++){
        for(int y = 0;y < kolom;y++){
          System.out.print(nilai1[x][y]+" ");
        }
        System.out.println();
      }
      System.out.println();
      System.out.println("Penjumlahan Matriks");
      int z[][] = new int[baris][kolom];
      int o,p;
      for(o = 0;o < baris;o++){
        for(p = 0;p < kolom;p++){
          z[o][p]= nilai[o][p] + nilai1[o][p];
          System.out.print(z[o][p]+" ");
        }
        System.out.println();
      }
      System.out.println();
      System.out.println("Pengurangan Matriks");
      int zz[][] = new int[baris][kolom];
      int oo,pp;
      for(oo = 0;oo < baris;oo++){
        for(pp = 0;pp < kolom;pp++){
          zz[oo][pp]= nilai[oo][pp] - nilai1[oo][pp];
          System.out.print(zz[oo][pp]+" ");
        }
        System.out.println();
      }
      System.out.println();
      System.out.println("Perkalian Matriks");
      int l[][] = new int[baris][kolom];
      int e,r;
      for(e = 0;e < baris;e++){
        for(r = 0;r < kolom;r++){
          l[e][r]= nilai[e][r] * nilai1[e][r];
          System.out.print(l[e][r]+" ");
        }
        System.out.println();
      }
      System.out.println();
      System.out.println("Pembagian Matriks");
      int w[][] = new int[baris][kolom];
      int jj,k;
      for(jj = 0;jj < baris;jj++){
        for(k = 0;k < kolom;k++){
          w[jj][k]= nilai[jj][k] / nilai1[jj][k];
          System.out.print(w[jj][k]+" ");
        }
        System.out.println();
      }
      System.out.println();
      System.out.print("Ulang Kembali Program(y/n) ");
      ss = scan.next();
     }while(ss.equalsIgnoreCase("y"));


    }else if(pilih == 6){
      String gd;
      do{
      System.out.println();
      int t;
      System.out.print("Input Banyaknya Jumlah Data : ");
      int dt = scan.nextInt();
      int data [] = new int[dt];
      for(int y = 0;y < dt;y++){
        System.out.print("Masukan Data ke "+(y+1)+" : ");
        data[y] = scan.nextInt();
      }
      System.out.println();
      System.out.print("Data Sebelum Disorting : ");
      for(int b = 0;b < dt;b++){
      System.out.print(data[b]+" ");
      }
      System.out.println();
      System.out.println();
      System.out.print("Data Secara Ascending  : ");
      for(int d = 0;d < dt-1;d++){
        for(int c = 0;c < dt-1;c++){
          if(data[c + 1] < data[c]){
            t         = data[c];
            data[c]   = data[c+1];
            data[c+1] = t;
          }
        }
      }
      for(int d =0;d < dt;d++){
        System.out.print(data[d]+" ");
      }
      System.out.println();
      System.out.println();
      System.out.print("Data Secara Descending : ");
      for(int d = 0;d < dt-1;d++){
        for(int c = 0;c < dt-1;c++){
          if(data[c + 1] > data[c]){
            t         = data[c];
            data[c]   = data[c+1];
            data[c+1] = t;
          }
        }
      }
      for(int d =0;d < dt;d++){
        System.out.print(data[d]+" ");
      }
      System.out.println();
      System.out.println();
      System.out.print("Ulang Kembali Program(y/n) ");
      gd = scan.next();
     }while(gd.equalsIgnoreCase("y"));
    }else if(pilih == 7){


      String uu;
      do{
               String   [] nama       =new String[20];
               String   [] merk       =new String[20];
               String   [] tipe       =new String[20];
               int      [] jmlbeli    =new int   [20];
               double   [] harga      =new double[20];
               double   [] total      =new double[20];

               String jawab="";    int i=0;    int k;
             

      System.out.println();
      System.out.println("**   SELAMAT DATANG DI HELMETBANDUNG.COM   **");
      System.out.println();
      System.out.println("                Helm Yang Tersedia");
      System.out.println("______________________________________________");
      System.out.println("               ---- MERK HELM ----");
      System.out.println("              1. Ink    => Rp.150.000");
      System.out.println("              2. Kyt    => Rp.200.000");
      System.out.println("              3. Arai   => Rp.450.000");
      System.out.println("              4. Bmc    => Rp.100.000");
      System.out.println("              5. Kbc    => Rp.250.000");
      System.out.println("              6. Nollan => Rp.500.000");
      System.out.println("              7. Agp    => Rp.350.000");
      System.out.println("              8. Wtc    => Rp.120.000");
      System.out.println();
      System.out.println("                ---- TIPE HELM ----");
      System.out.println("                     1. Ink Dc");
      System.out.println("                     2. Kyt Troy");
      System.out.println("                     3. Arai 7x");
      System.out.println("                     4. Bmc Full");
      System.out.println("                     5. Kbc Race");
      System.out.println("                     6. Nollan Race");
      System.out.println("                     7. Agp Race");
      System.out.println("                     8. Wtc Gold");
      System.out.println("______________________________________________\n");
      
   
   

           do {
            nama[i]=JOptionPane.showInputDialog(null,"Nama Pembeli");
            merk[i]=JOptionPane.showInputDialog(null,"Merk Helm");
            tipe[i]=JOptionPane.showInputDialog(null,"Tipe Helm");
            jmlbeli[i]=Integer.valueOf(JOptionPane.showInputDialog("Jumlah Helm yang Dibeli"));
   
   
         if (merk[i].equalsIgnoreCase("Ink") && tipe[i].equalsIgnoreCase("Ink Dc"))
             harga[i]=150000;
            else
         if (merk[i].equalsIgnoreCase("Kyt") && tipe[i].equalsIgnoreCase("Kyt Troy"))
            harga[i]=200000;
            else
         if (merk[i].equalsIgnoreCase("Arai") && tipe[i].equalsIgnoreCase("Arai 7x"))
            harga[i]=450000;
            else
         if (merk[i].equalsIgnoreCase("Bmc") && tipe[i].equalsIgnoreCase("Bmc Full"))
            harga[i]=100000;
            else
         if (merk[i].equalsIgnoreCase("Kbc") && tipe[i].equalsIgnoreCase("Kbc Race"))
            harga[i]=250000;
            else
         if (merk[i].equalsIgnoreCase("Nollan") && tipe[i].equalsIgnoreCase("Nollan Race"))
            harga[i]=500000;
            else
         if (merk[i].equalsIgnoreCase("Agp") && tipe[i].equalsIgnoreCase("Agp Race"))
            harga[i]=350000;
            else
         if (merk[i].equalsIgnoreCase("Wtc") && tipe[i].equalsIgnoreCase("Wtc Gold"))
            harga[i]=120000;

            else
            harga[i]=0;

            total[i]=harga[i]*jmlbeli[i];

                            i++;
           jawab=JOptionPane.showInputDialog("Mau Tambah data lagi Y/T");
           }while(jawab.equalsIgnoreCase("Y"));
   
        System.out.println("  # Perhatian Sebelum'nya !! : ");
        System.out.println(" ");
        System.out.println(" 1. Barang Yang Sudah Dibeli Tidak Dapat Dikembalikan:Kecuali ");
        System.out.println(" 2. Barang Ditukar Dengan Jangka Waktu 1 Hari");
        System.out.println(" 3. Kami tidak menerima pengembalian helm dalam keadaan cacat");
        System.out.println(" ");
        System.out.println(" ---  Terima Kasih Atas Perhatiannya  --- ");
           
        for(int z=0;z<i; z++){
        k=z+1;
        System.out.println("");
        System.out.println("         TOKO HELMETBANDUNG.COM          ");
        System.out.println("=========================================");
        System.out.println("No\tNama\tMerk Helm\tTipe Helm");
        System.out.println("=========================================");
        System.out.println(k+"\t"+nama[z]+"\t"+merk[z]+"\t\t"+tipe[z]);

        System.out.println("-----------------------------------------");
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("Jumlah Beli\tHarga\t\tTotal");
        System.out.println("=========================================");
        System.out.println(""+jmlbeli[z]+"\t\t"+harga[z]+"\t"+total[z]);
        System.out.println("-----------------------------------------");
        System.out.println("");  
        }

        uu = JOptionPane.showInputDialog(null,"Apakah Anda Ingin Beli Helm Lagi?(y/n)");
        }while(uu.equalsIgnoreCase("y"));


     }else if(pilih == 8){
       String aa;
       do{
       System.out.println();
       System.out.print("Input Jumlah Data Biodata : ");
       int dt = scan.nextInt();
       for(int k = 0; k < dt;k++){
       System.out.println();
       String nama,alamat,hobby,notel;
       int umur;
       nama   = JOptionPane.showInputDialog(null, "Nama ");
       alamat = JOptionPane.showInputDialog(null, "Alamat");
       hobby  = JOptionPane.showInputDialog(null, "Hobby");
       notel  = JOptionPane.showInputDialog(null, "Nomor Handphone");
       umur   = Integer.parseInt(JOptionPane.showInputDialog(null, "Umur"));
       System.out.println("*************************************");
       System.out.println("Nama            : "+nama);
       System.out.println("Alamat          : "+alamat);
       System.out.println("Hobby           : "+hobby);
       System.out.println("Nomor Telephone : "+notel);
       System.out.println("Umur            : "+umur);
       System.out.println("*************************************");
        }
        aa = JOptionPane.showInputDialog(null, "Mau Mengulang Lagi (y/n)");
       }while(aa.equalsIgnoreCase("y"));


     }else if(pilih == 9){
         String aa;
         do{
         System.out.println();
         System.out.println("Silahkan Pilih Bangun Ruang :");
         System.out.println("1. Volume Balok");
         System.out.println("2. Volume Kubus");
         System.out.println("3. Volume Prisma Segitiga");
         System.out.println("4. Volume Limas");
         System.out.println("5. Volume Bola");
         System.out.println();
         System.out.print("Input pilihan : ");
         int pl = scan.nextInt();
         System.out.println();
         if(pl == 1){
             String jj;
             do{
                System.out.println();
                System.out.println("1. Anda masuk ke pilihan menghitung Volume Balok");
                System.out.println("   Rumus Volume Balok = Panjang * Lebar * Tinggi");
                System.out.println();
                int p,l,t,h;
                p = Integer.parseInt(JOptionPane.showInputDialog(null, "Panjang"));
                l = Integer.parseInt(JOptionPane.showInputDialog(null, "Lebar"));
                t = Integer.parseInt(JOptionPane.showInputDialog(null, "Tinggi"));
                h = p * l * t;
                JOptionPane.showMessageDialog(null,"Hasil Hitung Volume Balok Adalah " +
                h + " Satuan Volume","Hasil Hitung",JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Panjang : " + p);
                System.out.println("Lebar   : " + l);
                System.out.println("Tinggi  : " + t);
                System.out.println();
                System.out.println("Hasil Hitung Volume Balok Adalah : " + h + " Satuan Volume");
            jj = JOptionPane.showInputDialog(null, "Lakukan perhitungan volume balok lagi(Y/N)");
            }while(jj.equalsIgnoreCase("y"));
         }else if(pl == 2){
             String jj;
             do{
                System.out.println();
                System.out.println("2. Anda masuk ke pilihan menghitung Volume Kubus");
                System.out.println("   Rumus Volume Kubus = sisi*sisi*sisi");
                int ss = Integer.parseInt(JOptionPane.showInputDialog(null,("Sisi Kubus")));
                int sisi = ss * ss * ss;
                JOptionPane.showMessageDialog(null, "Hasil Hitung Volume Kubus adalah " +
                sisi ,"Hasil Hitung",JOptionPane.INFORMATION_MESSAGE);
                System.out.println();
                System.out.println("Sisi : " + ss);
                System.out.println();
                System.out.println("Hasil Hitung Volume Kubus Adalah : " + sisi +" Satuan Volume");
             jj = JOptionPane.showInputDialog(null, "Lakukan perhitungan volume kubus lagi(Y/N)");
            }while(jj.equalsIgnoreCase("y"));
         }else if(pl == 3){
             String jj;
             do{
                 System.out.println();
                 System.out.println("3. Anda masuk ke pilihan menghitung Volume Prisma Segitiga");
                 System.out.println("   Rumus Volume Prisma Segitiga = Luas Alas * Tinggi Prisma");
                 int l = Integer.parseInt(JOptionPane.showInputDialog(null, "Alas Prisma"));
                 int t = Integer.parseInt(JOptionPane.showInputDialog(null, "Tinggi Prisma"));
                 int la = (l * t) /2;
                 int h = la * t;
                 JOptionPane.showMessageDialog(null, "Hasil Hitung Volume Prima Segitiga adalah : "+
                 h,"Hasil Hitung", JOptionPane.INFORMATION_MESSAGE);
                 System.out.println();
                 System.out.println("Alas Prisma   : " + l);
                 System.out.println("Tinggi Prisma : " + t);
                 System.out.println("Luas Alas     : " + la);
                 System.out.println();
                 System.out.println("Hasil Hitung Volume Prima Segitiga Adalah : " + h+ " Satuan Volume");
                 jj = JOptionPane.showInputDialog(null, "Lakukan perhitungan volume prisma segitiga lagi(Y/N)");
               }while(jj.equalsIgnoreCase("y"));
         }else if(pl == 4){
             String jj;
             do{
                System.out.println();
                System.out.println("4. Anda masuk ke pilihan menghitung Volume Limas");
                System.out.println("   Rumus Volume Limas = 0.3 * Luas alas limas + tinggi limas");
                int l = Integer.parseInt(JOptionPane.showInputDialog(null, "Alas Limas"));
                int t = Integer.parseInt(JOptionPane.showInputDialog(null, "Tinggi limas"));
                int la = 2 * ((l * t)/ 2);
                double h = 0.3 * la + t;
                JOptionPane.showMessageDialog(null, "Hasil Hitung Volume Limas adalah : "+
                 h,"Hasil Hitung", JOptionPane.INFORMATION_MESSAGE);
                 System.out.println();
                 System.out.println("Alas Limas   : " + l);
                 System.out.println("Tinggi Limas : " + t);
                 System.out.println("Luas Alas    : " + la);
                 System.out.println();
                 System.out.println("Hasil Hitung Volume Limas Adalah : " + h+ " Satuan Volume");
                jj = JOptionPane.showInputDialog(null, "Lakukan perhitungan volume limas lagi(Y/N)");
               }while(jj.equalsIgnoreCase("y"));
         }else if(pl == 5){
             String jj;
             do{
               System.out.println();
               System.out.println("5. Anda masuk ke pilihan menghitung Volume Bola");
               System.out.println("   Rumus Volume Bola = (4/3) * phi * r3");
               int r = Integer.parseInt(JOptionPane.showInputDialog(null, "Jari - jari(r)"));
               double v = (4/3) * 3.14 * (r * r * r);
               JOptionPane.showMessageDialog(null, "Hasil Hitung Volume Bola adalah : "+
               v,"Hasil Hitung",JOptionPane.INFORMATION_MESSAGE);
               System.out.println();
               System.out.println("Jari - jari(r) : " + r);
               System.out.println();
               System.out.println("Hasil Hitung Volume Bola Adalah : " +v+ " Satuan Volume");
                jj = JOptionPane.showInputDialog(null, "Lakukan perhitungan volume bola lagi(Y/N)");
               }while(jj.equalsIgnoreCase("y"));
          }else{
            System.out.println("PILIHAN TIDAK ADA\n");
          }
               aa = JOptionPane.showInputDialog(null, "Lakukan perhitungan bangun ruang lain(Y/N");
           }while(aa.equalsIgnoreCase("y"));


     }else{
       System.out.println("MOHON MAAF PILIHAN TIDAK ADA");
     }
     System.out.println();
     System.out.print("Mulai Ulang Aplikasi(y/n) ?? ");
     u = scan.next();
     }while(u.equalsIgnoreCase("y"));
     System.out.println();
     System.out.println("Program Selesai Terima kasih");
   }
}