package id.co.project_kel2.vo;

import id.co.project_kel2.model.Obat;

import java.math.BigDecimal;

public class ObatVo
{
    private Integer obt_id;
    private String obt_nama;
    private String obt_kegunaan;
    private BigDecimal obt_hrg_jual;
    private Integer obt_stok;
    private Integer obt_status;

    // Konstruktor
    public ObatVo() {
    }

    public ObatVo(Obat obat) {
        this.obt_id = obat.getObt_id();
        this.obt_nama = obat.getObt_nama();
        this.obt_kegunaan = obat.getObt_kegunaan();
        this.obt_hrg_jual = obat.getObt_hrg_jual();
        this.obt_stok = obat.getObt_stok();
        this.obt_status = obat.getObt_status();
    }

    public Integer getObt_id() {
        return obt_id;
    }

    public void setObt_id(Integer obt_id) {
        this.obt_id = obt_id;
    }

    public String getObt_nama() {
        return obt_nama;
    }

    public void setObt_nama(String obt_nama) {
        this.obt_nama = obt_nama;
    }

    public String getObt_kegunaan() {
        return obt_kegunaan;
    }

    public void setObt_kegunaan(String obt_kegunaan) {
        this.obt_kegunaan = obt_kegunaan;
    }

    public BigDecimal getObt_hrg_jual() {
        return obt_hrg_jual;
    }

    public void setObt_hrg_jual(BigDecimal obt_hrg_jual) {
        this.obt_hrg_jual = obt_hrg_jual;
    }

    public Integer getObt_stok() {
        return obt_stok;
    }

    public void setObt_stok(Integer obt_stok) {
        this.obt_stok = obt_stok;
    }

    public Integer getObt_status() {
        return obt_status;
    }

    public void setObt_status(Integer obt_status) {
        this.obt_status = obt_status;
    }
}
