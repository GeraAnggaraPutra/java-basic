import java.util.Scanner;
public class contoh4{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        String nama;
        int umur;

        System.out.print("Masukkan nama :  ");
        nama = input.nextLine();
        System.out.print("Masukkan umur : ");
        umur = input.nextInt();
        System.out.println("Nama anda adalah :"+nama);
        System.out.println("Umur anda adalah :"+umur+" Tahun");
    }
}