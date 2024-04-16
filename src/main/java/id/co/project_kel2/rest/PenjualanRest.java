package id.co.project_kel2.rest;

import id.co.project_kel2.model.Penjualan;
import id.co.project_kel2.response.DtoResponse;
import id.co.project_kel2.service.ObatService;
import id.co.project_kel2.service.PenjualanService;
import id.co.project_kel2.vo.PenjualanVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/penjualan")
public class PenjualanRest {
    @Autowired
    private PenjualanService penjualanService;

    public PenjualanRest(PenjualanService penjualanService){

        this.penjualanService = penjualanService;
    }

    @PostMapping("/savePenjualan")
    public DtoResponse savePenjualan(@RequestBody PenjualanVo penjualanVo){
        return penjualanService.savePenjualan(penjualanVo);
    }
}
