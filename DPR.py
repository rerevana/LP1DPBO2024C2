# Saya Revana Faliha Salma NIM 2202869 mengerjakan Soal Latihan 1 dalam
# mata kuliah DPBO untuk keberkahanNya maka saya
# tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

class DPR:
    # mendefinisikan atribut privat untuk menyimpan ID, nama, bidang, dan partai anggota DPR
    __id = ""
    __nama = ""
    __namaBidang = ""
    __namaPartai = ""

    # konstruktor untuk inisialisasi objek DPR dengan nilai default untuk setiap atribut
    def __init__(self, id = "", nama = "", namaBidang = "", namaPartai = ""):
        self.__id = id
        self.__nama = nama
        self.__namaBidang = namaBidang
        self.__namaPartai = namaPartai

    # metode getter untuk mendapatkan nilai ID
    def get_id(self):
        return self.__id
    
    # metode setter untuk mengubah nilai ID
    def set_id(self, id):
        self.__id = id

    # metode getter untuk mendapatkan nilai nama
    def get_nama(self):
        return self.__nama
    
    # metode setter untuk mengubah nilai nama
    def set_nama(self, nama):
        self.__nama = nama

    # metode getter untuk mendapatkan nilai bidang
    def get_namaBidang(self):
        return self.__namaBidang

    # metode setter untuk mengubah nilai bidang
    def set_namaBidang(self, namaBidang):
        self.__namaBidang = namaBidang

    # metode getter untuk mendapatkan nilai partai
    def get_namaPartai(self):
        return self.__namaPartai
    
    # metode setter untuk mengubah nilai partai
    def set_namaPartai(self, namaPartai):
        self.__namaPartai = namaPartai
