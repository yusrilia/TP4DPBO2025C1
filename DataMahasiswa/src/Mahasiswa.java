public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String status;

    public Mahasiswa(String nim, String nama, String jenisKelamin, String status) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.status = status;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setStatus(String status) { this.status = status; }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public String getStatus() { return this.status; }
}
