package ma.enset.backend.f_houd.controllers;

import lombok.AllArgsConstructor;
import ma.enset.backend.f_houd.dtos.VolDto;
import ma.enset.backend.f_houd.services.VolServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
public class VolRestController {
    private final VolServiceImpl volService;

    @GetMapping("/vols")
    public List<VolDto> getVols(){
        List<VolDto> vols = volService.getAllVols();
        return vols;
    }

    @GetMapping("/vols/{id}")
    public VolDto getVol(Long id){
        return volService.getVol(id);
    }

    @PostMapping("/vols")
    public VolDto saveVol(@RequestBody VolDto volDto){
        return volService.saveVol(volDto);
    }

    @PutMapping("/vols/{id}")
    public VolDto updateVol(@PathVariable Long id, @RequestBody VolDto volDto){
        volDto.setId(id);
        return volService.updateVol(id, volDto);
    }

    @DeleteMapping("/vols/{id}")
    public void deleteVol(@PathVariable Long id){
        volService.deleteVol(id);
    }


}
