package com.TowerDefense.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/orcos")
public class Orcs {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String enviarPlainOrcos(){
		return "Orcos plain";
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String enviarXMLOrcos(){
		return "<?xml version\"1.0\"?>" + "<orcos> Orcos xml" + "</orcos>";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String enviarHTMLOrcos(){
		return "<html>" + "<title>" + "Orcos" + "</title>"
		+ "<body><h1>" + "Orcos html" + "</body></h1>" + "</html";
	}
}
