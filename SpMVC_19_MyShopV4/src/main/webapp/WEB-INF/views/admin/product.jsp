<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>


<section class="container-fluid row">
	<article class="col-7 bg-light pro-input">
		<form:form action="${rootPath}/admin/product/input" modelAttribute="productVO">

			<div class="container-fluid form-group row">
				<form:select path="p_bcode" class="custom-select-sm col-6">
					<option value="0" >품목을 선택하세요</option>
					<option value="B0001" >공산품</option>
					<option value="B0002" >농산물</option>
					<option value="B0003" >수산물</option>
				</form:select>
				<form:select path="p_dcode" class="custom-select-sm col-6">
					<option value="0">거래처를 선택하세요</option>
					<option value="D0001">대덕물산</option>
					<option value="D0002">삼성농산</option>
					<option value="D0003">목포수산</option>
				</form:select>
			</div>

			<div class="form-group">
				<form:input path="p_dcode" class="form-control" placeholder="상품코드"/>
				<form:errors path="p_dcode"/>
			</div>
			<div class="form-group">
				<form:input path="p_name" class="form-control" placeholder="상품이름"/>
				<form:errors path="p_name"/>
			</div>
			<div class="container-fluid form-group row">
				<form:input path="p_iprice" class="form-control col-6"
					placeholder="매입단가"/>
					<form:errors path="p_iprice"/>
					<form:input path="p_oprice" class="form-control col-6"
						placeholder="판매단가"/>
						<form:errors path="p_oprice"/>
			</div>
			<div class="form-group">
				<form:textarea path="p_detail" class="form-control" rows="" cols=""
					placeholder="상세정보"></form:textarea>
			</div>
			
			<div class="form-group">
				<button>저장</button>
			</div>
		</form:form>
	</article>

	<article class="col-4 bg-light pro-list">
		<%@ include file="/WEB-INF/views/admin/product_list.jsp" %>
	</article>

</section>


