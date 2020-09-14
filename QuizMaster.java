package com.training.quizmania;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class QuizMaster {

//	private static Question qs[] = new Question[3];
	private static ArrayList<Question> qs = new ArrayList<Question>();
	private static int score = 0;

	public static int getScore() {
		return score;
	}

	public static void display(int index) {
		if (index < 3 && index >= 0) {
			System.out.println(qs.get(index).getQuestion());
			System.out.println(qs.get(index).getOp1());
			System.out.println(qs.get(index).getOp2());
			System.out.println(qs.get(index).getOp3());
			System.out.println(qs.get(index).getOp4());
		} else {
			System.out.println("Question index out of bounds");
		}
	}

	public static boolean checkAns(int index, int ans) {
		if (ans == qs.get(index).getAns()) {
			score++;
			return true;
		}
		return false;
	}

	public static void readObjects() throws FileNotFoundException, IOException, ClassNotFoundException {
//		ObjectInputStream ois = null;//new ObjectInputStream(new FileInputStream("quiz.ser"));
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("quiz.txt"));
		while (true) {
			System.out.println("he");
			
			Question temp = null;
			try {
				temp = (Question) ois.readObject();
				System.out.println("dskl");
//				ois.close();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (temp != null) {
				qs.add(temp);
				System.out.println(temp);
			} else {
				break;
			}
		}

//		ois.close();
		return;

	}

	public static void load() {
		try {
			readObjects();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		load();
	}
}
