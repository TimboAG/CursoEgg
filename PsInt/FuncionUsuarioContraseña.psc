Algoritmo sin_titulo
	definir usuario, contrasena Como Caracter	
	usuario= ""
	contrasena = ""
	escribir Login(usuario, contrasena)	
FinAlgoritmo


funcion variable1 <- Login(usuario, contrasena)
	definir variable1 Como Logico
	definir intentos como entero
	intentos= 0	
	variable1= Falso
	Mientras  variable1 = falso y intentos < 3
		escribir "Ingrese nombre de usuario: Este es su " intentos +1 "° intento. Solo tiene 3"
		leer usuario		
		escribir "Ingrese contraseña: Este es su " intentos + 1 "° intento. Solo tiene 3"
		leer contrasena
		si usuario = "usuario1" y contrasena = "asdasd" Entonces
			variable1= Verdadero
		SiNo
			variable1= Falso
			intentos= intentos+1
		FinSi		
	FinMientras
		
	si intentos = 3 Entonces
		escribir "Se terminaron sus 3 intentos"
	FinSi	
FinFuncion
	