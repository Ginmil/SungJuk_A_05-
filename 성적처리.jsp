<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="Score.교수" %>
<%@ page import="Score.성적" %>
<%
    // 정적 데이터 설정
    String 교수id = "inha";
    int 자바 = 85, DB = 80, 보안 = 75; // 평균 80으로 B학점 예시

    교수 교 = new 교수();
    성적 성 = new 성적();

    // 순차도 로직: 교수체크 후 처리
    if (교.교수체크(교수id)) {
        성.성적입력(자바, DB, 보안);
        out.print("학점 조회 결과: " + 성.학점조회());
    } else {
        out.print("교수 인증 실패");
    }
%>