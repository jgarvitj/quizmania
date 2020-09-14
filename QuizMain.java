package com.training.quizmania;

public class QuizMain {

	public static void main(String[] args) {

		QuizMaster.load();

		for (int i = 0; i < QuizMaster.getQCount(); i++) {
			QuizMaster.setIndex(i);
			QuestionThread qt = new QuestionThread();
			Thread tqt = new Thread(qt);
			
			QuizMaster.display(i);
			tqt.start();
			try {
				tqt.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Score:" +  QuizMaster.getScore());
	}
}
