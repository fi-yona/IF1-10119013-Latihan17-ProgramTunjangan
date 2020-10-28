/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */


/* Program ini adalah tentang cara mencari total gaji jika ditambahkan dengan
tunjangan setelah menikah.
*/


package if1.pkg10119013.latihan17.programtunjangan;

import java.util.Scanner;
/**
 *
 * @author Fiona Avila
 */


public class ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    double persenTunjangan = 0.35, gajiPokok;
    String menikah;
    
    public void dataKaryawan(){
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Gaji pokok anda dalam sebulan\t: Rp " );
        Scanner scan1 = new Scanner(System.in);
        gajiPokok = scan1.nextDouble();
        System.out.print("Status Menikah (ya/tidak)\t: ");
        Scanner scan2 = new Scanner(System.in);
        menikah = scan2.next();
    }
    
    public double hitungTunjangan(){
        double tunjanganMenikah;
        tunjanganMenikah = (menikah.equals("ya")?gajiPokok*persenTunjangan:0);
        return tunjanganMenikah;
    }
    
    public void hasilHitungGaji(double tunjanganMenikah){
        System.out.println();
        System.out.println("======Hasil Perhitungan Gaji Anda======");
        System.out.println("Gaji Pokok\t\t: Rp " + gajiPokok);
        System.out.println("Tunjangan\t\t: Rp " + tunjanganMenikah);
        System.out.println("Total gaji\t\t: Rp " + (gajiPokok+ tunjanganMenikah));
    }
    
    public static void main(String[] args) {  
       ProgramTunjangan karyawan = new ProgramTunjangan();
       karyawan.dataKaryawan();
       karyawan.hasilHitungGaji(karyawan.hitungTunjangan());
    }

}