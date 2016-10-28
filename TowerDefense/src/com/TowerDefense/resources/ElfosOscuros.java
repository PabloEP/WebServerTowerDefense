package com.TowerDefense.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/elfososcuros")
public class ElfosOscuros {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String enviarPlainElfosOscuros(){
		return "Elfos Oscuros plain";
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String enviarXMLElfosOscuros(){
		return "<?xml version\"1.0\"?>" + "<orcos> Elfos Oscuros xml" + "</orcos>";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String enviarHTMLElfosOscuros(){
		return "<html>" + "<title>" + "Elfos Oscuros" + "</title>"
		+ "<body><h1>" + "Elfos Oscuros html" + "</body></h1>" + "</html";
	}	
	
}
