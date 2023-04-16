import javax.swing.JOptionPane;
public class helm {
    public static void main(String args[]){

       String   [] nama       =new String[20];
               String   [] merk       =new String[20];
               String   [] tipe       =new String[20];
               int      [] jmlbeli    =new int   [20];
               double   [] harga      =new double[20];
               double   [] total      =new double[20];

              String jawab="";    int i=0;    int k;
   

              System.out.println("");
              System.out.println("*    SELAMAT DATANG DI BANDUNGHELMET.COM    *");
              System.out.println("");
              System.out.println("_______________");
              System.out.println("_______________");
              System.out.println("            ---- MERK HELM ----  ");
              System.out.println("                  1.Ink");
              System.out.println("                  2.Kyt");
              System.out.println("                  3.Arai");
              System.out.println("                  4.Bmc");
              System.out.println("                  5.Kbc");
              System.out.println("                  6.Nollan");
              System.out.println("                  7.Agp");
              System.out.println("                  8.Wtc");
              System.out.println("");
              System.out.println("            ---- TIPE HELM ----  ");
              System.out.println("                  1.Ink Dc");
              System.out.println("                  2.Kyt Troy");
              System.out.println("                  3.Arai 7x"); 
              System.out.println("                  4.Bmc Full");
              System.out.println("                  5.Kbc Race");
              System.out.println("                  6.Nollan Race");
              System.out.println("                  7.Agp Race");   
              System.out.println("                  8.Wtc Gold");
              System.out.println("_______________");
   
   

           do {
            nama[i]=JOptionPane.showInputDialog("Nama Pembeli  = ");
            merk[i]=JOptionPane.showInputDialog("Merk Helm  = ");
            tipe[i]=JOptionPane.showInputDialog("Tipe Helm  = ");
            jmlbeli[i]=Integer.valueOf(JOptionPane.showInputDialog("Jumlah Helm yang Dibeli  = "));
   
   
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
}
            while(jawab.equalsIgnoreCase("Y"));
   
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
        System.out.println("         TOKO KAPTENTEKNOLOGI.COM          ");
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

    }
}