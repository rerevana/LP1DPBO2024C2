/*
    Saya Revana Faliha Salma NIM 2202869 mengerjakan Soal Latihan 1 dalam
    mata kuliah DPBO untuk keberkahanNya maka saya
    tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

#include <bits/stdc++.h>
#include <iomanip>
#include "DPR.cpp"

using namespace std;

int main() {

    // string id, nama, namaBidang, namaPartai;

    // deklarasi list objek kelas DPR
    list<DPR> llist;

    // deklarasi integer untuk menyimpan pilihan aksi
    int pilih;  
    do {
        // menampilkan aksi-aksi yang dapat dilakukan
        cout << endl << "SILAHKAN PILIH SALAH SATU" << endl;
        cout << "0. EXIT" << endl;
        cout << "1. ADD" << endl;
        cout << "2. CHANGE" << endl;
        cout << "3. DELETE" << endl;
        cout << "4. VIEW" << endl;

        // input aksi yang dipilih
        cin >> pilih;

        // inisialisasi untuk flag selesai memilih aksi
        int find = 0;   

        // inisialisasi variabel untuk menandai apakah aksi yang dipilih ditemukan atau tidak
        list<DPR>::iterator it = llist.begin();

        // inisialisasi iterator untuk list DPR
       do {
            if (pilih == 1) {
                // jika aksi yang dipilih adalah 1

                // meminta pengguna untuk memasukkan data anggota DPR baru
                string id, nama, namaBidang, namaPartai;
                cout << "Masukkan data anggota DPR baru." << endl;
                cout << "ID : ";
                cin >> id;
                cout << "Nama : ";
                cin >> nama;
                cout << "Nama Bidang : ";
                cin >> namaBidang;
                cout << "Nama Partai : ";
                cin >> namaPartai;

                // menambahkan anggota DPR baru ke list
                llist.push_back(DPR(id, nama, namaBidang, namaPartai));

                cout << "Data berhasil ditambahkan." << "\n\n";
                find = 1;   // menandai bahwa aksi telah ditemukan

            } else if (pilih == 2) {
                // jika aksi yang dipilih adalah 2

                // meminta pengguna untuk memasukkan ID anggota DPR yang ingin diubah
                string id;
                cout << "Masukkan ID anggota DPR yang ingin diubah: ";
                cin >> id;

                // looping melalui setiap anggota DPR dalam list
                for (auto& anggota : llist) {
                    // jika ID anggota DPR cocok dengan ID yang dimasukkan pengguna
                    if (anggota.get_id() == id) {

                        // meminta pengguna untuk memasukkan data baru untuk anggota DPR
                        string nama, namaBidang, namaPartai;
                        cout << "Masukkan data baru." << endl;
                        cout << "Nama : ";
                        cin >> nama;
                        cout << "Nama Bidang : ";
                        cin >> namaBidang;
                        cout << "Nama Partai : ";
                        cin >> namaPartai;
                        
                        // mengubah data anggota DPR yang sesuai
                        anggota.set_nama(nama);
                        anggota.set_namaBidang(namaBidang);
                        anggota.set_namaPartai(namaPartai);
                        cout << "Data berhasil diubah." << "\n\n";
                        find = 1;
                    }
                }
            } else if (pilih == 3) {
                // jika aksi yang dipilih adalah 3

                // meminta pengguna untuk memasukkan ID anggota DPR yang ingin dihapus
                string id;
                cout << "Masukkan ID anggota DPR yang ingin dihapus: ";
                cin >> id;

                // looping melalui setiap anggota DPR dalam list menggunakan iterator
                for (auto it = llist.begin(); it != llist.end(); ) {
                    // jika ID anggota DPR cocok dengan ID yang dimasukkan pengguna, hapus anggota DPR tersebut dari list
                    if (it->get_id() == id) {
                        it = llist.erase(it);
                        cout << "Data berhasil dihapus." << "\n\n";
                        find = 1;   // tandai aksi jika sudah dipilih
                    } else {
                        // jika ID anggota DPR tidak cocok, pindah ke anggota DPR berikutnya dalam list
                        it++;
                    }
                }

            } else if (pilih == 0) {
                // jika aksi yang dipilih adalah 0

                cout << "Terima kasih!" << endl;
                return 0;

            }else if(pilih == 4){
                // jika aksi yang dipilih adalah 4

                // menampilkan data anggota DPR
                cout << '\n';
                cout << "Data Terbaru Anggota DPR:" << endl;
                cout << "+----+----------------------+----------------+---------------+----------------+" << endl;
                cout << "| No |    ID Anggota DPR    |      Nama      |    Bidang     |     Partai     |" << endl;
                cout << "+----+----------------------+----------------+---------------+----------------+" << endl;
                
                // looping melalui setiap anggota DPR dalam list menggunakan iterator
                int i = 1;
                for (list<DPR>::iterator it = llist.begin(); it != llist.end(); it++) {
                    cout << "| " << setw(2) << i++ << " | " << setw(20) << it->get_id() << " | " << setw(14) << it->get_nama() << " | " << setw(13) << it->get_namaBidang() << " | " << setw(14) << it->get_namaPartai() << " |" << endl;
                    cout << "+----+----------------------+----------------+---------------+----------------+" << endl;
                }
                find = 1;
            }
        }while (find == 0 && it != llist.end());    // looping jika aksi tidak ditemukan dan iterator belum mencapai akhir list
    } while (pilih != 0);   // looping program utama hingga pengguna memilih untuk keluar (aksi 0)

    return 0;
}