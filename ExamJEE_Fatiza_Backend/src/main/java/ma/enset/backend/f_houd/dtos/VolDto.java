package ma.enset.backend.f_houd.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class VolDto {
    private Long id;
    private String nom;
    private Date dateDepart;
    private Date dateArrivee;


}
