package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class History {
	private int seq;
	private int yourAnswer;
	private String result;
	public History(int seq, int yourAnswer, String result) {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getYourAnswer() {
		return yourAnswer;
	}
	public void setYourAnswer(int yourAnswer) {
		this.yourAnswer = yourAnswer;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}
