package id.co.project_kel2.service;

import id.co.project_kel2.model.Obat;
import id.co.project_kel2.response.DtoResponse;
import id.co.project_kel2.vo.ObatVo;

public interface ObatService {
    DtoResponse getAllObats();
    DtoResponse getObatActive();
    DtoResponse saveObat(Obat obat);
    DtoResponse updateObat(Obat obat);
    DtoResponse deleteObat(Obat obat);
    DtoResponse aktifObat(Obat obat);
    DtoResponse getObatById(int id);

}

