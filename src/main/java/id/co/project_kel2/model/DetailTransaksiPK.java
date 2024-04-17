package id.co.project_kel2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable
public class DetailTransaksiPK implements Serializable {

    @Column(name="trsdtl_id")
    private Integer trsdtl_id;

    @Column(name="trs_id")
    private Integer trs_id;
    @Column(name = "obt_id")
    private Integer obt_id;
    public DetailTransaksiPK(){}

    public DetailTransaksiPK(Integer trsdtl_id, Integer trs_id, Integer obt_id) {
        this.trsdtl_id = trsdtl_id;
        this.trs_id = trs_id;
        this.obt_id = obt_id;
    }

    public Integer getTrsdtl_id() {
        return trsdtl_id;
    }

    public void setTrsdtl_id(Integer trsdtl_id) {
        this.trsdtl_id = trsdtl_id;
    }

    public Integer getTrs_id() {
        return trs_id;
    }

    public void setTrs_id(Integer trs_id) {
        this.trs_id = trs_id;
    }

    public Integer getObt_id() {
        return obt_id;
    }

    public void setObt_id(Integer obt_id) {
        this.obt_id = obt_id;
    }
}
