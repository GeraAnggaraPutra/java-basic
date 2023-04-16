import java.util.Scanner;
public class contoh5{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int nilai;

        System.out.print("Input Nilai : ");
        nilai = in.nextInt();
        if(nilai>=80){
            System.out.println("Selamat anda lulus luar biasa");
        }else if(nilai>=60){
            System.out.println("Selamat anda lulus karena gede milik");
        }else{
            System.out.println("Maaf anda tidak lulus");
        }
    }
}