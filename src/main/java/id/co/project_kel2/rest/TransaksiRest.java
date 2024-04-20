package id.co.project_kel2.rest;

import id.co.project_kel2.response.DtoResponse;
import id.co.project_kel2.service.TransaksiService;
import id.co.project_kel2.vo.TransaksiVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/penjualan")
public class TransaksiRest {
    @Autowired
    private TransaksiService penjualanService;

    public TransaksiRest(TransaksiService penjualanService){

        this.penjualanService = penjualanService;
    }

    /*@PostMapping("/savePenjualan")
    public DtoResponse savePenjualan(@RequestBody TransaksiVo penjualanVo){
        return penjualanService.savePenjualan(penjualanVo);
    }
    
     */
}
