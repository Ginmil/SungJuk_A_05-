package Score;

public class 성적 {
    private String 학생id;
    private int 자바;
    private int DB;
    private int 보안;
    private int 총점;
    private double 평균;

    /**
     * 성적을 입력하고 총점 및 평균을 계산한다.
     */
    public String 성적입력(String 학생id, int 자바, int DB, int 보안) {
        this.학생id = 학생id;
        this.자바 = 자바;
        this.DB = DB;
        this.보안 = 보안;

        // 총점 및 평균 계산 수행
        this.총점 = 자바 + DB + 보안;
        this.평균 = (double) 총점 / 3.0;

        return "성적 입력 성공 (총점: " + 총점 + ", 평균: " + String.format("%.2f", 평균) + ")";
    }

    /**
     * 점수 기반으로 학점을 부여한다.
     */
    public String 학점조회() {
        String 학점;
        // A: 90이상, B: 80이상, C: 80미만
        if (평균 >= 90) {
            학점 = "A 학점";
        } else if (평균 >= 80) {
            학점 = "B 학점";
        } else {
            학점 = "C 학점";
        }
        return 학점;
    }
}