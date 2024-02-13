/*
    Saya Revana Faliha Salma NIM 2202869 mengerjakan Soal Latihan 1 dalam
    mata kuliah DPBO untuk keberkahanNya maka saya
    tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){

        // inisialisasi ArrayList untuk menyimpan anggota DPR
        ArrayList<DPR> list = new ArrayList<>();

        // membuat objek Scanner untuk menerima input dari pengguna
        Scanner sc = new Scanner(System.in);
        int pilih; // variabel untuk menyimpan pilihan pengguna

        // perulangan do-while untuk menampilkan menu dan menerima input pengguna
        do {
            // menampilkan menu aksi yang dapat dilakukan
            System.out.println("\nSILAHKAN PILIH SALAH SATU");
            System.out.println("0. EXIT");
            System.out.println("1. ADD");
            System.out.println("2. CHANGE");
            System.out.println("3. DELETE");
            System.out.println("4. VIEW");

            // menerima input pilihan dari pengguna
            pilih = sc.nextInt();

            // melakukan aksi sesuai dengan pilihan pengguna
            switch (pilih) {
                case 1:
                    // menambahkan anggota DPR baru
                    System.out.print("ID: ");
                    String id = sc.next();
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    System.out.print("Nama Bidang: ");
                    String namaBidang = sc.next();
                    System.out.print("Nama Partai: ");
                    String namaPartai = sc.next();

                    list.add(new DPR(id, nama, namaBidang, namaPartai));
                    System.out.println("Data berhasil ditambahkan.");
                    break;

                case 2:
                    // mengubah data anggota DPR
                    System.out.print("Masukkan ID anggota DPR yang ingin diubah: ");
                    String idToChange = sc.next();

                    // melakukan iterasi untuk mencari anggota DPR yang ingin diubah
                    for (DPR anggota : list) {
                        if (anggota.getId().equals(idToChange)) {
                            System.out.print("Nama: ");
                            anggota.setNama(sc.next());
                            System.out.print("Nama Bidang: ");
                            anggota.setNamaBidang(sc.next());
                            System.out.print("Nama Partai: ");
                            anggota.setNamaPartai(sc.next());
                            System.out.println("Data berhasil diubah.");
                            break;
                        }
                    }
                    break;

                case 3:
                    // menghapus anggota DPR
                    System.out.print("Masukkan ID anggota DPR yang ingin dihapus: ");
                    String idToDelete = sc.next();

                    // melakukan iterasi untuk mencari anggota DPR yang ingin dihapus
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getId().equals(idToDelete)) {
                            list.remove(i);
                            System.out.println("Data berhasil dihapus.");
                            break;
                        }
                    }
                    break;

                case 4:
                    // menampilkan data terbaru anggota DPR
                    System.out.println("\nData Terbaru Anggota DPR:");
                    System.out.println("+----+----------------------+----------------+---------------+----------------+");
                    System.out.println("| No |    ID Anggota DPR    |      Nama      |    Bidang     |     Partai     |");
                    System.out.println("+----+----------------------+----------------+---------------+----------------+");

                    // melakukan iterasi untuk menampilkan setiap anggota DPR dalam list
                    int i = 1;
                    for (DPR anggota : list) {
                        System.out.printf("| %2d | %20s | %14s | %13s | %14s |\n", i++, anggota.getId(), anggota.getNama(), anggota.getNamaBidang(), anggota.getNamaPartai());
                        System.out.println("+----+----------------------+----------------+---------------+----------------+");
                    }
                    break;

                case 0:
                    // keluar dari program
                    System.out.println("Terima kasih!");
                    break;

                default:
                    // menampilkan pesan jika pilihan tidak valid
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilih != 0);

        // menutup objek Scanner setelah pengguna selesai menggunakan program
        sc.close();
    }
}
