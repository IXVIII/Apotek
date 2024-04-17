package id.co.project_kel2.service;


import id.co.project_kel2.response.DtoResponse;
import id.co.project_kel2.vo.DetailTransaksiVoForm;


public interface DetailTransaksiService {
    DtoResponse getAllDetails();

    DtoResponse saveDetail(DetailTransaksiVoForm DetailTransaksiVoForm);


}
