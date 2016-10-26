package com.bike.service;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;

	import com.bike.DAO.BikeDAO;
	import com.bike.DAO.BikeDAOImpl;
	import com.bike.Model.Bike;

    @Service

	public class BikeservDAOImpl implements BikeservDAO {

	@Autowired
		 BikeDAO md;
	       
		@Transactional
		public void addGenre(Bike m) {
			md.addGenre(m);
			} 
	@Transactional
		public void updateGenre(Bike m) {
			md.updateGenre(m);
			}
		@Transactional
		public List<Bike> listBike() {
					return md.getGenre();
		}
			@Transactional
		public void removeGenre(String gid) {
			md.removeGenre(gid);
				}
			
	@Transactional
		public Bike getGenrebyId(String gid) {
					return md.getGenrebyId(gid);
		}
	public void addGenre(com.bike.service.Bike m) {
		// TODO Auto-generated method stub
		
	}
	public void updateGenre(com.bike.service.Bike m) {
		// TODO Auto-generated method stub
		
	}
	public com.bike.service.Bike getGenrebyId(String gid) {
		// TODO Auto-generated method stub
		return null;
	}


	}


