package ma.enset.backend.f_houd.mappers;

import ma.enset.backend.f_houd.dtos.PaysDto;
import ma.enset.backend.f_houd.entities.Pays;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class PaysMapper {
    public PaysDto fromPays(Pays pays){
        PaysDto paysDto=new PaysDto();
        BeanUtils.copyProperties(pays,paysDto);
        return  paysDto;
    }

    public Pays fromPaysDto(PaysDto paysDto){
        Pays pays=new Pays();
        BeanUtils.copyProperties(paysDto,pays);
        return  pays;
    }
}
