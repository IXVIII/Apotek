package id.co.project_kel2.vo;

import id.co.project_kel2.model.DetailTransaksi;

public class DetailTransaksiVoForm
{
    private Integer trsdtlId;
    private Integer trsId;
    private Integer obtId;
    private Integer jumlahObt;

    // Konstruktor
    public DetailTransaksiVoForm() {
    }

    public DetailTransaksiVoForm(DetailTransaksi detailTransaksi) {
        this.trsdtlId = detailTransaksi.getDetailTransaksiPK().getTrsdtl_id();
        this.trsId = detailTransaksi.getDetailTransaksiPK().getTrs_id();
        this.obtId = detailTransaksi.getDetailTransaksiPK().getObt_id();
        this.jumlahObt = detailTransaksi.getJumlah_obt();
    }

    public Integer getTrsdtlId() {
        return trsdtlId;
    }

    public void setTrsdtlId(Integer trsdtlId) {
        this.trsdtlId = trsdtlId;
    }

    public Integer getTrsId() {
        return trsId;
    }

    public void setTrsId(Integer trsId) {
        this.trsId = trsId;
    }

    public Integer getObtId() {
        return obtId;
    }

    public void setObtId(Integer obtId) {
        this.obtId = obtId;
    }

    public Integer getJumlahObt() {
        return jumlahObt;
    }

    public void setJumlahObt(Integer jumlahObt) {
        this.jumlahObt = jumlahObt;
    }
}
