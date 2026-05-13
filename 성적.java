package Score;

public class 성적 {
    private double 평균;

    // 성적입력 시 총점과 평균을 계산함
    public void 성적입력(int 자바, int DB, int 보안) {
        this.평균 = (자바 + DB + 보안) / 3.0;
    }

    // 학점 결과만 간단히 텍스트로 반환
    public String 학점조회() {
        if (평균 >= 90) return "A 학점";
        if (평균 >= 80) return "B 학점";
        return "C 학점";
    }
}