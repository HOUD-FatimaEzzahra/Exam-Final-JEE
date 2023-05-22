package ma.enset.backend.f_houd.mappers;

import ma.enset.backend.f_houd.dtos.ReservationDto;
import ma.enset.backend.f_houd.entities.Reservation;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ReservationMapper {
    public ReservationDto fromReservation(Reservation reservation){
        ReservationDto reservationDto=new ReservationDto();
        BeanUtils.copyProperties(reservation,reservationDto);
        return  reservationDto;
    }

    public Reservation fromReservationDto(ReservationDto reservationDto){
        Reservation reservation=new Reservation();
        BeanUtils.copyProperties(reservationDto,reservation);
        return  reservation;
    }


}
