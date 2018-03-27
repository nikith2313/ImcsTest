package restExample.Dao;

import java.util.List;

import restExample.Bean.Passenger;
public interface PassengerDao {

	public  int addPassenger(Passenger cust);
	public  List<Passenger> getAllPassenger();
	public  boolean deletPassenger(int custid);
	public  Passenger findPassenger(int passId);
	public void updatePassenger(Passenger passenger);
}
