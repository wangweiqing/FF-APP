package com.wwq.court.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.wwq.court.service.ReservationService;
import com.wwq.court.domain.Reservation;

@Controller
@RequestMapping("/reservationQuery")
public class ReservationQueryController {

	private ReservationService reservationService;

	@Autowired
	public void setReservationService(ReservationService reservationService) {
		this.reservationService = reservationService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public void setupForm() {
	}

	@RequestMapping(method = RequestMethod.POST)
	public String sumbitForm(@RequestParam("courtName") String courtName,
			Model model) {
		List<Reservation> reservations = java.util.Collections.emptyList();
		if (courtName != null) {
			reservations = reservationService.query(courtName);
		}
		model.addAttribute("reservations", reservations);
		return "reservationQuery";
	}
}
