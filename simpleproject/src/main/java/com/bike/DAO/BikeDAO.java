 package com.bike.DAO;

	import java.util.List;
	

	import com.bike.Model.Bike;

	public interface BikeDAO {
		
		
		public void addGenre(Bike m);
		public void updateGenre(Bike m);
		public void removeGenre(String gid);
		public List<Bike> getGenre();
		public Bike getGenrebyId(String gid);

	}



