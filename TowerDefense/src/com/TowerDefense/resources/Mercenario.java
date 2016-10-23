package com.TowerDefense.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/mercenarios")
public class Mercenario {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String enviarPlainMercenarios(){
		return "Mercenario plain";
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String enviarXMLMercenarios(){
		return "<?xml version\"1.0\"?>" + "<orcos> Mercenarios xml" + "</orcos>";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String enviarHTMLMercenarios(){
		return "<html>" + "<title>" + "Mercenarios" + "</title>"
		+ "<body><h1>" + "Mercenarios html" + "</body></h1>" + "</html";
	}
}
