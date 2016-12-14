/**
 * 
 */
package com.satish.springbean;

/**
 * @author satishr
 *
 */
public class HelloWorld {
	private String message1;
	private String message2;
	private String message4;

	public void setMessage1(String message) {
		this.message1 = message;
	}

	public void setMessage2(String message) {
		this.message2 = message;
	}
	
	public void setMessage4(String message) {
		this.message4 = message;
	}

	public void getMessage1() {
		System.out.println("World Message1 : " + message1);
	}

	public void getMessage2() {
		System.out.println("World Message2 : " + message2);
	}
	
	public void getMessage4() {
		System.out.println("World Message4 : " + message4);
	}
}
