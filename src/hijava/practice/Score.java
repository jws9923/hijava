package hijava.practice;

public class Score {
	private String subject;
	private int score;
	public String prof;

	public Score() {
	}

	public Score(String subject, int score) {
//		this.subject = subject;
		this.setSubject(subject);
		this.score = score;
	}

	public Score(String subject) {
//		this.subject = subject;
		this.setSubject(subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
			this.subject = "과목: " + subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Score [subject=" + subject + ", score=" + score + "]";
	}

}
