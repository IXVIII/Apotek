package id.co.project_kel2.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "apt_trs")
public class Transaksi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trs_id")
    private Integer trs_id;
    @Column(name = "trs_tanggal")
    private Date trs_tanggal;
    @Column(name = "trs_total")
    private BigDecimal trs_total;
    public Transaksi() {
    }

    public Transaksi(Integer trs_id, Date trs_tanggal, BigDecimal trs_total) {
        this.trs_id = trs_id;
        this.trs_tanggal = trs_tanggal;
        this.trs_total = trs_total;
    }

    public Integer getTrs_id() {
        return trs_id;
    }

    public void setTrs_id(Integer trs_id) {
        this.trs_id = trs_id;
    }

    public Date getTrs_tanggal() {
        return trs_tanggal;
    }

    public void setTrs_tanggal(Date trs_tanggal) {
        this.trs_tanggal = trs_tanggal;
    }

    public BigDecimal getTrs_total() {
        return trs_total;
    }

    public void setTrs_total(BigDecimal trs_total) {
        this.trs_total = trs_total;
    }

}
