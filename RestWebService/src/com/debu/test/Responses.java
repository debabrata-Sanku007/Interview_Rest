package com.debu.test;

public class Responses {
	
	private String input;
	private String output;

	public Responses() {
	}

	public Responses( String input, String output) {
		super();
		
		this.input = input;
		this.output = output;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

}
