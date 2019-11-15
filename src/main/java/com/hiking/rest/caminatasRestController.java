package com.hiking.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hiking.entities.Caminata;

@RestController
public class caminatasRestController {
	


//    @RequestMapping("/caminatas")
    @RequestMapping(value = "/caminatas", method = RequestMethod.GET, produces = "application/json")
    public String  getAllcaminatas() {
    	List<Caminata> allcaminatas = new ArrayList<>();
    	ObjectMapper mapper = new  ObjectMapper();
    	mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
    	Caminata cam1 = new Caminata("caminata1","descripcion cam1",UUID.randomUUID(),"5KM");
    	Caminata cam2 = new Caminata("caminata2","descripcion cam2",UUID.randomUUID(),"5KM");
    	Caminata cam3 = new Caminata("caminata3","descripcion cam3",UUID.randomUUID(),"5KM");
    	allcaminatas.add(cam1);
    	allcaminatas.add(cam2);
    	allcaminatas.add(cam3);
    	String jsonCaminataList ="";
		try {
			jsonCaminataList = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(allcaminatas);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
        return jsonCaminataList;
    }
    
    @RequestMapping("/caminatasbyid")
    public String  getAllcaminatasById(@RequestParam(value="id", defaultValue="0") String idCaminata) {
    	ObjectMapper mapper = new  ObjectMapper();
    	mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
     	Caminata cam1 = new Caminata("caminata1","descripcion cam1",UUID.randomUUID(),idCaminata);
     	String jsonCaminataList ="";
		try {
			jsonCaminataList = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(cam1);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
        return jsonCaminataList;
    }
    		
    

}
