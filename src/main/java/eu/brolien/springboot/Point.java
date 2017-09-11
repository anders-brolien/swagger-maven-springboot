package eu.brolien.springboot;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "Point", description = "a point in WGS84")
public class Point {

	@JsonProperty("latitude")
	private final double latitude;
	@JsonProperty("longitude")
	private final double longitude;
	
	
	
	public Point(double latitude, double longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}



	@Override
	public String toString() {
		return "Point [latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	
	
	
	
	
}
