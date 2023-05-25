package com.example.websiteclubbackend.Reservation.reservationRepo;

import com.example.websiteclubbackend.Reservation.reservation.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepo extends JpaRepository<Reservation, Long> {
    List<Reservation> findByConfirmedFalse();
    List<Reservation> findByConfirmedTrue();}
