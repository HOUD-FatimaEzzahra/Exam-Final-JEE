package ma.enset.backend.f_houd.mappers;

import ma.enset.backend.f_houd.dtos.VilleDto;
import ma.enset.backend.f_houd.entities.Ville;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class VilleMapper {
    public VilleDto fromVille(Ville ville){
        VilleDto villeDto=new VilleDto();
        BeanUtils.copyProperties(ville,villeDto);
        return  villeDto;
    }
    public Ville fromVilleDto(VilleDto villeDto){
        Ville ville=new Ville();
        BeanUtils.copyProperties(villeDto,ville);
        return  ville;
    }

}
