package com.training.quizmania;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class QuizGenerator {

	public static void writeObject(ArrayList<Question> qs) {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("quiz.txt", true));
			for (Question q : qs) {
				oos.writeObject(q);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		ArrayList<Question> qs = new ArrayList<Question>();
		qs.add(new Question("How many fingers do people usually have", "12", "10", "13", "11", 2));
		qs.add(new Question("How many mouth do people usually have", "1", "10", "13", "11", 1));
		qs.add(new Question("How many head do people usually have", "1", "10", "13", "11", 1));

		writeObject(qs);

	}

}
