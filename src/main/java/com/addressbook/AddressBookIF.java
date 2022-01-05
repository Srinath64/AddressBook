package com.addressbook;

import java.util.List;

public interface AddressBookIF {

    public void operation();

    public void addContact();

    public void displayContents();

    public void editPerson();

    public void deletePerson();

    public void addPersonToCity(ContactPerson contact);

    public void addPersonToState(ContactPerson contact);

    public void printSortedList(List<ContactPerson> sortedContactList);

    public void sortAddressBook(int sortingChoice);

}