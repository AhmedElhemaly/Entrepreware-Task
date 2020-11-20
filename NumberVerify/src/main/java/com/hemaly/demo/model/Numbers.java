package com.hemaly.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Numbers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	boolean valid; 
	String number;
	String local_format;
	String international_format;
	String country_prefix;
	String country_code;
	String country_name;
	String location;
	String carrier;
	String line_type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getLocal_format() {
		return local_format;
	}
	public void setLocal_format(String local_format) {
		this.local_format = local_format;
	}
	public String getInternational_format() {
		return international_format;
	}
	public void setInternational_format(String international_format) {
		this.international_format = international_format;
	}
	public String getCountry_prefix() {
		return country_prefix;
	}
	public void setCountry_prefix(String country_prefix) {
		this.country_prefix = country_prefix;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getLine_type() {
		return line_type;
	}
	public void setLine_type(String line_type) {
		this.line_type = line_type;
	}
	@Override
	public String toString() {
		return "Numbers [id=" + id + ", valid=" + valid + ", number=" + number + ", local_format=" + local_format
				+ ", international_format=" + international_format + ", country_prefix=" + country_prefix
				+ ", country_code=" + country_code + ", country_name=" + country_name + ", location=" + location
				+ ", carrier=" + carrier + ", line_type=" + line_type + "]";
	}	
}
