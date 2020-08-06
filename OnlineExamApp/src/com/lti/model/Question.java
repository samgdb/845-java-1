package com.lti.model;

import java.util.List;

public class Question {
	private String question;
	private Difficulty difficultyLevel;
	private List<Option> options;
	
	public static enum Difficulty{ 
		//INNER enum/class
		//enum used to hold possible values
		EASY, MEDIUM, HARD;
	}
	public Question() {
	}

	public Question(String question, Difficulty difficultyLevel) {
		super();
		this.question = question;
		this.difficultyLevel = difficultyLevel;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Difficulty getDifficultyLevel() {
		return difficultyLevel;
	}

	public void setDifficultyLevel(Difficulty difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}
	
	
}
