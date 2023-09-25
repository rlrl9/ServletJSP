# ServletJSP

소스명 : MyFirstServlet.java, VisitorServlet.java, visitorForm.html
[ 실습 1 ]
이번 실습은 브라우저에서 서블릿을 직접 요청하는 실습이다. 서블릿 수행을 요청하는 URL 문자열
뒤에 Query 문자열을 추가하여 요청하고 문제에서 제시한 대로 브라우저의 도큐먼트 영역에 결과가
출력된다면 구현 성공이다.
(1) 클래스명 : core.MyFirstServlet
(2) 매핑명 : /myfirst
(3) GET 방식지원 서블릿
(4) 기능 : name이라는 이름으로 전달되는 Query 문자열을 추출하고
 <h2> xxx 님 반가워요. 오늘은 x요일입니다!! </h2>
 를 브라우저로 응답한다.
name이라는 이름으로 Query 문자열이 전달되지 않은 경우에는 GUEST 를 대신 출력한다.
요일 출력하는 기능 구현시 Date 나 GregorianCalendar 말고 LocalDate 를 사용한다.

[ 실습 2 ]
htmlexam 폴더에 이미 만들어 놓은 visitorForm.html 을 webapp/clientexam 폴더에 복사한다.
<form> 태그의 action 속성과 method 속성을 수정한다.
(<form method="post" action="/edu/visitor">)
다음 기능의 서블릿 클래스를 구현한다.
(1) 클래스명 : core.VisitorServlet
(2) 매핑명 : /visitor
(3) POST 방식지원 서블릿
(4) 기능 : visitorForm.html 에서 이름과 내용을 입력하고 등록 버튼을 클릭하면 다음 화면을 브라
우저에 출력한다.

소스명 : productlog1.html, BasketServlet1.java
(1) 다음 화면으로 구성되는 productlog1.html 을 만든다.
(2) 상품 이미지가 클릭되면 선택된 상품의 ID(p00`~p010)를 전달하면서 BasketServlet 을 GET 방식으로 요청한다.
[ 서블릿에 구현할 내용 ]
구현 클래스명 : core.BasketServlet1
요청방식 : GET
매핑명 : /basket1
응답형식 : HTML
요청시 전달된 상품 ID 를 추출하여 다음과 같이 화면을 출력하는 기능을 구현한다.

소스명 : ReservationServlet.java, reservation.html
(1) 다음 화면으로 구성되는 reservation.html 을 clienthtml 폴더에 작성한다.
(2) 다음 기능의 서블릿 클래스를 생성한다.
- 클래스명 : core.ReservationServlet
- 매핑명 : /reservation
- POST 방식지원 서블릿
- 기능 : 예약관련 Query 문자열을 추출하고 다음 화면을 출력한다.
 <h1>xxx님의 예약내용</h1>
⚫ 룸 : xxx
⚫ 추가 요청 사항 : xxx, xxx, xxx 또는 없음
⚫ 예약날짜 : xxxx년 xx월 xx일
 예약입력화면으로
(3) 예약자 명이 비어 있으면 즉, 널 문자열이면 first.html 로 forward 하고
 암호가 비어 있으면 ‘다음’ 웹 페이지로 redirect 한다.

 소스명 : productlog2.html, BasketServlet2.java
(1) 이미지가 클릭되면 함수를 호출하게 클릭 이벤트 핸들러를 등록한다.
(2) 상품 이미지가 클릭되면 선택된 상품의 ID(p001~p010)를 전달하면서 BasketServlet 을 GET 방식으로 요청한다.
[ 서블릿에 구현할 내용 ]
구현 클래스명 : core.BasketServlet2
요청방식 : GET
매핑명 : /basket2
응답형식 : HTML
요청시 전달된 상품 ID 를 추출하여 다음과 같이 화면을 출력하는 기능을 구현한다.
선택한 상품 리스트
 ------------------------------------------
⚫ p001 상품 3개
⚫ p003 상품 1개
⚫ p007 상품 2개
 :
상품선택화면 상품비우기
상품비우기가 선택되면 Query 문자열 없이 BasketServlet2 를 수행을 요청한다.
선택한 상품이 없습니다.
 ------------------------------------------
상품선택화면 
