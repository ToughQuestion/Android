package com.toughquestion.ecstasy.model;

import java.util.Date;

public class Event extends PersistentObject {
	private int id;
	private int location_id;
	private float lat;
	private float lng;
	private String name;
	private String desc;
	private Date start;
	private Date end;
}
