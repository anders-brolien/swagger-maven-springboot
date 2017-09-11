package eu.brolien.springboot;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "Zone", description = "bllblb")
public class Zone {
	@JsonProperty("id")	
	private String id;

	@JsonProperty("polygon")
	private Polygon polygon;

	@JsonProperty("name")
	private Polygon name;

	
}
