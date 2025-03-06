public class mataKuliahMain_01 {
    public static void main(String[] args) {
        mataKuliah_01 mk1 = new mataKuliah_01("PJ2134", "Pemrograman java", 2);
        Dosen_01 [] dsnPengampu = new Dosen_01[3];
        dsnPengampu [0] = new Dosen_01("123", "Arya", 2018, "S2", "Informatika");
        dsnPengampu [1] = new Dosen_01("234", "Shinta", 2020, "S2", "PPkn");
        dsnPengampu [2] = new Dosen_01("345", "Yono", 2015, "S2", "Agama");

        for (Dosen_01 dosen : dsnPengampu){
            mk1.tambahDosen(dosen);
        }
        
        System.out.println("=================================");
        System.out.println("Sebelum Perubahan SKS");
        System.out.println("=================================");
        mk1.tampilkanInfo();

        System.out.println("Mengubah jumlah SKS menjadi 4...");
        mk1.ubahSKS(4);

        System.out.println("=================================");
        System.out.println("Setelah Perubahan SKS");
        System.out.println("=================================");
        mk1.tampilkanInfo();
    }

}
