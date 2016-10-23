package com.TowerDefense.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/harpias")
public class Harpias {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String enviarPlainHarpias(){
		return "Harpias plain";
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String enviarXMLHarpias(){
		return "<?xml version\"1.0\"?>" + "<orcos> Harpias xml" + "</orcos>";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String enviarHTMLHarpias(){
		return "<html>" + "<title>" + "Harpias" + "</title>"
		+ "<body><h1>" + "Harpias html" + "</body></h1>" + "</html";
	}
}
