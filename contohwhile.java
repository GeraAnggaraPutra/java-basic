import java.util.Scanner;
public class contohwhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean run = true;
        String h;

        while (run) {
            
            System.out.println();
            System.out.println("\t apakah anda ingin mengakhiri program ini ? ");
            System.out.print("\tApakah jawabanmu (ya/tidak) = ");
            h=scan.nextLine();
            System.out.println();

            if (h.equalsIgnoreCase("ya")) {
                run=false;

        }
    }
  }
}