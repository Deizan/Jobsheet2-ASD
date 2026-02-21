public class Mahasiswa16 {

    String nim;
    String nm;
    String kelas;
    double ipk;
    
    Mahasiswa16() {
    }
    
    Mahasiswa16(String nm, String nim, double ipk, String kelas) {
        this.nm = nm;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    
    void tampilkanInformasi() {
        System.out.println("Nama: " + nm);
        System.out.println("Nim: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }
    
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
        System.out.println("Kelas mahasiswa " + nm + " berhasil diubah menjadi: " + kelas);
    }
    
    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
            System.out.println("IPK mahasiswa " + nm + " berhasil diubah menjadi: " + ipk);
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }
    
    String nilaiKinerja(double ipk) {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}