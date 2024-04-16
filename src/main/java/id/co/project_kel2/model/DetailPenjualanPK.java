package id.co.project_kel2.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class DetailPenjualanPK implements Serializable {
    @Column(name = "obt_id")
    private Integer obt_id;
    @Column(name = "trs_id")
    private Integer trs_id;

    public DetailPenjualanPK() {
    }

    public DetailPenjualanPK(Integer obt_id, Integer trs_id, Integer trsdtl_id) {
        this.obt_id = obt_id;
        this.trs_id = trs_id;
    }

    public Integer getObt_id() {
        return obt_id;
    }

    public void setObt_id(Integer obt_id) {
        this.obt_id = obt_id;
    }

    public Integer getTrs_id() {
        return trs_id;
    }

    public void setTrs_id(Integer trs_id) {
        this.trs_id = trs_id;
    }


}


