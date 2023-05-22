package ma.enset.backend.f_houd.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.enset.backend.f_houd.dtos.ReservationDto;
import ma.enset.backend.f_houd.entities.Reservation;
import ma.enset.backend.f_houd.mappers.ReservationMapper;
import ma.enset.backend.f_houd.repositories.ReservationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@AllArgsConstructor
@Slf4j
@Service
public class ReservationServiceImpl implements ReservationService{
    private final ReservationRepository reservationRepository;
    private ReservationMapper reservationMapper;
    @Override
    public ReservationDto saveReservation(ReservationDto reservationDto) {
        log.info("Saving new Reservation");
        Reservation reservation= reservationMapper.fromReservationDto(reservationDto);
        Reservation savedReservation = reservationRepository.save(reservation);
        return reservationMapper.fromReservation(savedReservation);
    }

    @Override
    public ReservationDto updateReservation(Long id, ReservationDto reservationDto) {
        log.info("Updating Reservation");
        Reservation reservation= reservationMapper.fromReservationDto(reservationDto);
        reservation.setDate(reservationDto.getDate());
        reservation.setSiteReservation(reservationDto.getSiteReservation());
        return reservationMapper.fromReservation(reservationRepository.save(reservation));
    }

    @Override
    public void deleteReservation(Long id) {
        log.info("Deleting Reservation");
        reservationRepository.deleteById(id);
    }

    @Override
    public ReservationDto getReservation(Long id) {
        log.info("Getting Reservation");
        Reservation reservation = reservationRepository.findById(id).orElse(null);
        return reservationMapper.fromReservation(reservation);
    }

    @Override
    public List<ReservationDto> getAllReservations() {
        List<Reservation> reservations = reservationRepository.findAll();
        return reservationRepository.findAll().stream().map(reservationMapper::fromReservation).collect(java.util.stream.Collectors.toList());
    }
}
