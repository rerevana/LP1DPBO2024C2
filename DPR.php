<!-- Saya Revana Faliha Salma NIM 2202869 mengerjakan Soal Latihan 1 dalam mata kuliah DPBO 
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. -->

<?php

class DPR{
    private $id = '';
    private $nama = '';
    private $namaBidang = '';
    private $namaPartai = '';
    private $fotoProfil = '';

    public function __construct($id = '', $nama = '', $namaBidang = '', $namaPartai = '', $fotoProfil = ''){
        $this->id = $id;
        $this->nama = $nama;
        $this->namaBidang = $namaBidang;
        $this->namaPartai = $namaPartai;
        $this->fotoProfil = $fotoProfil;
    }

    public function setId($id){
        $this->id = $id;
    }

    public function getId(){
        return $this->id;
    }

    public function setNama($nama){
        $this->nama = $nama;
    }

    public function getNama(){
        return $this->nama;
    }

    public function setNamaBidang($namaBidang){
        $this->namaBidang = $namaBidang;
    }

    public function getNamaBidang(){
        return $this->namaBidang;
    }

    public function setNamaPartai($namaPartai){
        $this->namaPartai = $namaPartai;
    }

    public function getNamaPartai(){
        return $this->namaPartai;
    }

    public function getFotoProfil() {
        return $this->fotoProfil;
    }
}

?>