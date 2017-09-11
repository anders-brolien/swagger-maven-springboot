package eu.brolien.springboot;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@Api(value = "/zones")
@RestController("/zones")
public interface ZoneHandler {

	@ApiOperation(value = "getZones", nickname = "getZones")
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Zone.class, responseContainer = "List"),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure") })
	public List<Zone> getZones(@RequestParam(value = "geoFilter", required = false) @ApiParam(name = "GML string ") String geoFilter);

	@ApiOperation(value = "addZone", nickname = "addZone")
	@RequestMapping(method = RequestMethod.POST, produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure") })
	public String addZone(@RequestParam(value = "zone", required = true) @ApiParam(name = "The zone to add") Zone zone);

	
	
}
