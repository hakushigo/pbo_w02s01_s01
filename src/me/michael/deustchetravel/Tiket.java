package me.michael.deustchetravel;

import java.time.LocalDate;
import java.util.Random;
import me.michael.deustchetravel.Utils.RandomGenerator;

public class Tiket {
    public String ID_Tiket, Nama_Pemegang_Tiket, Jenis_Transportasi, Asal, Tujuan;
    public LocalDate Tanggal_Tiket_Dibuat;
    public boolean ApakahPerjalananBerasuransi, ApakahMembawaAnak;
    public float HargaPerjalanan;
    public Integer JumlahPenumpang;

    public Tiket(
            String Nama_Pemegang_Tiket,
            String Jenis_transportasi,
            String Asal,
            String Tujuan,

            boolean DiAsuransikan,
            boolean BawaAnak,

            float HargaPerjalan,
            Integer JumlahPenumpang
    ){
        this.CreateATicket(
                Nama_Pemegang_Tiket,
                Jenis_transportasi,
                Asal,
                Tujuan,
                DiAsuransikan,
                BawaAnak,
                HargaPerjalan,
                JumlahPenumpang
        );

        this.Tanggal_Tiket_Dibuat = LocalDate.now();
    }

    private String GenerateRandomTicketID(){
        int TicketNumber = RandomGenerator.Number();

        String TicketCode = RandomGenerator.Strings(3);

        return "TKT"+TicketNumber+TicketCode;
    }

    private void CreateATicket(
            String Nama_Pemegang_Tiket,
            String Jenis_transportasi,
            String Asal,
            String Tujuan,

            boolean DiAsuransikan,
            boolean BawaAnak,

            float HargaPerjalan,
            Integer JumlahPenumpang
    ){

        // Generate the random Ticket ID and append it to the this.ID_Ticket
        this.ID_Tiket = GenerateRandomTicketID();

        // manually putting data the attributes
        this.Nama_Pemegang_Tiket = Nama_Pemegang_Tiket;
        this.Jenis_Transportasi = Jenis_transportasi;
        this.Asal = Asal;
        this.Tujuan = Tujuan;
        this.ApakahMembawaAnak = BawaAnak;
        this.ApakahPerjalananBerasuransi = DiAsuransikan;
        this.HargaPerjalanan = HargaPerjalan;
        this.JumlahPenumpang = JumlahPenumpang;
    }

    @Override
    public String toString(){
        return "TKT:"+this.Nama_Pemegang_Tiket+":"+this.ID_Tiket;
    }

    public void ubah_pemegang_tiket(String nama_pemegang_tiket){
        this.Nama_Pemegang_Tiket = nama_pemegang_tiket;
    }

    public void ubah_detail_addt_perjalanan(
            boolean status_asuransi,
            boolean status_bawa_anak
    ){
        this.ApakahPerjalananBerasuransi = status_asuransi;
        this.ApakahPerjalananBerasuransi = status_bawa_anak;
    }
}
