<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="Score.교수" %>
<%@ page import="Score.성적" %>
<%
    // 1. 정적 데이터 설정 (순차도 입력 매개변수 값)
    String 교수id = "inha"; 
    String 학생id = "S20260513";
    int 자바 = 85, DB = 80, 보안 = 75; // 평균 80점 (B 학점 대상)

    교수 교 = new 교수();
    성적 성 = new 성적();

    // --- [시나리오 1: 성적 입력] ---
    // 순차도: UI -> 교: 교수체크 호출
    boolean 체크결과 = 교.교수체크(교수id);

    if (체크결과) {
        // 순차도 alt: 성공 시 성적입력 호출
        성.성적입력(학생id, 자바, DB, 보안);
        // 결과 텍스트만 출력
        out.print("성적 입력 처리 완료<br>");
    } else {
        out.print("교수 인증 실패<br>");
    }

    // --- [시나리오 2: 학점 조회] ---
    // 순차도: UI -> 교: 교수체크 호출
    if (교.교수체크(교수id)) {
        // 순차도 alt: 성공 시 학점조회 호출
        String 학점결과 = 성.학점조회(학생id);
        out.print("학점 조회 결과: " + 학점결과);
    } else {
        out.print("교수 인증 실패");
    }
%>