package es.vass.pets.polymer.web.rest;

import javax.annotation.security.RolesAllowed;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.vass.pets.polymer.security.AuthoritiesConstants;

@RestController
@RequestMapping("/api")
public class GraphicsResource {

	@RequestMapping(path = "/graphicData", method = RequestMethod.GET)
	@RolesAllowed(value = AuthoritiesConstants.ADMIN)
	public ResponseEntity<Integer> getPoint() {
		Integer point = 0 + (int)(Math.random() * 25);
		return new ResponseEntity<Integer>(point, HttpStatus.OK);
	}
}
