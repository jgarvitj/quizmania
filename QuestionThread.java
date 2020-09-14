package com.training.quizmania;

import java.util.Scanner;

public class QuestionThread extends Thread {

	public void run() {

		CounterClass cc = new CounterClass();
		Thread tcc = new Thread(cc);
		tcc.start();

		Scanner scanner = new Scanner(System.in);
		while (true) {
//			System.out.println(Thread.currentThread().getName());
			try {
				Thread.currentThread();
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			if (scanner.hasNextInt()) {
				int answer = scanner.nextInt();
				scanner.close();
				try {
					tcc.join(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (QuizMaster.checkAns(QuizMaster.getIndex(), answer)) {
					return;
				} else {
					// if answer is wrong quiz will terminate due to exception
//					throw new RuntimeException();
				}
			}
			try {
				if (!tcc.isAlive()) {
					break;
//					scanner.close();
				}
//				throw new RuntimeException();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
