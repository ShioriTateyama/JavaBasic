package practice14.common;

public class DBCourse implements Course{
	/*
	 * ★ common.Courseを実装した、DBCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】DB基礎」
	 * 単元
	 * 		DB基礎
	 * 		SQL基礎
	 * 		正規化
	 * 		SQL応用
	 */

	private String courseName="「【Eラーニング】DB基礎」";
	private String[] courseUnit= {"DB基礎","SQL基礎","正規化","SQL応用"};



	public String getCourseName() {
		return this.courseName;

	}
	public String[] getCourseUnit() {
		return this.courseUnit;
	}
}
