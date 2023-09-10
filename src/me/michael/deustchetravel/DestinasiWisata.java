package me.michael.deustchetravel;

import java.util.ArrayList;

public class DestinasiWisata {
    public String Nama_Destinasi_Wisata, Kabupaten, Provinsi, Nama_Pengelola, Deskripsi, Jenis_Pariwisata;
    public float Harga_Tiket_Masuk;
    public Integer Jumlah_Pengunjung, Kapasitas_Pengunjung;
    ArrayList<Pelanggan> Pelanggan_Yang_Berkunjung;

    public void DestinasiWisata(
        String Nama,
        String Kab,
        String Prov,
        String Management,
        String Deskripsi,
        String Tipe,
        float Harga_Tiket_Masuk,
        Integer nPengunjung,
        Integer nMaxPengunjung
    )
    {
        this.Nama_Destinasi_Wisata = Nama;
        this.Kabupaten = Kab;
        this.Provinsi = Prov;
        this.Nama_Pengelola = Management;
        this.Deskripsi = Deskripsi;
        this.Jenis_Pariwisata = Tipe;
        this.Harga_Tiket_Masuk = Harga_Tiket_Masuk;
        this.Kapasitas_Pengunjung = nMaxPengunjung;

        if(this.Jumlah_Pengunjung < this.Kapasitas_Pengunjung)
            this.Jumlah_Pengunjung = nPengunjung;
    }

    public void TambahPelangganSebagaiPengunjung(Pelanggan PelangganBerkunjung)
    {
        this.Pelanggan_Yang_Berkunjung.add(PelangganBerkunjung);

        if(this.Jumlah_Pengunjung < this.Kapasitas_Pengunjung){
            this.Jumlah_Pengunjung++;
        }
    }

    public void TambahJumlahPengunjungLain(int Delta){
        if(this.Jumlah_Pengunjung < this.Kapasitas_Pengunjung){
            this.Jumlah_Pengunjung += Delta;
        }
    }

    public void PelangganSebagaiPengunjungKeluar(Pelanggan YangKeluar)
    {
        this.Pelanggan_Yang_Berkunjung.remove(YangKeluar);

        if(this.Jumlah_Pengunjung > 0)
        {
            this.Jumlah_Pengunjung--;
        }
    }

    public void BerkurangJumlahPengunjung(int Delta){
        if(this.Jumlah_Pengunjung > 0)
        {
            this.Jumlah_Pengunjung -= Delta;
        }
    }

    public void DestinasiTutup()
    {
        this.Pelanggan_Yang_Berkunjung.clear();
        this.Jumlah_Pengunjung = 0;
    }
}
