Algoritmo sin_titulo
	Definir frase, letra, vector Como Caracter
	Definir posicion, i Como Entero
	Dimension vector(20)
	
	Escribir "Ingrese una frase: "
	Leer frase
	
	Para i=0 Hasta 19
		vector(i) = Subcadena(frase, i, i)
	FinPara
	
	Escribir "Ingrese una letra: "
	Leer letra
	Escribir "Ingrese una posición: "
	Leer posicion
	
	Si vector(posicion) = " "
		vector(posicion) = letra
	SiNo
		Escribir "No es posible ingresar una letra (ocupado)"
	FinSi
	
	Para i=0 Hasta 19
		Escribir Sin Saltar vector(i)
	FinPara
FinAlgoritmo
