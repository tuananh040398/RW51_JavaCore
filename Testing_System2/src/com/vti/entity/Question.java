package com.vti.entity;
import java.time.LocalDateTime;

public class Question {
	int questionId;
	String content;
	CategoryQuestion categoryQuestion;
	TypeQuestion typeQuestion;
	Account creator;
	LocalDateTime createDate;
}
