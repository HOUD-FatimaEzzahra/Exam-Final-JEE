package ma.enset.backend.f_houd.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.enset.backend.f_houd.dtos.AeroportDto;
import ma.enset.backend.f_houd.entities.Aeroport;
import ma.enset.backend.f_houd.mappers.AeroportMapper;
import ma.enset.backend.f_houd.repositories.AeroportRespository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional
@AllArgsConstructor
@Slf4j
@Service
public class AeroportServiceImpl implements AeroportService{

    private final AeroportRespository aeroportRespository;
    private AeroportMapper aeroportMapper;

    @Override
    public AeroportDto saveAeroport(AeroportDto aeroportDto) {
        log.info("Saving new Aeroport");
        Aeroport aeroport= aeroportMapper.fromAeroportDto(aeroportDto);
        Aeroport savedAeroport = aeroportRespository.save(aeroport);
        return aeroportMapper.fromAeroport(savedAeroport);
    }

    @Override
    public AeroportDto updateAeroport(Long id, AeroportDto aeroportDto) {
        log.info("Updating Aeroport");
        Aeroport aeroport= aeroportMapper.fromAeroportDto(aeroportDto);
        aeroport.setNom(aeroportDto.getNom());
        aeroport.setAltitude(aeroportDto.getAltitude());
        aeroport.setLatitude(aeroportDto.getLatitude());
        aeroport.setLongitude(aeroportDto.getLongitude());
        Aeroport savedAeroport = aeroportRespository.save(aeroport);
        return aeroportMapper.fromAeroport(savedAeroport);
    }

    @Override
    public void deleteAeroport(Long id) {
        log.info("Deleting Aeroport");
        aeroportRespository.deleteById(id);
    }

    @Override
    public AeroportDto getAeroport(Long id) {
        log.info("Getting Aeroport");
        Aeroport aeroport = aeroportRespository.findById(id).orElse(null);
        return aeroportMapper.fromAeroport(aeroport);
    }

    @Override
    public List<AeroportDto> getAllAeroports() {
        List<AeroportDto> aeroportDtos = aeroportRespository.findAll().stream().map(aeroportMapper::fromAeroport).collect(Collectors.toList());
        return aeroportDtos;
    }
}
