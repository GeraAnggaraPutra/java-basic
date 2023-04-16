public class contoh7{
    public static void main(String args[]){
        String sekolah = "SD";
        switch (sekolah){
            case "SD":
            System.out.println("SAYA LULUSAN SDN CANGKUANG 05 TAHUN 2017");;
            break;
            case "SMP":
            System.out.println("SAYA LULUSAN SMP PLUS AL AMANAH TAHUN 2020");
            break;
            default:
            System.out.println("SAYA TIDAK SEKOLAH");
        }

        int nomor_absen = 100;
        switch (nomor_absen){
            case 1:
            System.out.println("1. Adam kusuma");
            break;
            case 2:
            System.out.println("2. Anggara");
            break;
            case 3:
            System.out.println("3. Putra");
            break;
            default:
            System.out.println("Mohon maaf anda salah kelas");
        }
    }
}