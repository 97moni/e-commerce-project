  package com.bike.DAO;

	import java.util.ArrayList;
	//import java.util.ArrayList;
	import java.util.List;
	import java.io.*;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.Transactinal;
	

	import com.bike.Model.Bike;

	@Repository
	@Transactional
	public class BikeDAOImpl implements BikeDAO {
		private List<Bike> listGenre;
			@Autowired
		SessionFactory sessionFactory;
			@SuppressWarnings("unchecked")   
		public List<Bike> getGenre() {
			     		
			Session sess=sessionFactory.openSession();
			
			listGenre=sess.createQuery("from Bike").list();
			return listGenre;
		}
		
			
		
			public void addGenre(Bike m) {
			Session sess=sessionFactory.openSession();
			Transaction tx=sess.beginTransaction();
			sess.save(m);
			tx.commit();
		    sess.close();
			//System.out.println("successssss valu is "+m.getDesc());
			
		}

		public void updateGenre(Bike m) {
			System.out.println("DAO Implementation");
			Session sess=sessionFactory.openSession();
			Transaction trx=sess.beginTransaction();
			sess.saveorupdate(m);
			trx.commit();
			sess.close();
		}



		@SuppressWarnings("unchecked")
		public bike getGenrebyId(String gid) {
				Session sess=sessionFactory.openSession();
			Transaction tx=sess.beginTransaction();
			listGenre= sess.createQuery("from bike m where m.genreid=:gid").setParameter("gid", gid).list();
		tx.commit();
		sess.clone();
				return listGenre.size()>0?listGenre.get(0):null;
			
		}
				public void removeGenre(String gid) {
			Session sess=sessionFactory.openSession();
			Transaction trx=sess.beginTransaction();
			
			bike m=(bike)sess.load(bike.class,gid );
				sess.delete(m);
			trx.commit();
			sess.clone();
		}



				public void addGenre(Bike m) {
					// TODO Auto-generated method stub
					
				}



				public void updateGenre(Bike m) {
					// TODO Auto-generated method stub
					
				}



				public Bike getGenrebyId(String gid) {
					// TODO Auto-generated method stub
					return null;
				}

	}



}
