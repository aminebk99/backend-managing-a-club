package com.example.websiteclubbackend.Reservation.reservationService;

import com.example.websiteclubbackend.Reservation.reservation.Reservation;
import com.example.websiteclubbackend.Reservation.reservationRepo.ReservationRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    private final ReservationRepo reservationRepo;

    public ReservationService(ReservationRepo reservationRepo) {
        this.reservationRepo = reservationRepo;
    }
    public List<Reservation> getnoconfirmedres(){
        return reservationRepo.findByConfirmedFalse();
    }
    public List<Reservation> getconfirmedres(){
        return reservationRepo.findByConfirmedTrue();
    }
    public Reservation confirmReservation(Long id) {
        Reservation reservation = reservationRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Reservation not found"));

        reservation.setConfirmed(true);
        return reservationRepo.save(reservation);
    }
}
