<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>Laptops:</h2>

	<c:if test="${not empty laptops}">

		<ul>
			<c:forEach var="listValue" items="${laptops}">
				<li>${listValue}</li>
			</c:forEach>
		</ul>

	</c:if>

    <h2>Laptop with id:10001 is</h2>
    <P>${laptop}</P>



    	<h2>updatedLaptop after deletion:</h2>

	<c:if test="${not empty updatedLaptop}">

		<ul>
			<c:forEach var="listValue" items="${updatedLaptop}">
				<li>${listValue}</li>
			</c:forEach>
		</ul>
	</c:if>



    	<h2>updatedLaptop after insertions:</h2>

	<c:if test="${not empty afterInsertLaptops}">

		<ul>
			<c:forEach var="listValue" items="${afterInsertLaptops}">
				<li>${listValue}</li>
			</c:forEach>
		</ul>
	</c:if>



    	<h2>updatedLaptop after afterUpdateLaptops:</h2>

	<c:if test="${not empty afterUpdateLaptops}">

		<ul>
			<c:forEach var="listValue" items="${afterUpdateLaptops}">
				<li>${listValue}</li>
			</c:forEach>
		</ul>
	</c:if>








</body>
</html>