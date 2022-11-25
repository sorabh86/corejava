package com.github.sorabh86.designpattern.command;

// A concreate implementatiion of Command
public class AddMemberCommand implements Command {
	
	private String emailAddress;
	private String groupName;
	
	private EWSService receiver;
	
	public AddMemberCommand(String emailAddress, String groupName, EWSService receiver) {
		this.emailAddress = emailAddress;
		this.groupName = groupName;
		this.receiver = receiver;
	}

	// Service that we are using
	// we can locate using facilities of the container, it is running at runtime
	// If running on java enterprise container, we can use JNDI, also have CDI
	// If running on spring container IOC, we can use ApplicationContext to get hold of beans we need.
	@Override
	public void execute() {
		receiver.addMember(emailAddress, groupName);
	}

}
