import java.util.Scanner;

public class TestCode {

	public static void main(String[] args) {
		String[] grName = { "Java", "C#", "Python", "Unity" };
		Group[] DSgroup = new Group[grName.length];

		for (int i = 0; i < DSgroup.length; i++) {
			DSgroup[i] = new Group();
			DSgroup[i].groupId = (i + 1);
			DSgroup[i].groupName = grName[i];

		}
		for (Group group : DSgroup) {
			if (group.groupName.equals("Java")) {
				System.out.println(group);
			}
		}
	}
}