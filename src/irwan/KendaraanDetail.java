package irwan;

// Inheritance KendaraanDetail
public class KendaraanDetail extends Kendaraan {

    // Constructor
    public KendaraanDetail(String idKendaraan, String namaKendaraan) {
        super(idKendaraan, namaKendaraan);
    }

    // Method Getter untuk mengembalikan jenis kendaraan 
    public String getJenis() {
        String kodeJenis = getIdKendaraan().substring(0, 2);
        // Seleksi if else
        if(kodeJenis.equals("MO")) {     
            return "Motor";
        }else if(kodeJenis.equals("MB")) {
            return "Mobil";
        }else if(kodeJenis.equals("TR")) {
            return "Truk";
        }else if(kodeJenis.equals("BU")) {
            return "Bus";
        }else {
            return "Jenis Kendaraan Lain";
        }
    }

    // Method Getter untuk mengembalikan tahun produksi kendaraan
    public int getTahunProduksi() {
        return Integer.parseInt(getIdKendaraan().substring(2, 6));
    }

    // Method Getter untuk mengemabalikan warna kendaraan
    public String getWarna() {
        String kodeWarna = getIdKendaraan().substring(6, 8);
        // Seleksi switch
        switch(kodeWarna) {
            case "RD":
                return "Merah";
            case "BL":
                return "Biru";
            case "BK":
                return "Hitam";
            case "WT":
                return "Putih";
            default:
                return "Warna Lain";           
        }
    }

    // Polymorphism Overriding
    @Override
    public String kendaraanInfo() {
        return super.kendaraanInfo() +
               "\nJenis Kendaraan\t: " + getJenis() +
               "\nTahun Produksi\t: " + getTahunProduksi() +
               "\nWarna Kendaraan\t: " + getWarna();
    }
}

