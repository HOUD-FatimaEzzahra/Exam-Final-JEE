package ma.enset.backend.f_houd.services;

import ma.enset.backend.f_houd.dtos.AeroportDto;

import java.util.List;

public interface AeroportService {
    AeroportDto saveAeroport(AeroportDto aeroportDto);
    AeroportDto updateAeroport(Long id, AeroportDto aeroportDto);
    void deleteAeroport(Long id);
    AeroportDto getAeroport(Long id);
    List<AeroportDto> getAllAeroports();
}
