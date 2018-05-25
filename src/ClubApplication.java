import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClubApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Person p1 = new Member("Tan", "Ah", "Beng", 123456);
//		Person p2 = new Member("Stan", "Laurel", 123457);		
//		p1.show();
//		p2.show();
		
//		Facility f1 = new Facility("Football Court 1", "Full-sized football court for league matches");
//		Facility f2 = new Facility("Basketball Court 1");		
//		f1.show();
//		f2.show();
		
		Club c = new Club();
		
		c.addMember("Chan", "Ah","Ming");
		c.addMember("Tan", "Ah","Ling");
		c.addMember("Wan", "Ah","King");
		c.addMember("Ran", "Ah","Ping");
//		c.removeMember(2);
//		c.removeMember(3);
//		c.showMembers();
		
		c.addFacility("Football Court 1", "Full-sized football court for league matches");
		c.addFacility("Basketball Court 1", "Full-sized basketball court for league matches");
		c.addFacility("Tennis Court 1", "Full-sized tennis court for league matches");
		c.addFacility("Badminton Court 1", "Full-sized badminton court for league matches");
		
//		Facility f = c.getFacility("Tennis Court 1");
//		f.show();
		
//		c.removeFacility("Tennis Court 1");
//		c.removeFacility("Badminton Court 1");
//		c.showFacilities();
		
//		c.show();
		
		Member m1 = c.getMember(1);
		Member m2 = c.getMember(2);
		Member m3 = c.getMember(3);
		Member m4 = c.getMember(4);
//		Member m5 = c.getMember(5);
		
//		c.show();
//		c.sortByMemNumber();
//		c.show();
		
		Facility f1 = c.getFacility("Football Court 1");
		Facility f2 = c.getFacility("Basketball Court 1");
		Facility f3 = c.getFacility("Tennis Court 1");
		Facility f4 = c.getFacility("Badminton Court 1");
//		Facility f5 = c.getFacility("Squash Court 1");
		
		LocalDateTime d1 = LocalDateTime.of(2018, 1, 12, 12, 00);
		LocalDateTime d2 = LocalDateTime.of(2018, 2, 11, 12, 00);
		LocalDateTime d3 = LocalDateTime.of(2018, 3, 10, 12, 00);
//		LocalDateTime d5 = null;
		
//		try {
//			Booking b1 = new Booking(m1, f1, d1, d2);
//		} catch (BadBookingException e) {
//			System.out.println(e.getMessage());
//		}
	
//		try {
//			Booking b1 = new Booking(m5, f1, d1, d2);
//		} catch (BadBookingException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		try {
//			Booking b2 = new Booking(m2, f5, d2, d3);
//		} catch (BadBookingException e) {
//			System.out.println(e.getMessage());
//		}
		
//		try {
//			Booking b3 = new Booking(m3, f3, d5, d3);
//		} catch (BadBookingException e) {
//			System.out.println(e.getMessage());
//		}
		
//		try {
//			Booking b4 = new Booking(m4, f4, d1, d5);
//		} catch (BadBookingException e) {
//			System.out.println(e.getMessage());
//		}
		
//		try {
//			Booking b5 = new Booking(m4, f4, d3, d1);
//		} catch (BadBookingException e) {
//			System.out.println(e.getMessage());
//		}
		
//		BookingRegister br1 = new BookingRegister();
//		try {
//			br1.addBooking(m1, f1, d1, d2);
//		} catch (BadBookingException e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//			br1.addBooking(m1, f1, d1, d2);
//		} catch (BadBookingException e) {
//			System.out.println(e.getMessage());
//		}
		
//		try {
//			c.addBooking(1, "Basketball Court 1", d1, d3);
//		} catch (BadBookingException e) {
//			System.out.println(e.getMessage());
//		}
		
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d-MMM-yyyy H:mm");
//		LocalDateTime d = LocalDateTime.of(2018, 1, 12, 12, 00);
//		System.out.println(d.format(dtf));
		
		c.show();
		
		c.addBooking(2, "Football Court 1", d1, d2);
		c.addBooking(3, "Football Court 1", d1, d3);
		c.addBooking(4, "Basketball Court 1", d3, d2);
		c.showBookings("Football Court 1", d1, d3);
		
//		try {
//			Booking b = new Booking(m1, f1, d1, d2);
//			b.show();
//		} catch (BadBookingException e) {
//			System.out.println(e.getMessage());
//		}
	}

}
