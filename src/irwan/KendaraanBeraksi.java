package irwan;

import java.util.Scanner;

// class KendaraanBeraksi
public class KendaraanBeraksi {
    public static void main(String[] args) {
        // Error Handling
        try {
            // IO 
            Scanner scanner = new Scanner(System.in);
            
            // Array
            KendaraanDetail[] kendaraan = new KendaraanDetail[2];
            
            // Perulangan
            for(int i = 0; i < kendaraan.length; i++) {
                System.out.print("Masukkan Id Kendaraan " + (i+1) + "\t\t: ");
                String idKendaraan = scanner.nextLine();
                System.out.print("Masukkan Nama Kendaraan " + (i+1) + "\t: ");
                String namaKendaraan = scanner.nextLine();
                System.out.println("");
                
                // Object
                kendaraan[i] = new KendaraanDetail(idKendaraan, namaKendaraan);
            }
            
            // Perulangan 
            for(int i = 0; i < kendaraan.length; i++) {
                System.out.println("================================");
                System.out.println("DATA KENDARAAN " + (i + 1));
                System.out.println("================================");
                System.out.println(kendaraan[i].kendaraanInfo() + "\n");
            }
            
        }catch (NumberFormatException e) {
            System.out.println("Kesalahan Format Nomor: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan Format Id Kendaraan: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan Umum: " + e.getMessage());
        }
    }
}
