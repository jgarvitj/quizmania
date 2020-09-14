package com.training.quizmania;

public class CounterClass extends Thread {

	public void run() {
		int i=0;
		while(i<20) {
			if(i % 5 == 0)
				System.out.println("in counter class->"+i);
			try {
				Thread.sleep(1000);
				i++;
			} catch (InterruptedException e) {
				break;
			}		
		}
	}
}
