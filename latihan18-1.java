import java.util.Scanner;

public class latihan18 {

    public static void main(String[]args) {

        Scanner scan=new Scanner(System.in);

        boolean run=true;
        String pilihan;

        while (run) {

            int pilihan1;

            System.out.println();
            System.out.println("Selamat Datang Di Program Latihan Array");
            System.out.println("1. Program Array 1 Dimensi\n2. Program Array 2 Dimensi\n3. program Array Bubble Sort");
            System.out.println();
            System.out.print("Input Pilihan : ");
            pilihan1=scan.nextInt();
            System.out.println();

            switch (pilihan1) {

                case 1:

                    while (run) {

                        int js,s,x=0;
                        int a,g=0;

                        System.out.println("1. Selamat Datang Di Program Array Nilai Siswa 1 Dimensi");
                        System.out.println();
                        System.out.print("Berapa Jumlah Siswa : ");
                        js=scan.nextInt();
                        System.out.println();
                        s=js;

                        int nilai[] = new int [js];

                        for (a=0;a<js;a++) {

                            System.out.print("Nilai Ujian Siswa Ke-"+(a+1)+" Adalah : ");
                            nilai[a]=scan.nextInt();

                            x=x+nilai[a];

                        }

                        double hasil = (double) x/s;

                        System.out.println();
                        System.out.println("Nilai Rata-rata Hasil Ujian Siswa Adalah : "+hasil);

                        int nrs=0;

                        for (a=0;a<s;a++) {


                            if (nilai[a]>75) {

                                nrs=nrs+1;

                            }

                        }
                        
                        System.out.println("Siswa Dengan Nilai Di Atas Rata-rata "+nrs+" Orang");
                        System.out.println();

                        Scanner case1=new Scanner(System.in);

                        String running1;

                        boolean run2=true;

                        while (run2) {

                            System.out.print("Ulangi Program Ini ? (ya/tidak) : ");
                            running1=case1.nextLine();
                            System.out.println();

                            if (running1.equalsIgnoreCase("tidak")) {

                                run=false;
                                run2=false;

                            } else if (running1.equalsIgnoreCase("ya")) {

                                run=true;
                                run2=false;

                            } else {

                                run2=true;

                                System.out.println("Maaf Inputan Yang Anda Masukkan Salah!!!");
                                System.out.println("Silahkan Ketik Kembali!!!");
                                System.out.println();

                            }

                        }

                    }

                break;

                case 2:

                    while (run) {

                        int ma[][] = {{1,2}, {5,6}};
                        int mb[][] = {{3,4}, {7,8}};
                        int baris=2;
                        int kolom=2;
                        int h [][] = new int [baris][kolom];

                        System.out.println("2. Selamat Datang Di Program Matrix Array 2 Dimensi");
                        System.out.println();
                        System.out.println("Matrix A");

                        for (int b=0;b<baris;b++) {

                            for (int k=0;k<kolom;k++) {

                                System.out.print(ma[b][k]+" ");

                            }

                            System.out.println();

                        }

                        System.out.println("Matrix B");

                        for (int b=0;b<baris;b++) {

                            for (int k=0;k<kolom;k++) {

                                System.out.print(ma[b][k]+" ");

                            }

                            System.out.println();

                        }

                        System.out.println("Proses Penjumlahan Matriks A Dan B = ");

                        for (int b=0;b<baris;b++) {

                            for (int k=0;k<kolom;k++) {

                                h[b][k]=ma[b][k]+mb[b][k];
                                
                                System.out.print(ma[b][k]+" + "+mb[b][k]+" = "+h[b][k]+"    ");

                            }

                            System.out.println();

                        }

                        System.out.println("Hasil Penjumlahan Matriks A Dan B = ");

                        for (int b=0;b<baris;b++) {

                            for (int k=0;k<kolom;k++) {

                                System.out.print(h[b][k]+"    ");

                            }

                            System.out.println("");

                        }

                        System.out.println("");

                        Scanner case1=new Scanner(System.in);

                        String running1;

                        boolean run2=true;

                        while (run2) {

                            System.out.print("Ulangi Program Ini ? (ya/tidak) : ");
                            running1=case1.nextLine();
                            System.out.println();

                            if (running1.equalsIgnoreCase("tidak")) {

                                run=false;
                                run2=false;

                            } else if (running1.equalsIgnoreCase("ya")) {

                                run=true;
                                run2=false;

                            } else {

                                run2=true;

                                System.out.println("Maaf Inputan Yang Anda Masukkan Salah!!!");
                                System.out.println("Silahkan Ketik Kembali!!!");
                                System.out.println();

                            }

                        }

                    }

                break;

                case 3:

                    while (run) {

                        System.out.println("3. Selamat Datang Di Program Array Bubble sort");
                        System.out.println();
                        System.out.println();

                        int t,i,j;
                        int b[]={29,13,10,7,34,21,4,54,30};

                        System.out.println("PROGRAM PENGURUTAN SECARA ASCENDING");
                        System.out.println("===================================");
                        System.out.println();
                        System.out.println("Data Sebelum Diurutkan : ");
                        
                        for (i=0;i<9;i++) {

                            System.out.print(b[i]+" ");

                        }
                        
                        System.out.println();
                        System.out.println();
                        System.out.println("Setelah Data Diurutkan : ");

                        for (j=0;j<8;j++) {

                            for (i=0;i<8;i++) {

                                if ( b[i+1] < b[i] ) {

                                    t = b[i];
                                    b[i] = b[i+1];
                                    b[i+1] = t;

                                }

                            }

                        }

                        for (i=0;i<9;i++) {

                            System.out.print(b[i]+" ");

                        }

                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println("PROGRAM PENGURUTAN SECARA DESCENDING");
                        System.out.println("====================================");
                        System.out.println();
                        System.out.println("Data Sebelum Diurutkan : ");

                        for (i=0;i<9;i++) {

                            System.out.print(b[i]+" ");

                        }

                        System.out.println();

                        System.out.println();
                        System.out.println("Setelah Data Diurutkan : ");

                        for (j=0;j<8;j++) {

                            for (i=0;i<8;i++) {

                                if ( b[i+1] > b[i] ) {

                                    t = b[i];
                                    b[i] = b[i+1];
                                    b[i+1] = t;

                                }

                            }

                        }

                        for (i=0;i<9;i++) {

                            System.out.print(b[i]+" ");

                        }

                        System.out.println();

                        System.out.println();

                        Scanner case1=new Scanner(System.in);

                        String running1;

                        boolean run2=true;

                        while (run2) {

                            System.out.print("Ulangi Program Ini ? (ya/tidak) : ");
                            running1=case1.nextLine();
                            System.out.println();

                            if (running1.equalsIgnoreCase("tidak")) {

                                run=false;
                                run2=false;

                            } else if (running1.equalsIgnoreCase("ya")) {

                                run=true;
                                run2=false;

                            } else {

                                run2=true;

                                System.out.println("Maaf Inputan Yang Anda Masukkan Salah!!!");
                                System.out.println("Silahkan Ketik Kembali!!!");
                                System.out.println();

                            }

                        }

                    }

                break;

                default :

                System.out.println("Maaf Pilihan Anda Tidak Ada!!!");
                System.out.println("Silahkan Pilih Kembali!!!");
                System.out.println("Tetap Ingat Yang Tersulit Bukanlah Memilih,");
                System.out.println("Tetapi Tetap Bertahan Pada Pilihan.");
                System.out.println();

                break;

            }

            boolean run1=true;

            while (run1) {

                Scanner rohesa=new Scanner(System.in);

                String running;

                System.out.print("Mulai Ulang aplikasi (Ya/Tidak) ?? ");
                running=rohesa.nextLine();
                System.out.println();

                if (running.equalsIgnoreCase("Tidak")) {

                    run=false;
                    run1=false;
                    System.out.println("Sekian Dan Terimakasih");

                } else if (running.equalsIgnoreCase("ya")) {

                    run=true;
                    run1=false;

                } else {

                    run=false;
                    run1=true;

                    System.out.println("Maaf Inputan Yang Anda Masukkan Salah!!!");
                    System.out.println("Silahkan Ketik Kembali!!!");

                }

            }

        }

    }

}