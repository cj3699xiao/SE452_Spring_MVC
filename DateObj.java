
public class DateObj {
	
	private int year;
	private int month;
	private int day;
	private int[] monthLengths = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public DateObj(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		validate();
	}


	public DateObj nextDate() {
		// TODO: return the next valid date after this one
		return null;
	}

	@Override
	public String toString() {
		return String.format("Date[year: %d, month: %d, day: %d]", year, month, day);
	}

	private void validate() {
		// TODO: throw an exception if the current values of year, month and day do not
		//       make a valid date
	}

}
