package id.co.project_kel2.vo;

import id.co.project_kel2.model.Obat;

import java.math.BigDecimal;

public class ObatVo
{
    private Integer id;
    private String nama;
    private String kegunaan;
    private BigDecimal hrgJual;
    private Integer stok;
    private Integer status;

    // Konstruktor
    public ObatVo() {
    }

    public ObatVo(Obat obat) {
        this.id = obat.getObt_id();
        this.nama = obat.getObt_nama();
        this.kegunaan = obat.getObt_kegunaan();
        this.hrgJual = obat.getObt_hrgJual();
        this.stok = obat.getObt_stok();
        this.status = obat.getObt_status();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKegunaan() {
        return kegunaan;
    }

    public void setKegunaan(String kegunaan) {
        this.kegunaan = kegunaan;
    }

    public BigDecimal getHrgJual() {
        return hrgJual;
    }

    public void setHrgJual(BigDecimal hrgJual) {
        this.hrgJual = hrgJual;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
