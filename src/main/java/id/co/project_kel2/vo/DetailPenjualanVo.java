package id.co.project_kel2.vo;

import id.co.project_kel2.model.Obat;

import java.math.BigDecimal;

public class DetailPenjualanVo
{
    private Integer obt_id;
    private Integer jumlah;

    public DetailPenjualanVo() {
    }

    public DetailPenjualanVo(Obat obat) {
        this.obt_id = obat.getObt_id();
        this.jumlah = getJumlah();
    }

    public Integer getObt_id() {
        return obt_id;
    }

    public void setObt_id(Integer obt_id) {
        this.obt_id = obt_id;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }
}
