package Score;

public class 성적 {
    private int 총점;
    private double 평균;

    /**
     * 순차도 8번 라인 기반: 성적입력(교수id, 학생id, 자바, DB, 보안)
     */
    public void 성적입력(String 교수id, String 학생id, int 자바, int DB, int 보안) {
        // 내부 로직: 총점 및 평균 계산 수행
        this.총점 = 자바 + DB + 보안;
        this.평균 = (double) 총점 / 3.0;
    }

    /**
     * 순차도 15번 라인 기반: 학점조회(교수id, 학생id)
     */
    public String 학점조회(String 교수id) {
        // 학점 부여 기준: A(90이상), B(80이상), C(80미만)
        if (평균 >= 90) return "A";
        if (평균 >= 80) return "B";
        return "C";
    }

    public int get총점() { return 총점; }
    public double get평균() { return 평균; }
}