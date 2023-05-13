import java.time.LocalDateTime;

public class Group {
	int groupId;
	String groupName;
	LocalDateTime createDate;
	Account[] accounts;
	
	@Override
	public String toString() {
		String thongtin = groupId + " - " + groupName;
		return thongtin;
}
}