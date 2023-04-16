import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class nothing{
    public static void main(String args[]){
        try{
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        System.out.print("Masukkan Nama Anda : ");
        String nama = input.readLine();
        System.out.println("Nama Anda Adalah "+ nama+ " Selamat Datang");
        } catch (IOException ex){
        ex.getMessage();
        }
    }
}