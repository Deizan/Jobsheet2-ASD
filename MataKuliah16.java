public class MataKuliah16 {
    
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;
    
    MataKuliah16() {
    }
    
    MataKuliah16(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    
    void tampilInformasi() {
        System.out.println("Kode MK : " + kodeMK);
        System.out.println("Nama : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }
    
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS mata kuliah " + nama + " berhasil diubah menjadi: " + sks);
    }
    
    void tambahJam(int jam) {
        jumlahJam = jumlahJam + jam;
        System.out.println("Jumlah jam mata kuliah " + nama + " bertambah menjadi: " + jumlahJam);
    }
    
    void kurangiJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan jam tidak dapat dilakukan karena jumlah jam tidak mencukupi");
        } else {
            jumlahJam = jumlahJam - jam;
            System.out.println("Jumlah jam mata kuliah " + nama + " berkurang menjadi: " + jumlahJam);
        }
    }
}
