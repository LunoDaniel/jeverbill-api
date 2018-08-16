package br.com.jeverbill.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jeverbill.domain.Bill;

@RestController
@RequestMapping("/bill")
public class BillController {
	
	@GetMapping(path="/all")
	public ResponseEntity<List<Bill>>get(){
		return ResponseEntity.ok(Arrays.asList(new Bill()));
	}

	public ResponseEntity<Bill> post(Bill entity, Model model) {
		return null;
	}

	public ResponseEntity<Bill> delete(Bill entity, Model model) {
		return null;
	}
}
