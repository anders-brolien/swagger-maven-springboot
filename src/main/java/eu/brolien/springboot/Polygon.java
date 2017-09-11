package eu.brolien.springboot;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "Polygon", description = "the shape of the zone")
public class Polygon {
	
	@JsonProperty("points")
	private List<Point> points;

}
