classDiagram
    class Add_Sungjuk_UI <<boundary>> {
        +성적입력_화면()
    }

    class Search_Sungjuk_UI <<boundary>> {
        +학점조회_화면()
    }

    class 교수 {
        +교수id : String
        +교수체크(id : String) : boolean
    }

    class 성적 {
        +학생id : String
        +자바 : int
        +DB : int
        +보안 : int
        +총점 : int
        +평균 : double
        +성적입력(교수id: String, 학생id: String, 자바: int, DB: int, 보안: int)
        +학점조회(교수id: String) : String
    }

    Add_Sungjuk_UI ..> 교수 : 교수체크 요청
    Add_Sungjuk_UI ..> 성적 : 성적저장 요청
    Search_Sungjuk_UI ..> 교수 : 교수체크 요청
    Search_Sungjuk_UI ..> 성적 : 데이터조회 요청