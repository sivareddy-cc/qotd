<%@ page import="qotd.*" %>
<html>
<head>
	<title>Random Quote</title>
</head>

<body>
	
	<g:set var="quote1" value="${Quote.get(quote ) }" />
		
	<p>${quote1.id }</p>
	<q>${quote1.content }</q>
	<p>${quote1.author } : ${quote1.nickname }</p>
	
</body>

</html>