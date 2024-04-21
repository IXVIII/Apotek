package id.co.project_kel2.rest;


import id.co.project_kel2.response.DtoResponse;
import id.co.project_kel2.service.DetailTransaksiService;
import id.co.project_kel2.vo.DetailTransaksiVoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/detail")
public class DetailTransaksiRest {
    @Autowired
    private DetailTransaksiService detailTransaksiService;

    public DetailTransaksiRest(DetailTransaksiService detailTransaksiService) {
        this.detailTransaksiService = detailTransaksiService;
    }

    @GetMapping("/getDetail")
    public DtoResponse getDetailTransaksis(){
        return detailTransaksiService.getAllDetails();
    }


    @PostMapping("/saveDetail")
    public DtoResponse createDetailTransaksi(@RequestBody DetailTransaksiVoForm detailTransaksiVoForm) {
        return detailTransaksiService.saveDetail(detailTransaksiVoForm);
    }
}
