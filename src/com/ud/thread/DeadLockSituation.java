package com.ud.thread;

public class DeadLockSituation {

	private String nish = "Nishanth";
	private String gopi = "Gopinath";
	
	Thread t1 = new Thread() {
		public void run() {
			while(true) {
				synchronized (nish) {
					synchronized (gopi) {
						System.out.println("Nish + Gopi = " + nish + " and " + gopi + " are programmers");
					}
				}
			}
		}
	};
	
	Thread t2= new Thread() {
		public void run() {
			while(true) {
				synchronized (gopi) {
					synchronized (nish) {
						System.out.println("Gopi + Nish = " + gopi + " and " + nish + " are programmers");
					}
				}
			}
		}
	};
	
	public static void main(String[] args) {
		DeadLockSituation dls = new DeadLockSituation();
		dls.t1.start();
		dls.t2.start();
	}

}
