package id.co.project_kel2.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "apt_msobat")
public class Obat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "obt_id")
    private Integer obt_id;

    @Column(name = "obt_nama")
    private String obt_nama;

    @Column(name = "obt_kegunaan")
    private String obt_kegunaan;

    @Column(name = "obt_hrgJual")
    private BigDecimal obt_hrgJual;

    @Column(name = "obt_stok")
    private Integer obt_stok;

    @Column(name = "obt_status")
    private Integer obt_status;

    public Obat() {
    }

    public Obat(Integer obt_id, String obt_nama, String obt_kegunaan, BigDecimal obt_hrgJual,
                 Integer obt_stok, Integer obt_status) {
        this.obt_id = obt_id;
        this.obt_nama = obt_nama;
        this.obt_kegunaan = obt_kegunaan;
        this.obt_hrgJual = obt_hrgJual;
        this.obt_stok = obt_stok;
        this.obt_status = obt_status;
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

    public BigDecimal getObt_hrgJual() {
        return obt_hrgJual;
    }

    public void setObt_hrgJual(BigDecimal obt_hrgJual) {
        this.obt_hrgJual = obt_hrgJual;
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
