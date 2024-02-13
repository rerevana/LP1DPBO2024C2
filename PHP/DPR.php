<!-- Saya Revana Faliha Salma NIM 2202869 mengerjakan Soal Latihan 1 dalam mata kuliah DPBO 
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. -->

<?php

// mendefinisikan kelas DPR untuk merepresentasikan anggota DPR
class DPR{
    // properti privat untuk menyimpan informasi anggota DPR
    private $id = ''; // ID anggota DPR
    private $nama = ''; // nama anggota DPR
    private $namaBidang = ''; // bidang keahlian anggota DPR
    private $namaPartai = ''; // partai politik anggota DPR
    private $fotoProfil = ''; // nama file foto profil anggota DPR

    // konstruktor untuk inisialisasi objek DPR
    public function __construct($id = '', $nama = '', $namaBidang = '', $namaPartai = '', $fotoProfil = ''){
        $this->id = $id;
        $this->nama = $nama;
        $this->namaBidang = $namaBidang;
        $this->namaPartai = $namaPartai;
        $this->fotoProfil = $fotoProfil;
    }

    // metode untuk mengatur ID anggota DPR
    public function setId($id){
        $this->id = $id;
    }

    // metode untuk mendapatkan ID anggota DPR
    public function getId(){
        return $this->id;
    }

    // metode untuk mengatur nama anggota DPR
    public function setNama($nama){
        $this->nama = $nama;
    }

    // metode untuk mendapatkan nama anggota DPR
    public function getNama(){
        return $this->nama;
    }

    // metode untuk mengatur nama bidang keahlian anggota DPR
    public function setNamaBidang($namaBidang){
        $this->namaBidang = $namaBidang;
    }

    // metode untuk mendapatkan nama bidang keahlian anggota DPR
    public function getNamaBidang(){
        return $this->namaBidang;
    }

    // metode untuk mengatur nama partai politik anggota DPR
    public function setNamaPartai($namaPartai){
        $this->namaPartai = $namaPartai;
    }

    // metode untuk mendapatkan nama partai politik anggota DPR
    public function getNamaPartai(){
        return $this->namaPartai;
    }

    // metode untuk mendapatkan nama file foto profil anggota DPR
    public function getFotoProfil() {
        return $this->fotoProfil;
    }
}

?>
