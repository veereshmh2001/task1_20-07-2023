package com.xworkz.singerSpring.dto;

import java.util.Date;

import lombok.Data;

@Data
public class SingerDTO {

	private String name;
	private String sname;
	private String composer;
	private String language;
	private String album;
	private Date release;
	private String lyricist;
	private String producer;
	private String director;

}
