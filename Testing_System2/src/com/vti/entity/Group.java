package com.vti.entity;
import java.time.LocalDateTime;

public class Group {
	int groupId;
	String groupName;
	LocalDateTime createDate;
	Account[] accounts;
}
