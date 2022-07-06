package com.bancomundial.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bancomundial.springboot.backend.apirest.models.entity.Serie;
import com.bancomundial.springboot.backend.apirest.models.services.ISerieService;

@CrossOrigin(origins= {"*"})
@RestController
@RequestMapping("/api")
public class SerieRestController {
	@Autowired
	private ISerieService serieService;
	
	/*@GetMapping("/series")
	public List<Serie> index(){
		return serieService.findAll();
	}*/
	@GetMapping("/series")
	public ResponseEntity<?> findBySeriesCode(@RequestParam String seriesCode){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(serieService.findBySeriesCode(seriesCode));
		}catch(Exception e){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
		}
		
	}
	
	@GetMapping("/seriesCountry")
	public ResponseEntity<?> findBySeriesCodeAndCountryCode(@RequestParam String seriesCode,@RequestParam  String countryCode){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(serieService.findBySeriesCodeAndCountryCode(seriesCode,countryCode));
		}catch(Exception e){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
		}
		
	}

	@GetMapping("/conectionPostman")
	public ResponseEntity<?> pruebaConexion(){
		try {
			return ResponseEntity.status(HttpStatus.OK).body("Conection");
		}catch(Exception e){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
		}

	}

	@GetMapping("/conectionAzure")
	public ResponseEntity<?> pruebaConexionAzure(){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(serieService.conexionAzure());
		}catch(Exception e){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
		}
	}
}
