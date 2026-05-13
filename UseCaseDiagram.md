```mermaid

graph LR
    %% Actor 정의
    Professor((교수))

    %% System Boundary 및 Use Cases
    subgraph "성적 관리 시스템"
        InputGrade(성적입력)
        CheckProfessor(교수체크)
        ViewGrade(학점조회)
    end

    %% Relationships
    Professor --> InputGrade
    Professor --> ViewGrade

    %% Include 관계 (반드시 실행되어야 함)
    InputGrade -.->|"<<include>>"| CheckProfessor
    ViewGrade -.->|"<<include>>"| CheckProfessor

    %% 스타일 설정
    style CheckProfessor fill:#f9f,stroke:#333,stroke-width:2px