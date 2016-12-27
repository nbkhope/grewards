<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>

	${products.name}
	${products.price}

	<table border="1">
		<g:each in="${products}" var="product">
			<tr>
				<td>${product.name}</td>
				<td>${product.sku}</td>
				<td>$ ${product.price}</td>
			</tr>
		</g:each>
	</table>

</body>
</html>
