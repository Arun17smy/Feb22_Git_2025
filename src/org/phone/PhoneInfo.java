package org.phone;

public class PhoneInfo {
	
	public void phoneName() {
		System.out.println("VIVO V25");
	}
	
	public void phoneImeiNum() {
		System.out.println("514576547000801");
	}
	
	public void camera() {
		System.out.println("64MP");
	}
	
	public void storage() {
		System.out.println("128GB");
	}
	
	public void osName() {
		System.out.println("FuntouchOS");
	}
	
	public static void main(String[] args) {
		PhoneInfo p = new PhoneInfo();
		p.phoneName();
		p.phoneImeiNum();
		p.camera();
		p.storage();
		p.osName();
	}
}
