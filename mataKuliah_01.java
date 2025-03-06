public class mataKuliah_01 {
    public String kodeMk;
    public String namaMk;
    public int sks;
    public Dosen_01 [] dosenpengampu;
    public int jumlahDosen;

    public mataKuliah_01 (String kodeMk,String namaMk,int sks){
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.sks = sks;
        this.dosenpengampu = new Dosen_01[3];
        this.jumlahDosen = 0;
    }
    public void tampilkanInfo(){
        System.out.println("Kode Mk: " + kodeMk);
        System.out.println("Nama Mk: " + namaMk);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Dosen Pengampu: ");
        if (jumlahDosen == 0) {
            System.out.println("Tidak Ada dosen yang mengampu.");
        }else {
            for (int i = 0; i < jumlahDosen; i++) {
                System.out.println("+ " + dosenpengampu[i]);
            }
        }
    }
    public void ubahnamaMk(String namamkBaru){
        this.namaMk = namamkBaru;
        System.out.println("Mata Kuliah berhasil menjadi: " + namaMk);
    }
    public void ubahSKS(int sksbaru){
        if (sksbaru >= 2 ) {
            this.sks = sksbaru;
            System.out.println("Jumlah SKS berhasil diubah menjadi: " + sks);
        }else {
            System.out.println("Tidak dapat mengubah SKS. SKS minimal adalah 2!");
        }
    }
    public void tambahDosen( Dosen_01 dosen){
        if (jumlahDosen < dosenpengampu.length) {
            dosenpengampu[jumlahDosen] = dosen;
            jumlahDosen++;
            System.out.println("Dosen " + dosen + " Berhasil ditambahkan sebagai pengampu");
        }else {
            System.out.println("gagal menambahkan dose!");
        }
    }
}
