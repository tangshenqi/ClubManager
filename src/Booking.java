import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Booking {
	
	private Member member;
	private Facility facility;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	
	public Booking(Member m, Facility f, LocalDateTime s, LocalDateTime e) 
			throws BadBookingException 
	{
		this.member = m;
		this.facility = f;
		this.startDate = s;
		this.endDate = e;
		
		if (this.member == null)
			throw new BadBookingException("Member not exist");
		if (this.facility == null)
			throw new BadBookingException("Facility not exist");
		if (this.startDate == null)
			throw new BadBookingException("Start Date not chosen");
		if (this.endDate == null)
			throw new BadBookingException("End Date not chosen");
		if (this.startDate.compareTo(this.endDate) > 0)
			throw new BadBookingException("Start Date cannot be later than End Date");
	}

	public Member getMember() {
		return member;
	}

	public Facility getFacility() {
		return facility;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}
	
	public boolean overlaps(Booking b) {
		boolean isOverlap = false;
		if (this.facility.getName().equals(b.facility.getName())) {
			if (!(this.endDate.compareTo(b.startDate) < 0 || this.startDate.compareTo(b.endDate) > 0)) {
				isOverlap = true;
			}
		}
		return isOverlap;
	}
	
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d-MMM-yyyy H:mm");
		String sd = startDate.format(dtf);
		String ed = endDate.format(dtf);
		String s = member.toString() + "\n" + facility.getName() + "\n" 
	+ sd + " to " +  ed;
		return s;
	}
	
	public void show() {
		System.out.println(this);
	}

}
