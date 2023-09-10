package me.michael.deustchetravel;

import java.util.ArrayList;

public class Hotel {
    public String Nama_Hotel, Nama_Perusahaan_Hotel, Alamat_Hotel, Deskripsi_Hotel;
    public float Rating_Hotel, Harga_Perkamar;
    public Integer KapasitasTotal, JumlahTamu, JumlahKaryawanHotel;
    public ArrayList<Pelanggan> PenghuniHotel;

    public Hotel(
            String Nama,
            String NamaPerusahaan,
            String Alamat,
            String Deskripsi,
            float Rating,
            float BiayaKamar,
            Integer KapasitasTotal,
            Integer JumlahKaryawan
    ){
        this.Nama_Hotel = Nama;
        this.Nama_Perusahaan_Hotel = NamaPerusahaan;
        this.Alamat_Hotel = Alamat;
        this.Deskripsi_Hotel = Deskripsi;
        this.Rating_Hotel = Rating;
        this.Harga_Perkamar = BiayaKamar;
        this.KapasitasTotal = KapasitasTotal;
        this.JumlahTamu = 0;
        this.JumlahKaryawanHotel = JumlahKaryawan;

        this.PenghuniHotel = new ArrayList<Pelanggan>();
    }

    public void PelangganHotelCheckIn(Pelanggan PelangganMasuk)
    {
        if(this.JumlahTamu < this.KapasitasTotal){
            JumlahTamu++;
            PenghuniHotel.add(PelangganMasuk);
        }
    }

    public void PelangganHotelCheckOut(Pelanggan PelangganYangKeluar)
    {
        if(this.JumlahTamu > 0){
            JumlahTamu--;
            PenghuniHotel.remove(PelangganYangKeluar);
        }
    }

    public void GantiNamaHotel(String NamaBaruHotel)
    {
        this.Nama_Hotel = NamaBaruHotel;
    }

    @Override
    public String toString()
    {
        return this.Nama_Hotel+"-Kapasitas:"+KapasitasTotal;
    }

    public void KosongkanHotel()
    {
        this.JumlahTamu = 0;
        PenghuniHotel.clear();
    }

}
