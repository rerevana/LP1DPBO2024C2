<!-- Saya Revana Faliha Salma NIM 2202869 mengerjakan Soal Latihan 1 dalam mata kuliah DPBO 
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. -->

<?php

// impor kelas DPR
require_once 'DPR.php';

// membuat array untuk menyimpan data anggota DPR
$list = array();

// menambahkan data anggota DPR ke dalam array
$list[] = new DPR("ID001", "Kim Taehyung", "Kemanusiaan", "Golkar", "tehyung.jpg");
$list[] = new DPR("ID002", "IU", "Kelautan", "PDIP", "iu.jpg");

// membuat tabel untuk menampilkan data anggota DPR
echo "<table border='1'>";
echo "<tr>
        <th>No</th>
        <th>ID Anggota DPR</th>
        <th>Nama</th>
        <th>Bidang</th>
        <th>Partai</th>
        <th>Foto Profil</th> <!-- tambahan fitur foto profil -->
      </tr>";

// menampilkan data anggota DPR
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
