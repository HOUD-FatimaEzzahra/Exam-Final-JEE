package ma.enset.backend.f_houd.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Aeroport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private double longitude;
    private double latitude;
    private double altitude;

    @ManyToOne
    private Ville ville;

    @OneToMany(mappedBy = "aeroportDepart")
    private List<Vol> volsDepart;

    @OneToMany(mappedBy = "aeroportDestination")
    private List<Vol> volsDestination;

}
