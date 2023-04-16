import java.util.Scanner;
public class latihan13{
    public static void main(String args[]){
        System.out.println("*********************************************");
        System.out.println("*               Toko GerdYoung              *");
        System.out.println("*      Jl. Permata Kopo No. 25 Bandung      *");
        System.out.println("*      email: gerdyoung1234@gmail.com       *");
        System.out.println("*            no.hp: 08996159510             *");
        System.out.println("*********************************************");
        System.out.println("");
        System.out.println("        Melayani Dengan Sepenuh Hati         ");
        System.out.println("");
        System.out.println("Daftar barang yang tersedia di toko gerdyoung :");
        System.out.println("");
        System.out.println("1.beras    Harga => Rp  9.000/Kg");
        System.out.println("2.gula     Harga => Rp 12.000/Kg");
        System.out.println("3.telur    Harga => Rp 17.000/Kg");
        System.out.println("4.minyak   Harga => Rp 20.000/Kg");
        System.out.println("5.tepung   Harga => Rp  5.000/Kg");
        System.out.println("");

        int total,pilih,kg,ibayar;
        double diskon,bayar,kembalian;
        Scanner scan = new Scanner(System.in);
        System.out.print("Silahkan pilih nomor barang yang akan anda beli : ");
        pilih = scan.nextInt();
        if(pilih == 1){
            System.out.println("Beras kami telah anda beli");
            System.out.println("Dengan harga Rp 9.000/Kg");
            System.out.print("Berapa Kg beras yang akan anda beli ? ");
            kg = scan.nextInt();
            total = kg * 9000;
            System.out.println("Total belanja anda adalah : " + total);
            System.out.println("");
            if(total >= 100000){
                System.out.println("Anda mendapatkan diskon 25%");
                diskon = total * 0.25;
                System.out.println("Diskon anda sebesar = " + diskon);
                bayar = total - diskon;
                System.out.println("Jadi anda harus membayar sebesar Rp." + bayar);
                System.out.println("");
                System.out.print("Input Bayar : ");
                ibayar = scan.nextInt();
                if(ibayar < bayar){
                    System.out.println("Mohon maaf uang anda kurang");
                }else{
                kembalian = ibayar - bayar;
                System.out.println("Uang kembalian anda Rp." + kembalian);
                System.out.println("");
                System.out.println("*********************************************");
                System.out.println("*     TerimaKasih Atas Kunjungan Anda       *");
                System.out.println("*********************************************");
                }
            }else{
                System.out.println("Total belanja anda adalah : " + total);
                System.out.print("Input Bayar : ");
                ibayar = scan.nextInt();
                if(ibayar < total){
                    System.out.println("Mohon maaf uang anda kurang");
                }else{
                    kembalian = ibayar - total;
                    System.out.println("Uang kembalian anda Rp." + kembalian); 
                    System.out.println("");
                    System.out.println("*********************************************");
                    System.out.println("*     TerimaKasih Atas Kunjungan Anda       *");
                    System.out.println("*********************************************");

                }
            }
        }else if(pilih == 2){
            System.out.println("Gula kami telah anda beli");
            System.out.println("Dengan harga Rp 12.000/Kg");
            System.out.print("Berapa Kg gula yang akan anda beli ? ");
            kg = scan.nextInt();
            total = kg * 12000;
            System.out.println("Total belanja anda adalah : " + total);
            System.out.println("");
            if(total >= 100000){
                System.out.println("Anda mendapatkan diskon 30%");
                diskon = total * 0.30;
                System.out.println("Diskon anda sebesar = " + diskon);
                bayar = total - diskon;
                System.out.println("Jadi anda harus membayar sebesar Rp." + bayar);
                System.out.println("");
                System.out.print("Input Bayar : ");
                ibayar = scan.nextInt();
                if(ibayar < bayar){
                    System.out.println("Mohon maaf uang anda kurang");
                }else{
                kembalian = ibayar - bayar;
                System.out.println("Uang kembalian anda Rp." + kembalian);
                System.out.println("");
                System.out.println("*********************************************");
                System.out.println("*     TerimaKasih Atas Kunjungan Anda       *");
                System.out.println("*********************************************");
                }
            }else{
                System.out.println("Total belanja anda adalah : " + total);
                System.out.print("Input Bayar : ");
                ibayar = scan.nextInt();
                if(ibayar < total){
                    System.out.println("Mohon maaf uang anda kurang");
                }else{
                    kembalian = ibayar - total;
                    System.out.println("Uang kembalian anda Rp." + kembalian); 
                    System.out.println("");
                    System.out.println("*********************************************");
                    System.out.println("*     TerimaKasih Atas Kunjungan Anda       *");
                    System.out.println("*********************************************");
                }
            }
        }else if(pilih == 3){
            System.out.println("Telur kami telah anda beli");
            System.out.println("Dengan harga Rp 17.000/Kg");
            System.out.print("Berapa Kg telur yang akan anda beli ? ");
            kg = scan.nextInt();
            total = kg * 17000;
            System.out.println("Total belanja anda adalah : " + total);
            System.out.println("");
            if(total >= 100000){
                System.out.println("Anda mendapatkan diskon 20%");
                diskon = total * 0.20;
                System.out.println("Diskon anda sebesar = " + diskon);
                bayar = total - diskon;
                System.out.println("Jadi anda harus membayar sebesar Rp." + bayar);
                System.out.println("");
                System.out.print("Input Bayar : ");
                ibayar = scan.nextInt();
                if(ibayar < bayar){
                    System.out.println("Mohon maaf uang anda kurang");
                }else{
                kembalian = ibayar - bayar;
                System.out.println("Uang kembalian anda Rp." + kembalian);
                System.out.println("");
                System.out.println("*********************************************");
                System.out.println("*     TerimaKasih Atas Kunjungan Anda       *");
                System.out.println("*********************************************");
                }
            }else{
                System.out.println("Total belanja anda adalah : " + total);
                System.out.print("Input Bayar : ");
                ibayar = scan.nextInt();
                if(ibayar < total){
                    System.out.println("Mohon maaf uang anda kurang");
                }else{
                    kembalian = ibayar - total;
                    System.out.println("Uang kembalian anda Rp." + kembalian); 
                    System.out.println("");
                    System.out.println("*********************************************");
                    System.out.println("*     TerimaKasih Atas Kunjungan Anda       *");
                    System.out.println("*********************************************");
                }
            }
        }else if(pilih == 4){
            System.out.println("Minyak kami telah anda beli");
            System.out.println("Dengan harga Rp 20.000/Kg");
            System.out.print("Berapa Kg minyak yang akan anda beli ? ");
            kg = scan.nextInt();
            total = kg * 20000;
            System.out.println("Total belanja anda adalah : " + total);
            System.out.println("");
            if(total >= 100000){
                System.out.println("Anda mendapatkan diskon 35%");
                diskon = total * 0.35;
                System.out.println("Diskon anda sebesar = " + diskon);
                bayar = total - diskon;
                System.out.println("Jadi anda harus membayar sebesar Rp." + bayar);
                System.out.println("");
                System.out.print("Input Bayar : ");
                ibayar = scan.nextInt();
                if(ibayar < bayar){
                    System.out.println("Mohon maaf uang anda kurang");
                }else{
                kembalian = ibayar - bayar;
                System.out.println("Uang kembalian anda Rp." + kembalian);
                System.out.println("");
                System.out.println("*********************************************");
                System.out.println("*     TerimaKasih Atas Kunjungan Anda       *");
                System.out.println("*********************************************");
                }
            }else{
                System.out.println("Total belanja anda adalah : " + total);
                System.out.print("Input Bayar : ");
                ibayar = scan.nextInt();
                if(ibayar < total){
                    System.out.println("Mohon maaf uang anda kurang");
                }else{
                    kembalian = ibayar - total;
                    System.out.println("Uang kembalian anda Rp." + kembalian); 
                    System.out.println("");
                    System.out.println("*********************************************");
                    System.out.println("*     TerimaKasih Atas Kunjungan Anda       *");
                    System.out.println("*********************************************");
                }
            }
        }else if(pilih == 5){
            System.out.println("Tepung kami telah anda beli");
            System.out.println("Dengan harga Rp 5.000/Kg");
            System.out.print("Berapa Kg gula yang akan anda beli ? ");
            kg = scan.nextInt();
            total = kg * 5000;
            System.out.println("Total belanja anda adalah : " + total);
            System.out.println("");
            if(total >= 100000){
                System.out.println("Anda mendapatkan diskon 5%");
                diskon = total * 0.05;
                System.out.println("Diskon anda sebesar = " + diskon);
                bayar = total - diskon;
                System.out.println("Jadi anda harus membayar sebesar Rp." + bayar);
                System.out.println("");
                System.out.print("Input Bayar : ");
                ibayar = scan.nextInt();
                if(ibayar < bayar){
                    System.out.println("Mohon maaf uang anda kurang");
                }else{
                kembalian = ibayar - bayar;
                System.out.println("Uang kembalian anda Rp." + kembalian);
                System.out.println("");
                System.out.println("*********************************************");
                System.out.println("*     TerimaKasih Atas Kunjungan Anda       *");
                System.out.println("*********************************************");
                }
            }else{
                System.out.println("Total belanja anda adalah : " + total);
                System.out.print("Input Bayar : ");
                ibayar = scan.nextInt();
                if(ibayar < total){
                    System.out.println("Mohon maaf uang anda kurang");
                }else{
                    kembalian = ibayar - total;
                    System.out.println("Uang kembalian anda Rp." + kembalian); 
                    System.out.println("");
                    System.out.println("*********************************************");
                    System.out.println("*     TerimaKasih Atas Kunjungan Anda       *");
                    System.out.println("*********************************************");
                }
            }
        }else{
            System.out.println("ERROR!!!");
        }


    }
}