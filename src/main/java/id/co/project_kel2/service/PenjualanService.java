package id.co.project_kel2.service;

import id.co.project_kel2.model.Penjualan;
import id.co.project_kel2.response.DtoResponse;
import id.co.project_kel2.vo.PenjualanVo;

public interface PenjualanService {
    //DtoResponse getAllObats();
    DtoResponse savePenjualan(PenjualanVo penjualanVo);
}
