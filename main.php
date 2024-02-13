<!-- Saya Revana Faliha Salma NIM 2202869 mengerjakan Soal Latihan 1 dalam mata kuliah DPBO 
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. -->

<?php

// Impor kelas DPR
require_once 'DPR.php';

// Membuat array untuk menyimpan data anggota DPR
$list = array();

// Menambahkan data anggota DPR ke dalam array
$list[] = new DPR("ID001", "John Doe", "Bidang A", "Partai X", "john-doe.jpg");
$list[] = new DPR("ID002", "Jane Smith", "Bidang B", "Partai Y", "jane-smith.jpg");

// Membuat tabel HTML untuk menampilkan data anggota DPR
echo "<table border='1'>";
echo "<tr>
        <th>No</th>
        <th>ID Anggota DPR</th>
        <th>Nama</th>
        <th>Bidang</th>
        <th>Partai</th>
        <th>Foto Profil</th> <!-- tambahan fitur foto profil -->
      </tr>";

// Menampilkan data anggota DPR
$i = 1;
foreach ($list as $anggota) {
    echo "<tr>";
    echo "<td>$i</td>";
    echo "<td>" . $anggota->getId() . "</td>";
    echo "<td>" . $anggota->getNama() . "</td>";
    echo "<td>" . $anggota->getNamaBidang() . "</td>";
    echo "<td>" . $anggota->getNamaPartai() . "</td>";
    echo "<td><img src='" . $anggota->getFotoProfil() . "' alt='Foto Profil'></td>"; // tambahan fitur foto profil
    echo "</tr>";
    $i++;
}

echo "</table>";

?>
