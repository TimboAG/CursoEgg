Algoritmo sin_titulo
	definir muestra, matriz, letra Como Caracter
	definir n,i, j, cont Como Entero
	DEFINIR resp Como Logico
	resp=Verdadero
	
	
	escribir "Ingrse la dimension de la matriz"
	leer n
	Dimension  matriz(n,n)
	
	cont=0
	
	escribir "Ingrese cantidad de letras como n "
	leer muestra
	
	para i = 0 hasta n-1 con paso 1 Hacer
		para j =0 hasta n-1 Hacer
			
			matriz(i,j)= Subcadena(muestra, cont, cont)
			cont= cont+1
		FinPara
		
	FinPara
	
	
	
	
	escribir "-------------------------------------------------------"
	para i = 0 hasta Longitud(muestra)-1 con paso 1 Hacer
			
			letra= Subcadena(muestra, i, i)
			si letra <> "A" y letra <> "B" y letra <> "C" y letra <> "D" Entonces
				resp=Falso
				i= Longitud(muestra)-1
			SiNo
				resp=Verdadero
			FinSi
			escribir resp

			escribir " "
	FinPara
	
	

	para i = 0 hasta n-1 con paso 1 Hacer
		para j =0 hasta n-1 Hacer
			
			Escribir sin saltar	matriz(i,j) " "
		FinPara
		escribir " "
	FinPara
FinAlgoritmo
