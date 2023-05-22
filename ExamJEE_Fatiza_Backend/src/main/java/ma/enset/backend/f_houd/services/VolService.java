package ma.enset.backend.f_houd.services;

import ma.enset.backend.f_houd.dtos.VolDto;

import java.util.List;


public interface VolService {
    VolDto saveVol(VolDto volDto);
    VolDto updateVol(Long id, VolDto volDto);
    void deleteVol(Long id);
    VolDto getVol(Long id);
    List<VolDto> getAllVols();
}
