package com.vti.entity;

import java.util.ArrayList;

public abstract class Phone {
	public ArrayList<Contact> contacts = new ArrayList<Contact>();

	public Phone() {
	}

	abstract void insertContact(String name, String phone);

	abstract void removeContact(String name);

	abstract void updateContact(String name, String newPhone);

	abstract void searchContact(String name);

}
