package me.michael.deustchetravel;

public class main {
    public static void main(String args[]){
        // declare the transportation...
        Transportasi MobilBUS = new Transportasi(
                "Kencana Jaya Bus",
                "BK 99918 LBS",
                "Sutiadi Manurung",
                "Bus",
                "Merah",
                10,
                20,
                9.1f,
                2.51f,
                12
        );

        Tiket TiketPenumpangA = new Tiket(
                "Meliakhi Anwar",
                "Bus",
                "Medan",
                "Jakarta",
                true,
                false,
                120000,
                1
        );

        Pelanggan Meliakhi_Anwar = new Pelanggan(
                TiketPenumpangA,
                "Meliakhi Anwar",
                21,
                "Medan",
                "Indonesia",
                Pelanggan.jenis_sex.LAKI_LAKI,
                false,
                null,
                21,
                170,
                MobilBUS
        );

        Pelanggan Bobi_Jensen = new Pelanggan(
                TiketPenumpangA,
                "Bobi Jhenna",
                30,
                "Jakarta",
                "Indonesia",
                Pelanggan.jenis_sex.LAKI_LAKI,
                true,
                null,
                21,
                102,
                MobilBUS
        );

        Hotel HotelSantikaPutri = new Hotel(
                "Santika Putri Resort",
                "PT.Santika",
                "Jalan Kerak",
                "Hotel yang mahal dan cantik",
                5.0f,
                210000,
                190,
                21
        );

        DestinasiWisata PancurBatu3000 = new DestinasiWisata(
                "Pancur Batu 3000 Waterpark",
                "Deli Serdang",
                "Sumatera Utara",
                "PT AnakBerbahagia 30",
                "Pancur Batu Waterpark yang menyenangkan",
                "Pancuran",
                30000,
                10,
                300
        );


        Meliakhi_Anwar.tambah_Pelanggan_Bersama(Bobi_Jensen);
        Bobi_Jensen.tambah_Pelanggan_Bersama(Meliakhi_Anwar);

        Meliakhi_Anwar.PrintInfoPelanggan();
        Bobi_Jensen.PrintInfoPelanggan();

        HotelSantikaPutri.PelangganHotelCheckIn(Meliakhi_Anwar);
        HotelSantikaPutri.PelangganHotelCheckIn(Bobi_Jensen);

        PancurBatu3000.TambahJumlahPengunjungLain(120);
        PancurBatu3000.TambahPelangganSebagaiPengunjung(Bobi_Jensen);
        PancurBatu3000.TambahPelangganSebagaiPengunjung(Meliakhi_Anwar);
        PancurBatu3000.BerkurangJumlahPengunjung(50);
        PancurBatu3000.TambahPelangganSebagaiPengunjung(Bobi_Jensen);
        PancurBatu3000.TambahPelangganSebagaiPengunjung(Meliakhi_Anwar);

        System.out.println(HotelSantikaPutri);
        System.out.println(PancurBatu3000);
        System.out.println(Bobi_Jensen);
        System.out.println(Meliakhi_Anwar);
        System.out.println(MobilBUS);

        PancurBatu3000.DestinasiTutup();

        HotelSantikaPutri.PelangganHotelCheckOut(Meliakhi_Anwar);
        HotelSantikaPutri.PelangganHotelCheckOut(Bobi_Jensen);
    }
}
