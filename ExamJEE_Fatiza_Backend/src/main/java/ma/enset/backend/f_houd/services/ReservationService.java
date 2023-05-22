package ma.enset.backend.f_houd.services;


import ma.enset.backend.f_houd.dtos.ReservationDto;

import java.util.List;

public interface ReservationService {
    ReservationDto saveReservation(ReservationDto reservationDto);
    ReservationDto updateReservation(Long id, ReservationDto reservationDto);
    void deleteReservation(Long id);
    ReservationDto getReservation(Long id);
    List<ReservationDto> getAllReservations();
}
