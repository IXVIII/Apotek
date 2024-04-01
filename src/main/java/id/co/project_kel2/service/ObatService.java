package id.co.project_kel2.service;

import id.co.project_kel2.model.Obat;
import id.co.project_kel2.response.DtoResponse;

public interface ObatService {
    DtoResponse getAllObats();
    DtoResponse getObatActive();
    DtoResponse saveObat(Obat obat);
    DtoResponse updateObat(Obat obat);
    DtoResponse deleteObat(Obat obat);
}
