<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pet Registration</title>
</head>
<body>
	<form method="post" action="/PetShop/pets">
		<div>
			<label for="name">Name</label>
			<input type="text" name="name" id="name" />
			<br>
			<label for="description">Description</label>
			<textarea rows="10" cols="20" name="description" id="description"></textarea>
			<br>
			<label for="type">Pet type</label>
			<input type="text" name="type"id="type" />
			<br>	
			<input type="submit" value="Submit">
		</div>
	</form>
</body>
</html>