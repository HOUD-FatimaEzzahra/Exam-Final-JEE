package ma.enset.backend.f_houd.dtos;

import lombok.Data;

@Data
public class ClientDto {
    private Long id;
    private String nom;
    private String prenom;
    private String email;

}
