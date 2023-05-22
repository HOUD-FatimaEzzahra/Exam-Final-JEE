package ma.enset.backend.f_houd.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private Date dateDepart;
    private Date dateArrivee;

    @ManyToOne
    private Aeroport aeroportDepart;

    @ManyToOne
    private Aeroport aeroportDestination;

    @ManyToOne
    private Avion avion;

    @OneToMany(mappedBy = "vol")
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "vol")
    private List<Ticket> tickets;

    @ManyToOne
    private Voyage voyage;
}
