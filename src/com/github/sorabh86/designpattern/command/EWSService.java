package com.github.sorabh86.designpattern.command;

// This class is the receiver.
// This class represent a service which contact to exchange server
public class EWSService {
	
	//Add a new member to mailing list
	public void addMember(String contact, String contactGroup) {
		//contact exchange
		System.out.println("Added "+ contact + " to "+contactGroup);
	}
	
	//Remove member from mailing list
	public void removeMember(String contact, String contactGroup) {
		//contact exchange
		System.out.println("Removed "+contact+" from "+contactGroup);
	}
}
