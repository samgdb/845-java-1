package com.lti.model;

import java.util.ArrayList;
import java.util.List;

import com.lti.model.Question.Difficulty;

public class QuestionBankLoader {

	public List<Question> loadQuestionsOnJava() {
		String subjectName = "Java";
		
		QuestionBank qb = new QuestionBank();
		qb.addNewSubject(subjectName);
		
		Question q = new Question("What is Java?", Difficulty.EASY);
		List<Option> ops = new ArrayList<Option>();
		ops.add(new Option("Java is a Database",false));
		ops.add(new Option("Java is a Programming Language",true));
		ops.add(new Option("Java is an OS",false));
		ops.add(new Option("Java is a filesystem",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("What is G1", Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("Garbage collector",true));
		ops.add(new Option("english word for Jeevan",false));
		ops.add(new Option("Spy agency",false));
		ops.add(new Option("Sequel of SRK's Ra.One",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("What is Pyhton", Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("Programming language",true));
		ops.add(new Option("snake",false));
		ops.add(new Option("spy",false));
		ops.add(new Option("toy",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("What is G1", Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("Garbage collector",true));
		ops.add(new Option("english word for Jeevan",false));
		ops.add(new Option("Spy agency",false));
		ops.add(new Option("Sequel of SRK's Ra.One",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("What is G1", Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("Garbage collector",true));
		ops.add(new Option("english word for Jeevan",false));
		ops.add(new Option("Spy agency",false));
		ops.add(new Option("Sequel of SRK's Ra.One",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		return qb.getQuestionsFor(subjectName);
	}
}
