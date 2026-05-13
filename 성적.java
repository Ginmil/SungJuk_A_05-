package Score;

/**
 * 순차도의 '성' 객체 역할을 하는 클래스
 */
public class 성적 {
    private String 학생id;
    private int 자바;
    private int DB;
    private int 보안;
    private int 총점;
    private double 평균;

    /**
     * 성적입력 호출 및 계산 수행
     */
    public String 성적입력(String 학생id, int 자바, int DB, int 보안) {
        this.학생id = 학생id;
        this.자바 = 자바;
        this.DB = DB;
        this.보안 = 보안;

        // 순차도 Note: 총점 및 평균 계산 수행
        this.총점 = 자바 + DB + 보안;
        this.평균 = (double) 총점 / 3.0;

        return "성적 입력 성공";
    }

    /**
     * 점수 기반 학점 부여 및 반환
     */
    public String 학점조회(String 학생id) {
        // 순차도 Note: A(90이상), B(80이상), C(80미만)
        String 학점;
        if (this.평균 >= 90) {
            학점 = "A 학점";
        } else if (this.평균 >= 80) {
            학점 = "B 학점";
        } else {
            학점 = "C 학점";
        }
        return 학점;
    }
}