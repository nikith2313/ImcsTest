package restExample.Services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restExample.Bean.Passenger;
import restExample.Dao.PassengerDao;

@Service
public class PassengerOperationImple implements PassengerOperations {

	@Autowired
	private PassengerDao ed;

	public int addPassenger(Passenger e) {
		// TODO Auto-generated method stub
		int id=	 ed.addPassenger(e);
		return id;
	}

	

	public boolean deletePassenger(int id) {
		// TODO Auto-generated method stub
		boolean b = ed.deletPassenger(id);
		return b;
	}






	public Passenger displayPassenger(int id) {
		// TODO Auto-generated method stub
		Passenger b = ed.findPassenger(id);
		return b;		
	}
		

	
	public void updateExistingPassenger(Passenger e) {
		ed.updatePassenger(e);
	}

	@Override
	public List<Passenger> getPassenger() {
		// TODO Auto-generated method stub
		List<Passenger> pass=ed.getAllPassenger();
		return pass;
	}

	

	}
