package pbo;

import java.util.Scanner;

public class CekresiBeraksi {
    public static void main(String[] args) {
        //objek
        //CekResi resi1 = new CekResi("amin","18010101");
        
        //System.out.println(resi1.displayInfo());
        //System.out.println(resi1.displayInfo("Jnt"));
        
        //error handling
        try{
            //I/O sederhana
            Scanner scanner = new Scanner(System.in);
        
            //array 
            CekresiDetail[] resi1 = new CekresiDetail[2]; 
        
            //perulangan
            for(int i=0; i<resi1.length; i++){
                System.out.print("Masukkan Nama Anda "+(i+1)+": ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Kode Resi Anda "+(i+1)+": ");
                String resi = scanner.nextLine();
        
                //objek
                resi1[i] = new CekresiDetail(nama, resi);
            }
        
            //perulangan
            for(CekresiDetail data: resi1){
                System.out.println();
                System.out.println("|===================|");
                System.out.println("|   Data CEK RESI   |");
                System.out.println("|===================|");
                System.out.println(data.displayInfo());
            }
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan format nomor resi : "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan Umum : "+e.getMessage());
        }
    }
    
}
