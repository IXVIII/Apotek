package id.co.project_kel2.vo;

import id.co.project_kel2.model.DetailTransaksi;

import java.math.BigDecimal;
import java.util.Date;

public class DetailTransaksiVo
{
    private Integer trsdtlId;
    private Integer trsId;
    private Integer obtId;
    private String obt_nama;
    private Integer jumlahObt;

    // Konstruktor
    public DetailTransaksiVo() {
    }

    public DetailTransaksiVo(DetailTransaksi detailTransaksi) {
        this.trsdtlId = detailTransaksi.getDetailTransaksiPK().getTrsdtl_id();
        this.trsId = detailTransaksi.getDetailTransaksiPK().getTrs_id();
        this.obtId = detailTransaksi.getDetailTransaksiPK().getObt_id();
        this.jumlahObt = detailTransaksi.getJumlah_obt();
    }

    public String getObt_nama() {
        return obt_nama;
    }

    public void setObt_nama(String obt_nama) {
        this.obt_nama = obt_nama;
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
