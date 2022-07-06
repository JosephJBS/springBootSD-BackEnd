package com.bancomundial.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bancomundial.springboot.backend.apirest.models.entity.Serie;

public interface ISerieDao extends CrudRepository<Serie,Long> {
	
	@Query(value="select * from datalab2 a where a.SERIES_CODE = :seriesCode", nativeQuery=true)
	List <Serie> findBySeriesCode(String seriesCode);
	
	@Query(value="select * from datalab2 a where a.SERIES_CODE = :seriesCode and a.COUNTRY_CODE = :countryCode", nativeQuery=true)
	List <Serie> findBySeriesCodeAndCountryCode(String seriesCode, String countryCode);

	@Query(value="select * from datalab2 a where id in (1,2)", nativeQuery=true)
	List <Serie> tryAzureDBConection();
	
}
