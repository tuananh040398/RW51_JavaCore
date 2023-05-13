package com.vti.entity;

public class VietnamesePhone extends Phone {

	@Override
	public void insertContact(String name, String phone) {
		Contact newcContact = new Contact();
		newcContact.name = name;
		newcContact.phone = phone;

		this.contacts.add(newcContact);
	}

	@Override
	public void removeContact(String name) {
		for (int i = 0; i < this.contacts.size(); i++) {
			if (this.contacts.get(i).name.equals(name)) {
				this.contacts.remove(i);
			}
		}

	}

	@Override
	public void updateContact(String name, String newPhone) {
		for (int i = 0; i < this.contacts.size(); i++) {
			Contact updContact = this.contacts.get(i);
			if (updContact.name.equals(name)) {
				updContact.phone = newPhone;
			}
		}
	}

	@Override
	public void searchContact(String name) {
		for (int i = 0; i < this.contacts.size(); i++) {
			Contact contact = this.contacts.get(i);
			if (contact.name.equals(contact)) {
				System.out.println(contact.phone);
			}
		}

	}

	public void printContact() {
		for (Contact contact : contacts) {
			System.out.println(contact);
		}
	}
}
