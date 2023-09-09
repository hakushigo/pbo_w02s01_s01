package me.michael.deustchetravel;

public class Transportasi {
    public String NamaTransportasi, IDTransportasi, NamaPengemudi, JenisTransportasi, WarnaTransportasi;
    int UmurTransportasi;
    float BeratTransportasi, LiterBahanBakar, RateKMBahanBakar, KecepatanTransportasi;

    public Transportasi(
            String NamaTransportasi,
            String IDTransportasi,
            String NamaPengemudi,
            String JenisTransportasi,
            String WarnaTransportasi,
            int UmurTransportasi,
            float BeratTransportasi,
            float LiterBahanBakar,
            float RateKMBahanBakar,
            float KecepatanTransportasi
    ){

        UpdateNamaTransportasi(
                NamaTransportasi,
                IDTransportasi,
                NamaPengemudi,
                JenisTransportasi,
                WarnaTransportasi,
                UmurTransportasi,
                BeratTransportasi,
                LiterBahanBakar,
                RateKMBahanBakar);
    }

    public void UpdateNamaTransportasi(
            String NamaTransportasi,
            String IDTransportasi,
            String NamaPengemudi,
            String JenisTransportasi,
            String WarnaTransportasi,
            int UmurTransportasi,
            float BeratTransportasi,
            float LiterBahanBakar,
            float RateKMBahanBakar
    ){
        this.NamaTransportasi = NamaTransportasi;
        this.IDTransportasi = IDTransportasi;
        this.NamaPengemudi = NamaPengemudi;
        this.JenisTransportasi = JenisTransportasi;
        this.WarnaTransportasi = WarnaTransportasi;
        this.UmurTransportasi = UmurTransportasi;
        this.BeratTransportasi = BeratTransportasi;
        this.LiterBahanBakar = LiterBahanBakar;
        this.RateKMBahanBakar = RateKMBahanBakar;
        this.KecepatanTransportasi = 0;
    }


    /**
     * TODO: Create more function about the transportation ability.
     * TODO: Create Start() function which invokes SetSpeed function()
     * TODO: Add more craps.
     */
}
