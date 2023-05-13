package com.vti.entity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Program2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student sv1 = new Student(1, "Nguyen Van A");
		Student sv2 = new Student(2, "Nguyen Van B");
		Student sv3 = new Student(3, "Nguyen Van C");
		
		Student[] dStudents = {sv1 , sv2, sv3};
		
		SaveStudentIntoFile(dStudents);
		
		ReadStudentFromFile();
	}

	public static void SaveStudentIntoFile( Student[] students) throws IOException  {
		String locationString = "C:\\Users\\Administrator\\Desktop\\Student.txt";
		
		FileOutputStream fos = new FileOutputStream(locationString);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		System.out.println("Daluu " + students.length + "sinh vien");
		
		oos.writeObject(students);
		oos.close();
	}
		
	
	public static void ReadStudentFromFile() throws IOException, ClassNotFoundException {
		String location = "C:\\Users\\Administrator\\Desktop\\Student.txt";
		
		FileInputStream fiStream = new FileInputStream(location);
		ObjectInputStream oiStream = new ObjectInputStream(fiStream);
		Student[] sv = (Student[])oiStream.readObject();
		oiStream.close();
		
		for (Student student : sv ) {
			System.out.println(student.toString());
		}
	}
	}

