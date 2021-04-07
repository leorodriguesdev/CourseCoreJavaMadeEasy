package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;

public class Test {

	public static void main(String[] args) {
		
		Organizer organizer = new Organizer();
		organizer.id = (long) 1231;
		organizer.name = "Apple Inc";
		
		System.out.println(organizer);
		System.out.println(organizer.name);
		
		Event event = new Event();
		event.id = (long) 4561;
		event.name = "Iphone 100 Launch";
		event.description = "Grand Launch";
		
		System.out.println(event.description);
		
	}

}
