<html>
<head>
	<title>Home</title>
	<meta name="layout" content="quote" >
</head>

<body>
	<g:form controller="quote" action="newQuote" >
		<g:textField name="author" value="Enter ur name..." /> <br /> <br />
		<g:textField name="nickname" value="Enter ur nick name..." /> <br /> <br />
		<g:textField name="content" value="Enter the quote..." /> <br /> <br />
		<g:submitButton name="Go"/>
	</g:form>
</body>
</html>