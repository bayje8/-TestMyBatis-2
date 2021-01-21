package com.example.demo.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.dao.DuplicateKeyException;

import com.example.demo.type.aliases.Film;

public interface FilmMapper {

	public Film getActor(@Param("id") int id);

	public void addActor(@Param("id") int id, @Param("title") String title, @Param("description") String description);
	
	public List<Film> getFilms(@Param("id") int id, @Param("replacementCost") int replacementCost, @Param("rentalPrice") int rent);
}
