package id.co.project_kel2.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "apt_trsdtl")
public class DetailPenjualan implements Serializable {
    @EmbeddedId
    private DetailPenjualanPK detailPenjualanPK;
    @Column(name = "jumlah_obt")
    private Integer jumlah_obt;
    @ManyToOne
    @JoinColumn(name = "trs_id", referencedColumnName = "trs_id", insertable = false, updatable = false)
    private Penjualan penjualan;
    @ManyToOne
    @JoinColumn(name = "obt_id", referencedColumnName = "obt_id", insertable = false, updatable = false)
    private Obat obat;
    public DetailPenjualan() {
    }

    public DetailPenjualanPK getDetailPenjualanPK() {
        return detailPenjualanPK;
    }

    public void setDetailPenjualanPK(DetailPenjualanPK detailPenjualanPK) {
        this.detailPenjualanPK = detailPenjualanPK;
    }

    public Integer getJumlah_obt() {
        return jumlah_obt;
    }

    public void setJumlah_obt(Integer jumlah_obt) {
        this.jumlah_obt = jumlah_obt;
    }

    public Penjualan getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(Penjualan penjualan) {
        this.penjualan = penjualan;
    }

    public Obat getObat() {
        return obat;
    }

    public void setObat(Obat obat) {
        this.obat = obat;
    }
}
