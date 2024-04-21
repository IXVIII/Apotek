package id.co.project_kel2.service;

import id.co.project_kel2.response.DtoResponse;
import id.co.project_kel2.vo.TransaksiVo;

public interface TransaksiService {
    DtoResponse getPenjualan();
    DtoResponse savePenjualan(TransaksiVo penjualanVo);
}
