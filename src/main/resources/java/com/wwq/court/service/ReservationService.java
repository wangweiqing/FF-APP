package com.wwq.court.service;

import java.util.List;

import com.wwq.court.domain.Reservation;

public interface ReservationService {

	public List<Reservation> query(String courtName);
}
