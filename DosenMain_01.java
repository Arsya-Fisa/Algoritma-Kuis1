public class DosenMain_01 {
    public static void main(String[] args) {
        Dosen_01 dosen01 = new Dosen_01("244107060121", "Dr. Zakaria", 2021, "S2", "Sistem Informasi");
        dosen01.tampilkanInfo();
        dosen01.prodi = "Teknik Informatika";
        System.out.println("Program Studi Dosen diubah menjadi: " + dosen01.prodi);

        dosen01.jenjangPendidikan = "S3";
        System.out.println("Jenjang Pendidikan dosen diubah menjadi: "+ dosen01.jenjangPendidikan);

        dosen01.tampilkanInfo();
    }
}
