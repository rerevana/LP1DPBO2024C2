/*
    Saya Revana Faliha Salma NIM 2202869 mengerjakan Soal Latihan 1 dalam
    mata kuliah DPBO untuk keberkahanNya maka saya
    tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

// kelas yang merepresentasikan anggota DPR
public class DPR{
    private String id;          // atribut untuk menyimpan ID anggota DPR
    private String nama;        // atribut untuk menyimpan nama anggota DPR
    private String namaBidang;  // atribut untuk menyimpan nama bidang kerja anggota DPR
    private String namaPartai;  // atribut untuk menyimpan nama partai politik anggota DPR

    // konstruktor default untuk inisialisasi atribut
    public DPR(){
        this.id = "";
        this.nama = "";
        this.namaBidang = "";
        this.namaPartai = "";
    }

    // konstruktor dengan parameter untuk menginisialisasi atribut dengan nilai yang diberikan
    public DPR(String id, String nama, String namaBidang, String namaPartai){
        this.id = id;
        this.nama = nama;
        this.namaBidang = namaBidang;
        this.namaPartai = namaPartai;
    }

    // getter untuk mendapatkan nilai atribut id
    public String getId(){
        return this.id;
    }

    // setter untuk mengubah nilai atribut id
    public void setId(String id){
        this.id = id;
    }

    // getter untuk mendapatkan nilai atribut nama
    public String getNama(){
        return this.nama;
    }

    // setter untuk mengubah nilai atribut nama
    public void setNama(String nama){
        this.nama = nama;
    }

    // getter untuk mendapatkan nilai atribut namaBidang
    public String getNamaBidang(){
        return this.namaBidang;
    }

    // setter untuk mengubah nilai atribut namaBidang
    public void setNamaBidang(String namaBidang){
        this.namaBidang = namaBidang;
    }

    // getter untuk mendapatkan nilai atribut namaPartai
    public String getNamaPartai(){
        return this.namaPartai;
    }

    // setter untuk mengubah nilai atribut namaPartai
    public void setNamaPartai(String namaPartai){
        this.namaPartai = namaPartai;
    }
}
