package id.co.project_kel2.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "apt_trsdtl")
public class DetailTransaksi implements Serializable {
    @EmbeddedId
    private DetailTransaksiPK detailTransaksiPK;
    @Column(name="jumlah_obt")
    private Integer jumlah_obt;

    public DetailTransaksi(){}

    public DetailTransaksi(DetailTransaksiPK detailTransaksiPK, Integer jumlah_obt) {
        this.detailTransaksiPK = detailTransaksiPK;
        this.jumlah_obt = jumlah_obt;
    }

    public DetailTransaksiPK getDetailTransaksiPK() {
        return detailTransaksiPK;
    }

    public void setDetailTransaksiPK(DetailTransaksiPK detailTransaksiPK) {
        this.detailTransaksiPK = detailTransaksiPK;
    }

    public Integer getJumlah_obt() {
        return jumlah_obt;
    }

    public void setJumlah_obt(Integer jumlah_obt) {
        this.jumlah_obt = jumlah_obt;
    }
}
