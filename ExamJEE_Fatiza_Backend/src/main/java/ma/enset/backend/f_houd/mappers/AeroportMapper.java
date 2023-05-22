package ma.enset.backend.f_houd.mappers;

import ma.enset.backend.f_houd.dtos.AeroportDto;
import ma.enset.backend.f_houd.entities.Aeroport;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class AeroportMapper {
    public AeroportDto fromAeroport(Aeroport aeroport){
        AeroportDto aeroportDto=new AeroportDto();
        BeanUtils.copyProperties(aeroport,aeroportDto);
        return  aeroportDto;
    }
    public Aeroport fromAeroportDto(AeroportDto aeroportDto){
        Aeroport aeroport=new Aeroport();
        BeanUtils.copyProperties(aeroportDto,aeroport);
        return  aeroport;
    }
}
