<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="Score.교수" %>
<%@ page import="Score.성적" %>
<%
    // 정적 데이터 설정
    String 교수id = "inha";
    String 학생id = "20260513";
    int 자바 = 95, DB = 88, 보안 = 76;

    교수 교 = new 교수();
    성적 성 = new 성적();

    // 1. 성적 입력 시나리오
    // 교수체크 호출
    if (교.교수체크(교수id)) {
        // 성공 시 성적입력 호출
        String 입력결과 = 성.성적입력(학생id, 자바, DB, 보안);
        out.print("성적 입력 결과: " + 입력결과 + "<br>");
    } else {
        out.print("교수 인증 실패<br>");
    }

    // 2. 학점 조회 시나리오
    // 교수체크 호출
    if (교.교수체크(교수id)) {
        // 성공 시 학점조회 호출
        String 학점결과 = 성.학점조회();
        out.print("학점 조회 결과: " + 학점결과);
    } else {
        out.print("교수 인증 실패");
    }
%>