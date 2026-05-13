<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="Score.교수" %>
<%@ page import="Score.성적" %>
<%
    교수 교 = new 교수();
    성적 성 = new 성적();

    // 요구사항: 반드시 교수id를 체크한다 ("inha")
    if (교.교수체크("inha")) {
        
        // 1. 성적입력 호출 (요청하신 정적 데이터 직접 전달)
        성.성적입력("inha", "20260513", 95, 88, 76);
        
        // 2. 학점조회 호출 및 결과 출력
        String 학점 = 성.학점조회("inha");
        
        // 출력 포맷: 총점, 평균, 학점만 표시
        
        out.print("학점: " + 학점);
        
    } else {
        out.print("교수 인증 실패");
    }
%>