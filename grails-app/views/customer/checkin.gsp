<!DOCTYPE html>
<html>
<head>
	%{-- <meta name="layout" content="main" /> --}%
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
	<title></title>
	<asset:stylesheet src="application.css"/>
    <asset:link rel="icon" href="cupicon.gif" type="image/x-ico" />
</head>
<body>

<g:form url="[resource: customerInstance, action: 'customerLookup']">
	<g:render template="kioskForm" />
</g:form>

</body>
</html>