package ma.enset.backend.f_houd.mappers;

import ma.enset.backend.f_houd.dtos.AvionDto;
import ma.enset.backend.f_houd.entities.Avion;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class AvionMapper {
    public AvionDto fromAvion(Avion avion){
        AvionDto avionDto=new AvionDto();
        BeanUtils.copyProperties(avion,avionDto);
        return  avionDto;
    }
    public Avion fromAvionDto(AvionDto avionDto){
        Avion avion=new Avion();
        BeanUtils.copyProperties(avionDto,avion);
        return  avion;
    }
}
