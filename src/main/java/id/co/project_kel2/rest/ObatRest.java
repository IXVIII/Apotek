package id.co.project_kel2.rest;

import id.co.project_kel2.model.Obat;
import id.co.project_kel2.response.DtoResponse;
import id.co.project_kel2.service.ObatService;
import id.co.project_kel2.vo.ObatVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import static id.co.project_kel2.constant.ObatConstant.*;

@CrossOrigin
@RestController
@RequestMapping("/obats")
public class ObatRest {
    @Autowired
    private ObatService obatService;

    public ObatRest(ObatService obatService) {
        this.obatService = obatService;
    }

    @GetMapping("/getObats")
    public DtoResponse getObats() {
        return obatService.getAllObats();
    }

    @GetMapping("/getObatActive")
    public DtoResponse getObatActive() {
        return obatService.getObatActive();
    }
    @GetMapping("/getObatById/{id}")
    public ResponseEntity<ObatVo> getObatById(@PathVariable int id) {
        ObatVo obat = obatService.getObatById(id);
        if (obat != null) {
            return new ResponseEntity<>(obat, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/saveObat")
    public DtoResponse createObat (@RequestBody Obat obat) {
        return obatService.saveObat (obat);
    }
    @PostMapping("/updateObat")
    public DtoResponse updateObat (@RequestBody Obat obat) {
        return obatService.updateObat (obat);
    }
    @PostMapping("/deleteObat/{id}")
    public ResponseEntity<String> deleteObat(@PathVariable int id) {
        ObatVo obats = obatService.getObatById(id);
        if (obats != null) {
            obatService.deleteObat(id);
            return new ResponseEntity<>(mDeleteSuccess, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(mNotFound, HttpStatus.NOT_FOUND);
        }

    }
}
