package me.michael.deustchetravel;

import java.util.ArrayList;

public class Pelanggan {
    public Transportasi TranspotPelanggan;
    public Tiket TiketPelanggan;
    public String Nama_Pelanggan, AsalPelanggan, Kewarganegaraan;
    int Umur;
    public jenis_sex Jenis_Kelamin_Pelanggan;
    public boolean Pelanggan_VIP;
    public ArrayList<Pelanggan> PelangganLainBersama;
    public float BeratBadan, Tinggi;


    public enum jenis_sex {
        LAKI_LAKI, PEREMPUAN
    }

    public Pelanggan(
            Tiket TiketPelanggan,
            String Nama_Pelanggan,
            Integer Umur,
            String AsalPelanggan,
            String Kewarganegaraan,
            jenis_sex Jenis_Kelamin_Pelanggan,
            boolean Pelanggan_VIP,
            Pelanggan[] PelangganLainBersama,
            float BeratBadan,
            float Tinggi,
            Transportasi TransportPelanggan
    ){
        this.TiketPelanggan = TiketPelanggan;

        this.Nama_Pelanggan = Nama_Pelanggan;
        this.Umur = Umur;
        this.AsalPelanggan = AsalPelanggan;
        this.Kewarganegaraan = Kewarganegaraan;
        this.Jenis_Kelamin_Pelanggan = Jenis_Kelamin_Pelanggan;
        this.Pelanggan_VIP = Pelanggan_VIP;

        this.PelangganLainBersama = new ArrayList<Pelanggan>();
        this.BeratBadan = BeratBadan;
        this.Tinggi = Tinggi;
        this.TranspotPelanggan = TransportPelanggan;


        // synchronized
        this.sesuaikan_jenis_transportasi();
    }

    @Override
    public String toString() {
        return this.Nama_Pelanggan+":From:"+this.AsalPelanggan;
    }

     public void PrintInfoPelanggan(){
        System.out.print(
                    "Informasi Pelanggan:\n" +
                            "Nama Pelanggan: "+this.Nama_Pelanggan+"\n" +
                            "Umur Pelanggan: "+this.Umur+"\n" +
                            "Kewarganegaraan: "+this.Kewarganegaraan+"\n" +
                            "ID Tiket Pelanggan: "+this.TiketPelanggan.ID_Tiket+"\n" +
                            "Jenis Transportasi Pelanggan"+this.TiketPelanggan.Jenis_Transportasi
        );

     }

     public void Ubah_Data_Pelanggan(
             String Nama,
             Integer Umur,
             String Asal,
             String Kewarganegaraan,
             jenis_sex JK
     ){
        this.Nama_Pelanggan = Nama;
        this.Umur = Umur;
        this.AsalPelanggan = Asal;
        this.Kewarganegaraan = Kewarganegaraan;
        this.Jenis_Kelamin_Pelanggan = JK;
     }

     public void tambah_Pelanggan_Bersama(Pelanggan TemanPelanggan){
        this.PelangganLainBersama.add(TemanPelanggan);
     }

     public void changeVIPStatus(){
        this.Pelanggan_VIP = !this.Pelanggan_VIP;
     }

     private void sesuaikan_jenis_transportasi(){
        this.TiketPelanggan.Jenis_Transportasi = this.TranspotPelanggan.JenisTransportasi;
     }
}
