import java.util.Scanner;
public class contoh10{
    public static void main(String args[]){
        int n,i;
        int bil[] = new int[100]; //deklarasi array bil
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan banyak data : ");
        n = scn.nextInt();
        //cara mengisi array dari keyboard
        System.out.println("masukkan " + n + " buah bilangan : ");
        for (i = 0; i < n; i++){
            System.out.print("bilangan ke-" + (i + 1) + " : ");
            bil[i] = scn.nextInt();
        }
        System.out.println("Tampilkan semua bilangan");
        for (i = 0; i < n; i++){
            System.out.println("bilangan ke-" + (i + 1) + " : " + bil[i]);
        }
    }
}