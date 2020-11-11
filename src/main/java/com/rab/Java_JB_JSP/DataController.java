package com.rab.Java_JB_JSP;

import java.util.*;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/DataController", consumes="application/json")
public class DataController {
	private static List<Data> datas = new ArrayList<Data>(); // Using list to store all the data passed into API.
	@PostMapping(produces=MediaType.APPLICATION_JSON)
	public String Data(@RequestBody Data data) // Here, class Data will handle all JSON data and map columns accordingly.
	{
		datas.add(data);
		return "{\"Status\":\"Data recorded\"}";
	}
	public List<Data> GetData()
	{
		return datas; // I am simply passing all objects in our List<Data>. Ideally this should not be case but for the time being its fine to return.
	}
}
