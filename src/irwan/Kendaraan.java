package irwan;

// class Kendaraan
public class Kendaraan {
    // Atribut dengan Encapsulation
    private String idKendaraan;
    private String namaKendaraan;

    // Constructor
    public Kendaraan(String idKendaraan, String namaKendaraan) {
        this.idKendaraan = idKendaraan;
        this.namaKendaraan = namaKendaraan;
    }

    // Mutator
    public void setIdKendaraan(String idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    // Accessor
    public String getIdKendaraan() {
        return idKendaraan;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    // Method kendaraanInfo()
    public String kendaraanInfo() {
        return "Id Kendaraan\t: " + getIdKendaraan() +
               "\nNama Kendaraan\t: " + getNamaKendaraan();
    }

    // Polymorphism Overloading
    public String kendaraanInfo(String jenisBahanBakar) {
        return kendaraanInfo() + 
               "\nJenis Bahan Bakar: " + jenisBahanBakar;
    }
}

