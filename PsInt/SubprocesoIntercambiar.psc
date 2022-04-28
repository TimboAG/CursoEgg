SubProceso Intercambiar(var1, var2)
	definir aux Como Entero
	
	aux= var1
	var1 =var2
	var2= aux
	
	escribir "Los numeros intercambiados en variables son A=" var1 " y B=" var2

	
FinSubProceso


Algoritmo sin_titulo
	Definir  var1, var2 Como Entero
	
	escribir "Ingrese primer numero de tipo entero A "
	leer var1
	escribir "Ingrese segundo numero de tipo entero B "
	leer var2
	
	escribir "Los numeros ingresados son A=" var1 " y B=" var2
	Intercambiar(var1, var2)
	
FinAlgoritmo
