package ma.enset.backend.f_houd.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class ReservationDto {
    private Long id;
    private Date date;
    private String siteReservation;
}
