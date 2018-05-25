
public class Member extends Person implements Comparable<Member> {
	
	private int memberNumber;
	
	public Member(String surname, String firstName, String secondName, int memberNumber) {
		super (surname, firstName, secondName);
		this.memberNumber = memberNumber;
	}
	
	public Member(String surname, String firstName, int memberNumber) {
		super (surname, firstName);
		this.memberNumber = memberNumber;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	
	public String toString() {
		String member;
		member = super.toString() + " " + this.memberNumber;
		return member;
	}
	
	public int compareTo (Member other) {
		return (Integer.compare(this.getMemberNumber(), other.getMemberNumber()));
	}
}
