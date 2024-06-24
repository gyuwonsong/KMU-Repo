package score.course;

public class EnglishScore implements Comparable<EnglishScore> {
	String name;
	int score;

	public EnglishScore(String name, int score) {			  //   (01-1)  ä���ֱ�
        this.name = name;
        this.score = score;
    }                                                 

	@Override
	public int compareTo(EnglishScore e) {
		return Integer.compare(score, e.score);              //  (01-2)  ä���ֱ�
	}

	@Override
	public String toString() {
		return this.name + ", " + this.score;               //  (01-1)  ä���ֱ�
	}
}