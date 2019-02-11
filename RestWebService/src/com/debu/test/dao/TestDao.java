package com.debu.test.dao;

import java.util.HashMap;
import java.util.Map;

import com.debu.test.Responses;
import com.debu.test.exception.StringNotFoundException;

public class TestDao {
	Map<String, Responses> maps = new HashMap<String, Responses>();

	public TestDao() {
	
		maps.put("abyc", new Responses("abyc", TestDao.eliminate("abyc")));
		maps.put("ba", new Responses("ba", TestDao.eliminate("ba")));	
		maps.put("ef", new Responses("ef",TestDao.eliminate("ef")));
		maps.put("xyzosmnqst", new Responses("xyzosmnqst", TestDao.eliminate("xyzosmnqst")));
	}

	public Map<String, Responses> getMapResponse(){
		return maps;
	}
public static String eliminate(String input) {
		
		char charstr[]=input.toLowerCase().toCharArray();
		String output="";
		int leng=charstr.length;
		for (int i = 0; i < leng; i++) {
		int currentAsciicode=Character.getNumericValue(charstr[i]);
		//assign previous character only if the current character is not the first characted, else set to 0
		int previousAsciicode=i!=0?Character.getNumericValue(charstr[i-1]):0;
		//assign next character only if the current character is not the last characted, else set to 0
		int nextasciicode=i!=leng-1?Character.getNumericValue(charstr[i+1]):0;
		//if the current character is in the middle, check sequence with both previous and next character
		if((currentAsciicode==previousAsciicode+1)||(currentAsciicode==nextasciicode-1)){
			continue;}
		output+=charstr[i];
		}
		return output;

	}
}
