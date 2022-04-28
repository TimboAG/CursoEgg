Algoritmo formaCadena
	
	definir numEnCadena Como Caracter
	
	escribir "Ingrese un numero de hasta 3 digitos"
	leer numEnCadena
	
	si Longitud(numEnCadena) > 3 Entonces
		escribir "Se ingreso un numero mas grande de lo pedido. Debe ser hasta 3 digitos"
	SiNo
		escribir MiFuncion(numEnCadena)
	FinSi
	
FinAlgoritmo


funcion variable1 <- MiFuncion(num)
	definir variable1 Como entero
	
	variable1 = ConvertirANumero(num)
	
FinFuncion
	