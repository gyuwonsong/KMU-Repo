package score.course;

public class MathScore implements Comparable<MathScore> {
	String name;
	int score;

	public MathScore(String name, int score) {				  //  (02-1)  ä���ֱ�
        this.name = name;
        this.score = score;
    }                                                  

	@Override
	public int compareTo(MathScore e) {
		return Integer.compare(score, e.score);              //  (02-1)  ä���ֱ�
	}

	@Override
	public String toString() {
		return this.name + ", " + this.score;                //  (02-1)  ä���ֱ�
	}
}


