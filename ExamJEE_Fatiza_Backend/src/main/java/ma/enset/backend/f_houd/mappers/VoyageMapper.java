package ma.enset.backend.f_houd.mappers;

import ma.enset.backend.f_houd.dtos.VoyageDto;
import ma.enset.backend.f_houd.entities.Voyage;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class VoyageMapper {
    public VoyageDto fromVoyage(Voyage voyage){
        VoyageDto voyageDto=new VoyageDto();
        BeanUtils.copyProperties(voyage,voyageDto);
        return  voyageDto;
    }

    public Voyage fromVoyageDto(VoyageDto voyageDto){
        Voyage voyage=new Voyage();
        BeanUtils.copyProperties(voyageDto,voyage);
        return  voyage;
    }
}
