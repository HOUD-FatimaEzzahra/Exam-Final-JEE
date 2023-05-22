package ma.enset.backend.f_houd.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.enset.backend.f_houd.dtos.VolDto;
import ma.enset.backend.f_houd.entities.Vol;
import ma.enset.backend.f_houd.mappers.VolMapper;
import ma.enset.backend.f_houd.repositories.VolRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class VolServiceImpl  implements VolService{
    private final VolRepository volRepository;
    private VolMapper volMapper;
    @Override
    public VolDto saveVol(VolDto volDto) {
        log.info("Saving new Vol");
        Vol vol= volMapper.fromVolDto(volDto);
        Vol savedVol = volRepository.save(vol);
        return volMapper.fromVol(savedVol);
    }

    @Override
    public VolDto updateVol(Long id, VolDto volDto) {
        log.info("Updating Vol");
        Vol vol= volMapper.fromVolDto(volDto);
        vol.setDateDepart(volDto.getDateDepart());
        vol.setDateArrivee(volDto.getDateArrivee());
        return volMapper.fromVol(volRepository.save(vol));
    }

    @Override
    public void deleteVol(Long id) {
        log.info("Deleting Vol");
        volRepository.deleteById(id);
    }

    @Override
    public VolDto getVol(Long id) {
        log.info("Getting Vol");
        Vol vol = volRepository.findById(id).orElse(null);
        return volMapper.fromVol(vol);
    }

    @Override
    public List<VolDto> getAllVols() {
        log.info("Getting all Vols");
        return volRepository.findAll().stream().map(volMapper::fromVol).collect(java.util.stream.Collectors.toList());
    }
}
