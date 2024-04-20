package id.co.project_kel2.vo;

import id.co.project_kel2.model.Transaksi;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class TransaksiVo
{
    private Integer id;
    private Date tanggal;
    private BigDecimal total;
    private List<DetailTransaksiVo> details;
    public TransaksiVo() {
    }

    public TransaksiVo(Transaksi penjualan) {
        this.id = penjualan.getTrs_id();
        this.tanggal = penjualan.getTrs_tanggal();
        this.total = penjualan.getTrs_total();
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
