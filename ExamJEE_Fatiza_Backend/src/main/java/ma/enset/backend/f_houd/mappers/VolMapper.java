package ma.enset.backend.f_houd.mappers;

import ma.enset.backend.f_houd.dtos.VolDto;
import ma.enset.backend.f_houd.entities.Vol;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class VolMapper {
    public VolDto fromVol(Vol vol){
        VolDto volDto=new VolDto();
        BeanUtils.copyProperties(vol,volDto);
        return  volDto;
    }

    public Vol fromVolDto(VolDto volDto){
        Vol vol =new Vol();
        BeanUtils.copyProperties(volDto,vol);
        return  vol;
    }
}
