import javax.swing.JOptionPane;
public class joptionp{
 public static void main(String[] args) {
   String namaPegawai, golongan;
   Double jmlJam, upahPegawai;
   
   namaPegawai = JOptionPane.showInputDialog("Nama Pegawai");
   jmlJam = Double.parseDouble(JOptionPane.showInputDialog("Jumlah Jam Kerja"));
   golongan = JOptionPane.showInputDialog("Golongan");

    if (golongan.equalsIgnoreCase("A")) {
    upahPegawai = jmlJam * 5000;
    }else if (golongan.equalsIgnoreCase("B")) {
    upahPegawai = jmlJam * 4500;
    }else if (golongan.equalsIgnoreCase("C")) {
    upahPegawai = jmlJam * 4000;
    } else if (golongan.equalsIgnoreCase("D")) {
    upahPegawai = jmlJam * 3500;
    } else {
    upahPegawai = jmlJam * 0;
    }
    JOptionPane.showMessageDialog(null, "Daftar Upah Kerja \n Nama Pegawai : " + namaPegawai + "\n Jumlah Jam Kerja : "
    + jmlJam +"\n Golongan : " + golongan +"\n Total Upah Kerja : " + upahPegawai);

  }
}