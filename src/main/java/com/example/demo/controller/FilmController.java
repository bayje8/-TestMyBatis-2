package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mybatis.mapper.FilmMapper;
import com.example.demo.type.aliases.Film;

@RestController
public class FilmController {
	
	@Autowired
	FilmMapper mapper;

	@RequestMapping(method=RequestMethod.GET, path="/films")
	public Film getFilmById(@RequestParam("id") int id) {
		return mapper.getActor(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, path="/films", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Film> addFilm(@RequestBody Film film){

		mapper.addActor(film.getFilmId(), film.getTitle(), film.getDescription());

		return new ResponseEntity<Film>(HttpStatus.CREATED);
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/filmsByParams")
	public ResponseEntity<List<Film>> getFilmsByRentalAndReplacementCost(@RequestParam("id") int id, @RequestParam("replacementCost") int replacementCost,@RequestParam("rentalPrice") int rent){
		return new ResponseEntity<List<Film>>(mapper.getFilms(id, replacementCost, rent),HttpStatus.OK);
	}
}
