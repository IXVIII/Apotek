package id.co.project_kel2.service;

import id.co.project_kel2.model.Obat;
import id.co.project_kel2.response.DtoResponse;
import id.co.project_kel2.vo.ObatVo;

public interface ObatService {
    DtoResponse getAllObats();
    DtoResponse getObatActive();
    DtoResponse saveObat(Obat obat);
    DtoResponse updateObat(Obat obat);
    void deleteObat(int id);
    ObatVo getObatById(int id);
}

