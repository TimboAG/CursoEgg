SubProceso CocienteResto(dividendo,divisor)
	
	definir resultado Como Entero
	definir cociente Como Entero
	
	resultado =  dividendo
	cociente=0
	
	Mientras  resultado > divisor
		resultado = resultado - divisor
		cociente= cociente + 1		
	FinMientras
	
	escribir "El residuo es " resultado
	escribir "El cociente es " cociente
	
FinSubProceso


Algoritmo sin_titulo
	Definir  dividendo, divisor Como Entero
	
	escribir "Ingrese dividendo "
	leer dividendo
	escribir "Ingrese divisor "
	leer divisor
	
	CocienteResto(dividendo,divisor)
	
FinAlgoritmo