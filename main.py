# Saya Revana Faliha Salma NIM 2202869 mengerjakan Soal Latihan 1 dalam
# mata kuliah DPBO untuk keberkahanNya maka saya
# tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# import kelas DPR dari file DPR.py
from DPR import DPR

# inisialisasi list untuk menyimpan anggota DPR
anggotaDPR = []

while True:
    # menampilkan aksi-aksi yang dapat dilakukan
    print("\nSILAHKAN PILIH SALAH SATU")
    print("0. EXIT")
    print("1. ADD")
    print("2. CHANGE")
    print("3. DELETE")
    print("4. VIEW")

    # input aksi yang dipilih
    pilih = int(input("Pilih aksi: "))

    if pilih == 1:
        # jika aksi yang dipilih adalah 1, tambahkan anggota DPR baru
        id = input("ID: ")
        nama = input("Nama: ")
        namaBidang = input("Nama Bidang: ")
        namaPartai = input("Nama Partai: ")

        # menambahkan anggota DPR baru ke list
        anggotaDPR.append(DPR(id, nama, namaBidang, namaPartai))
        print("Data berhasil ditambahkan.")

    elif pilih == 2:
        # jika aksi yang dipilih adalah 2, ubah data anggota DPR
        id = input("Masukkan ID anggota DPR yang ingin diubah: ")

        # looping melalui setiap anggota DPR dalam list
        for anggota in anggotaDPR:
            # jika ID anggota DPR cocok dengan ID yang dimasukkan pengguna
            if anggota.get_id() == id:
                nama = input("Nama: ")
                namaBidang = input("Nama Bidang: ")
                namaPartai = input("Nama Partai: ")

                # mengubah data anggota DPR yang sesuai
                anggota.set_nama(nama)
                anggota.set_namaBidang(namaBidang)
                anggota.set_namaPartai(namaPartai)
                print("Data berhasil diubah.")
                break

    elif pilih == 3:
        # jika aksi yang dipilih adalah 3, hapus data anggota DPR
        id = input("Masukkan ID anggota DPR yang ingin dihapus: ")

        # looping melalui setiap anggota DPR dalam list
        for anggota in anggotaDPR:
            # jika ID anggota DPR cocok dengan ID yang dimasukkan pengguna
            if anggota.get_id() == id:
                anggotaDPR.remove(anggota)
                print("Data berhasil dihapus.")
                break

    elif pilih == 4:
        # jika aksi yang dipilih adalah 4, tampilkan data anggota DPR
        print("\nData Terbaru Anggota DPR:")
        print("+----+----------------------+----------------+---------------+----------------+")
        print("| No |    ID Anggota DPR    |      Nama      |    Bidang     |     Partai     |")
        print("+----+----------------------+----------------+---------------+----------------+")

        # looping melalui setiap anggota DPR dalam list
        for i, anggota in enumerate(anggotaDPR, start=1):
            print("| {:2} | {:20} | {:14} | {:13} | {:14} |".format(i, anggota.get_id(), anggota.get_nama(), anggota.get_namaBidang(), anggota.get_namaPartai()))
            print("+----+----------------------+----------------+---------------+----------------+")

    elif pilih == 0:
        # jika aksi yang dipilih adalah 0, keluar dari program
        print("Terima kasih!")
        break

    else:
        # jika aksi yang dipilih tidak valid
        print("Pilihan tidak valid. Silakan coba lagi.")
