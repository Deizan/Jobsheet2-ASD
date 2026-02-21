Pertanyaan 2.1.3
1. Atribut : Data atau state yang dimiliki oleh object. Merepresentasikan karakteristik atau sifat dari object tersebut. Contoh: nim, nama, ipk, kelas.

Method : Fungsi atau perilaku yang dapat dilakukan oleh object. Merepresentasikan aksi atau tindakan yang dapat dilakukan object.
Contoh: tampilkanInformasi(), updateIpk().
2. Jumlah: 4 atribut

Atributnya:
nim : String
nm : String
kelas : String
ipk : double
3. Jumlah: 4 method

Methodnya:
tampilkanInformasi() : void
ubahKelas(String kelasBaru) : void
updateIpk(double ipkBaru) : void
nilaiKinerja(double ipk) : String
4. Done
5. Method nilaiKinerja() bekerja dengan menggunakan struktur kondisional if-else if-else untuk membandingkan nilai IPK dengan kriteria yang telah ditentukan.
6. Done

Pertanyaan 2.2.3
1. Nama object yang dihasilkan:
mhs1 (object dari class Mahasiswa16)
mhs2 (object dari class Mahasiswa16)
mhs3 (object dari class Mahasiswa16)
2. Menggunakan notation dot (.) dengan format:
Untuk Atribut:
namaObject.namaAtribut;
3. Output berbeda karena ada perubahan pada atribut object mhs1 di antara kedua pemanggilan method

Pertanyaan 2.3.3
1. Mahasiswa16(String nm, String nim, double ipk, String kelas) {
    this.nm = nm;
    this.nim = nim;
    this.ipk = ipk;
    this.kelas = kelas;
}
2. Baris tersebut melakukan instansiasi object (pembuatan object) dari class Mahasiswa16
3. Compile error: Java compiler menemukan ketidaksesuaian antara deklarasi dan penggunaan, sehingga program tidak dapat dikompilasi.
4. Tidak, method di dalam class Mahasiswa tidak harus diakses secara berurutan. Method dapat diakses dalam urutan apa pun sesuai kebutuhan program.
5. Done
6. Done

