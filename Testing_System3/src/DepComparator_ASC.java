import java.util.Comparator;

public class DepComparator_ASC implements Comparator<Department> {

	@Override
	public int compare(Department depart1, Department depart2) {
		if (depart1.departmentName.compareTo(depart2.departmentName) < 0) {
			return -1;
		} else if (depart1.departmentName.compareTo(depart2.departmentName) > 0) {
			return 1;
		}	else {
			return 0;
		}
	}
}
