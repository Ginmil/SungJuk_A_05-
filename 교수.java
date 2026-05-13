package Score;

/**
 * 순차도의 '교' 객체 역할을 하는 클래스
 */
public class 교수 {
    /**
     * 교수id를 체크한다.
     * @param 교수id 입력된 아이디
     * @return "inha"일 경우 true, 아니면 false
     */
    public boolean 교수체크(String 교수id) {
        // 순차도 설계: 교수id == "inha" (성공)
        return "inha".equals(교수id);
    }
}