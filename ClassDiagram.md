classDiagram

&#x20;   class Add\_Sungjuk\_UI <<boundary>> {

&#x20;       +성적입력\_화면()

&#x20;   }



&#x20;   class Search\_Sungjuk\_UI <<boundary>> {

&#x20;       +학점조회\_화면()

&#x20;   }



&#x20;   class 교수 {

&#x20;       +교수id : String

&#x20;       +교수체크(id : String) : boolean

&#x20;   }



&#x20;   class 성적 {

&#x20;       +학생id : String

&#x20;       +자바 : int

&#x20;       +DB : int

&#x20;       +보안 : int

&#x20;       +총점 : int

&#x20;       +평균 : double

&#x20;       +성적입력(교수id: String, 학생id: String, 자바: int, DB: int, 보안: int)

&#x20;       +학점조회(교수id: String) : String

&#x20;   }



&#x20;   Add\_Sungjuk\_UI ..> 교수 : 교수체크 요청

&#x20;   Add\_Sungjuk\_UI ..> 성적 : 성적저장 요청

&#x20;   Search\_Sungjuk\_UI ..> 교수 : 교수체크 요청

&#x20;   Search\_Sungjuk\_UI ..> 성적 : 데이터조회 요청

