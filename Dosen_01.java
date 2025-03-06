public class Dosen_01 {

    public String nidn;
    public String nama;
    public int tahunmasuk;
    public String jenjangPendidikan;
    public String prodi;

    public Dosen_01 (String nidn, String nama, int tahunmasuk, String jenjangPendidikan, String prodi){
        this.nidn = nidn;
        this.nama = nama;
        this.tahunmasuk =  tahunmasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    }
    public String toString() {
        return "NIDN: " + nidn + ", Nama: " + nama + ", Prodi: " + prodi + ", Pendidikan: " + jenjangPendidikan;
    }
    public void tampilkanInfo(){
        System.out.println("NIDN: " + nidn);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunmasuk);
        System.out.println("Jenjang Pendidikan: " + jenjangPendidikan);
        System.out.println("Program Studi: " + prodi);
    }
    public void ubahProdi(String prodiBaru){
        this.prodi = prodiBaru;
        System.out.println("Program Studi berhasil diubah menjadi: " + prodiBaru);
    }
    public void ubahPendidikan(String pendoidikanBaru){
        this.jenjangPendidikan = pendoidikanBaru;
        System.out.println("jenejang Pendidikan berhasi diubah menjadi: " + pendoidikanBaru);
    }

}