package restExample.Services;

import java.util.List;

import restExample.Bean.Passenger;
public interface PassengerOperations {
	
	int addPassenger(Passenger e);
	
	public List<Passenger> getPassenger();

	public boolean deletePassenger(int id);

	public Passenger displayPassenger(int id);
	
	
	public void updateExistingPassenger(Passenger e);

}
