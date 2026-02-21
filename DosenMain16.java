public class DosenMain16 {
    public static void main(String[] args) {
        
        System.out.println("===== Objek 1 dengan Konstruktor Default =====");
        Dosen16 dosen1 = new Dosen16();
        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Budi Santoso";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2015;
        dosen1.bidangKeahlian = "Pemrograman";
        
        dosen1.tampilInformasi();
        System.out.println();
        
        System.out.println("Masa kerja (tahun 2025): " + dosen1.hitungMasaKerja(2025) + " tahun");
        dosen1.ubahKeahlian("Artificial Intelligence");
        dosen1.setStatusAktif(false);
        System.out.println();
        
        System.out.println("===== Informasi Dosen 1 Setelah Perubahan =====");
        dosen1.tampilInformasi();
        System.out.println();
        
        System.out.println("===== Objek 2 dengan Konstruktor Berparameter =====");
        Dosen16 dosen2 = new Dosen16("D002", "Prof. Siti Nurhaliza", true, 2010, "Basis Data");
        
        dosen2.tampilInformasi();
        System.out.println();
        
        System.out.println("Masa kerja (tahun 2025): " + dosen2.hitungMasaKerja(2025) + " tahun");
        dosen2.ubahKeahlian("Data Science");
        dosen2.setStatusAktif(true);
        System.out.println();
        
        System.out.println("===== Informasi Dosen 2 Setelah Perubahan =====");
        dosen2.tampilInformasi();
        System.out.println();
        
        System.out.println("===== Objek 3 dengan Konstruktor Berparameter =====");
        Dosen16 dosen3 = new Dosen16("D003", "Dr. Ahmad Rizki", false, 2018, "Jaringan Komputer");
        
        dosen3.tampilInformasi();
        System.out.println();
        
        System.out.println("Masa kerja (tahun 2025): " + dosen3.hitungMasaKerja(2025) + " tahun");
        dosen3.setStatusAktif(true);
        dosen3.ubahKeahlian("Cloud Computing");
        System.out.println();
        
        System.out.println("===== Informasi Dosen 3 Setelah Perubahan =====");
        dosen3.tampilInformasi();
    }
}
