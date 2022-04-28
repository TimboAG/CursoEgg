SubProceso Temperatura(dias)
	definir aux Como real
	definir max, min Como real
	definir i Como Entero
	
	
	max=0
	min=0
	
	

	
	Para i=1 Hasta dias Con Paso 1 Hacer
		
		Escribir  "Ingrese temperatura maxima del dia  " i " dias"
		leer max
		escribir "Ingrese temperatura minima del dia  " i " dias"
		leer min
		aux = (max+min)/2;	
      Escribir " La temperatura media para el dia " i " es " aux
	Fin Para
	
FinSubProceso


Algoritmo sin_titulo
	Definir  dias Como Entero
	
	escribir "Ingrese cantidad de dias "
	leer dias
	
	Temperatura(dias)
	
FinAlgoritmo
