// Kristina Shaw
// CS 176L
// Interface Version 1

public class Quiz implements Measurable
{
	private int score;
	
	  //  Constructs a quiz object with a score.
	
	 public Quiz(int quizScore)
	 {
	    score = quizScore;
	 }
	 
	 public double getMeasure()
	 {
	    return score;
	 }
}