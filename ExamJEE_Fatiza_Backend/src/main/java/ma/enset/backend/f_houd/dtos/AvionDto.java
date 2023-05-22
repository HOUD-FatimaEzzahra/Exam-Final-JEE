package ma.enset.backend.f_houd.dtos;

import lombok.Data;

@Data
public class AvionDto {
    private Long id;
    private String nom;
    private int nombrePlaces;
}
