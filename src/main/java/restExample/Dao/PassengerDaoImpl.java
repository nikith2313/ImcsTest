package restExample.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import restExample.Bean.Passenger;
@Repository
public class PassengerDaoImpl implements PassengerDao {

	
	
@Autowired
HibernateTemplate hibernateTemplate;

@Transactional(readOnly = false)
public int addPassenger(Passenger passenger) {
	// TODO Auto-generated method stub
	int id=(Integer) hibernateTemplate.save(passenger);
	return id;
}


@Transactional(readOnly = false)
public void updatePassenger(Passenger passenger) {
	// TODO Auto-generated method stub
	 hibernateTemplate.save(passenger);
	
}

public List<Passenger> getAllPassenger() {
	// TODO Auto-generated method stub
	System.out.println("was here");
	String hql = "FROM imcsrestspring.Passenger_Profile";
	System.out.println("was here");
	@SuppressWarnings("unchecked")
	List<Passenger> cust= (List<Passenger>) hibernateTemplate.find( hql); 
	 
	return cust;
}

public boolean deletPassenger(int passId) {
	// TODO Auto-generated method stub
	String hql = "DELETE from Customer WHERE cust_id = ?  ";	
	@SuppressWarnings("unchecked")
	List<Passenger> cust= (List<Passenger>) hibernateTemplate.find( hql,passId); 
	 
	return cust.size()>0?true:false;
}


	public  Passenger findPassenger(int passId) {
		Passenger c=hibernateTemplate.get(Passenger.class, passId);
		return c;
	}

}
