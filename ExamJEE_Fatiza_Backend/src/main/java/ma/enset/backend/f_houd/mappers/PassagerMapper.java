package ma.enset.backend.f_houd.mappers;

import ma.enset.backend.f_houd.dtos.PassagerDto;
import ma.enset.backend.f_houd.entities.Passager;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class PassagerMapper {
    public PassagerDto fromPassager(Passager passager){
        PassagerDto passagerDto=new PassagerDto();
        BeanUtils.copyProperties(passager,passagerDto);
        return  passagerDto;
    }
    public Passager fromPassagerDto(PassagerDto passagerDto){
        Passager passager=new Passager();
        BeanUtils.copyProperties(passagerDto,passager);
        return  passager;
    }
}
