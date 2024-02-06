/*
    Saya Revana Faliha Salma NIM 2202869 mengerjakan Soal Latihan 1 dalam
    mata kuliah DPBO untuk keberkahanNya maka saya
    tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

#include <iostream>
#include <string>

using namespace std;

class DPR{
    // deklarasi kelas DPR
    private:
        string id;          // atribut ID anggota DPR
        string nama;        // atribut nama anggota DPR
        string namaBidang;  // atribut nama bidang anggota DPR
        string namaPartai;  // atribut nama partai anggota DPR

    public:
        // inisialisasi objek menggunakan nilai default
        DPR(){
            this->id = "";
            this->nama = "";
            this->namaBidang = "";
            this->namaPartai = "";
        }

        // inisialisasi objek dengan nilai sesuai parameter
        DPR(string id, string nama, string namaBidang, string namaPartai){
            this->id = id;
            this->nama = nama;
            this->namaBidang = namaBidang;
            this->namaPartai = namaPartai;
        }

        // untuk mendapatkan/mereturn atribut id
        string get_id(){
            return this->id;
        }

        // untuk mendapatkan/mereturn atribut nama
        string get_nama(){
            return this->nama;
        }

        // untuk mendapatkan/mereturn atribut nama bidang
        string get_namaBidang(){
            return this->namaBidang;
        }

        // untuk mendapatkan/mereturn atribut nama partai
        string get_namaPartai(){
            return this->namaPartai;
        }

        // untuk mengset/mengatur atribut id
        void set_id(string id){
            this->id = id;
        }

        // untuk mengset/mengatur atribut nama
        void set_nama(string nama){
            this->nama = nama;
        }

        // untuk mengset/mengatur atribut nama bidang
        void set_namaBidang(string namaBidang){
            this->namaBidang = namaBidang;
        }

        // untuk mengset/mengatur atribut nama partai
        void set_namaPartai(string namaPartai){
            this->namaPartai = namaPartai;
        }

        // destruktor
        ~DPR(){
            
        }
};