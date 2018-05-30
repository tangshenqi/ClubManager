import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Club {
	
	private static int currentNumber = 1;
//	private static Member[] members = new Member[100];
	private static ArrayList<Member> members = new ArrayList<Member>();
	private static HashMap<String, Facility> facilities = new HashMap<String, Facility>();
	// die die must create the object after declaring a variable, or NullPointerException will happen
    private BookingRegister bookingRegister = new BookingRegister();
    
    public void sortByMemNumber() {
    	for (int i = 0; i < members.size(); i++) {
    		for (int j = i; j < members.size(); j++) {
    			if (members.get(i).compareTo(members.get(j)) < 0) {
//    				Member mi = members.get(i);
//    				Member mj = members.get(j);
//    				members.set(i, mj);
//    				members.set(j, mi);
    				Collections.swap(members, i, j);
    			}
    		}
    	}
    }
    
    public void showBookings(String nameFacility, LocalDateTime sd, LocalDateTime ed) {
    	ArrayList<Booking> bookingList = getBookings(nameFacility, sd, ed);
    	for (int i = 0; i < bookingList.size(); i++) {
    		bookingList.get(i).show();
    	}
    }
    
    public ArrayList<Booking> getBookings(String nameFacility, LocalDateTime sd, LocalDateTime ed) {
    	Facility f = this.getFacility(nameFacility);
    	return bookingRegister.getBookings(f, sd, ed);
    }
    
    public void addBooking(int memberNumber, String nameFacility, LocalDateTime sd, LocalDateTime ed) {
    	Member m = this.getMember(memberNumber);
    	Facility f = this.getFacility(nameFacility);
//    	m.show();
//    	f.show();
//    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d-MMM-yyyy H:mm");
//    	System.out.println(sd.format(dtf));
//    	System.out.println(ed.format(dtf));
    	
//    	bookingRegister.addBooking(m, f, sd, ed);
    	
    	try {
			bookingRegister.addBooking(m, f, sd, ed);
		} catch (BadBookingException e) {
			System.out.println(e.getMessage());
		}
    }
	
//	public Member addMember(String surname, String firstName, String secondName) {
//		Member m = new Member(surname, firstName, secondName, currentNumber);
//		members[currentNumber - 1] = m;
//		currentNumber++;
//		return m;
//	}
	
	public void addMember(String surname, String firstName, String secondName) {
		Member m = new Member(surname, firstName, secondName, currentNumber);
		members.add(m);
		currentNumber++;
	}
	
//	public void showMembers() {
//		for (int i = 0; i < currentNumber - 1; i++)
//		{
//			if (members[i].getMemberNumber() != 0)
//			{
//				members[i].show();
//			}
//		}
//	}
	
	public void showMembers() {
		for (int i = 0; i < members.size(); i++)
		{
			members.get(i).show();
		}
	}
	
//	public void removeMember(int memberNumber) {
//		members[memberNumber - 1].setMemberNumber(0);
//	}
	
	public void removeMember(int memberNumber) {
		for (int i = 0; i < members.size(); i++)
		{
			if (members.get(i).getMemberNumber() == memberNumber)
				members.remove(i);
		}
	}
	
	public ArrayList<Member> getMembers() {
		return members;
	}
	
	public Member getMember(int memberNumber) {
		Member m = null;
		for (int i = 0; i < members.size(); i++)
		{
			if (members.get(i).getMemberNumber() == memberNumber) {
				m = members.get(i);
			}
		}
		return m;
	}
	
	public void addFacility(String name, String description) {
		Facility f = new Facility(name, description);
		facilities.put(name, f);
	}
	
	public void removeFacility(String name) {
		facilities.remove(name);
	}
	
	public Facility getFacility(String name) {
		Facility f = facilities.get(name);
		return f;
	}
	
	public Collection<Facility> getFacilities() {
		Collection<Facility> f = facilities.values();
		return f;
	}
	
	public void showFacilities() {
		Collection<Facility> f = facilities.values();
		Iterator<Facility> i = f.iterator();
		while (i.hasNext()) {
			Facility facility = i.next();
			facility.show();
		}
	}
	
	public void show() {
		showMembers();
		showFacilities();
	}

}
