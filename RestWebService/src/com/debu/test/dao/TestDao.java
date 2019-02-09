package com.debu.test.dao;

import java.util.HashMap;
import java.util.Map;

import com.debu.test.Responses;
import com.debu.test.exception.StringNotFoundException;



public class TestDao {
	Map<String, Responses> maps = new HashMap<String, Responses>();

	public TestDao() {
	
		maps.put("abyc", new Responses("abyc", "yc"));
		maps.put("ba", new Responses("ba", "ba"));	
		maps.put("ef", new Responses("ef", ""));
		maps.put("xyzosmnqst", new Responses("xyzosmnqst", "osq"));
	}

	public Map<String, Responses> getMapResponse(){
		return maps;
	}
}
