package com.bancomundial.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bancomundial.springboot.backend.apirest.models.dao.ISerieDao;
import com.bancomundial.springboot.backend.apirest.models.entity.Serie;

@Service
public class SerieServiceImpl implements ISerieService{
	
	@Autowired
	private ISerieDao serieDao;
	/*@Override
	@Transactional(readOnly = true) //omitible
	public List<Serie> findAll() {
		// TODO Auto-generated method stub
		return (List<Serie>) clienteDao.findAll();
	}*/
	@Override
	public List<Serie> findBySeriesCode(String seriesCode) throws Exception {
		try {
			List<Serie> series = serieDao.findBySeriesCode(seriesCode);
			return series;
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
		
	}
	@Override
	public List<Serie> findBySeriesCodeAndCountryCode(String seriesCode, String countryCode) throws Exception {
		try {
			List<Serie> series = serieDao.findBySeriesCodeAndCountryCode(seriesCode,countryCode);
			return series;
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public List<Serie> conexionAzure() throws Exception {
		try {
			List<Serie> series = serieDao.tryAzureDBConection();
			return series;
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}

}
