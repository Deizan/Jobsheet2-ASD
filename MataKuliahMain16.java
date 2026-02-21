public class MataKuliahMain16 {
    public static void main(String[] args) {
        
        System.out.println("===== Objek 1 dengan Konstruktor Default =====");
        MataKuliah16 mk1 = new MataKuliah16();
        mk1.kodeMK = "DDP1";
        mk1.nama = "Dasar-Dasar Pemrograman";
        mk1.sks = 3;
        mk1.jumlahJam = 4;
        
        mk1.tampilInformasi();
        System.out.println();
        
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        System.out.println();
        
        mk1.tampilInformasi();
        System.out.println();
        
        System.out.println("===== Objek 2 dengan Konstruktor Berparameter =====");
        MataKuliah16 mk2 = new MataKuliah16("ALSD1", "Algoritma dan Struktur Data", 3, 3);
        
        mk2.tampilInformasi();
        System.out.println();
        
        mk2.ubahSKS(4);
        mk2.tambahJam(3);
        mk2.kurangiJam(5);
        System.out.println();
        
        mk2.tampilInformasi();
        System.out.println();
        
        System.out.println("===== Objek 3 dengan Konstruktor Berparameter =====");
        MataKuliah16 mk3 = new MataKuliah16("BDD1", "Basis Data", 4, 5);
        
        mk3.tampilInformasi();
        System.out.println();
        
        mk3.kurangiJam(2);
        mk3.kurangiJam(4);
        System.out.println();
        
        mk3.tambahJam(6);
        mk3.tampilInformasi();
    }
}