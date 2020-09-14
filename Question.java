package com.training.quizmania;

import java.io.Serializable;

public class Question implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String question;
	private String op1;
	private String op2;
	private String op3;
	private String op4;
	private int ans;

	public Question(String question, String op1, String op2, String op3, String op4, int ans) {
		this.question = question;
		this.op1 = op1;
		this.op2 = op2;
		this.op3 = op3;
		this.op4 = op4;
		this.ans = ans;
	}
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getQuestion() {
		return question;
	}


	public String getOp1() {
		return op1;
	}


	public String getOp2() {
		return op2;
	}


	public String getOp3() {
		return op3;
	}


	public String getOp4() {
		return op4;
	}


	public int getAns() {
		return ans;
	}


	@Override
	public String toString() {
		return "Question [question=" + question + ", op1=" + op1 + ", op2=" + op2 + ", op3=" + op3 + ", op4=" + op4
				+ ", ans=" + ans + "]";
	}

}
