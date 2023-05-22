package ma.enset.backend.f_houd.dtos;

import lombok.Data;
import ma.enset.backend.f_houd.entities.Ville;

@Data
public class AeroportDto {
    private Long id;
    private String nom;
    private double longitude;
    private double latitude;
    private double altitude;
    private Ville ville;

}
