package Score;

public class 교수 {
    /**
     * 입력받은 id가 고정된 값인 "inha"와 일치하는지 확인한다.
     */
    public boolean 교수체크(String 교수id) {
        // 순차도 설계에 따라 "inha"일 경우 true를 반환
        return "inha".equals(교수id);
    }
}