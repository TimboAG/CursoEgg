Algoritmo sin_titulo
	definir matriz, palabra Como Caracter
	definir i, j, x Como Entero
	dimension matriz(3,3)
	
	escribir "Ingrese una palabra de longitud 9"
	leer palabra
	x=0
	si Longitud(palabra)=9 Entonces	
		
		
		para x=0 Hasta 2
			para i=0 hasta 0 Hacer
				para j=0 Hasta 2 Hacer
					matriz(i,j) = Subcadena(palabra, 0,x)
				FinPara
			FinPara	
		fin para	
		
		
		para x=3 hasta 5 Hacer
			para i=1 hasta 1 Hacer
				para j=0 hasta 2 Hacer
					matriz(i,j)=Subcadena(palabra,3,x)
				FinPara
			FinPara
		fin para	
		
		
		para x=6 hasta 8 Hacer
			para i=2 hasta 2 Hacer
				para j=0 hasta 2 Hacer
					matriz(i,j)=Subcadena(palabra,6,x)
				FinPara
			FinPara
		fin para	
		

		para i=0 hasta 2 
			para j=0 hasta 2  con paso 3
				Escribir matriz(i,j), " " Sin Saltar
			FinPara
			Escribir " "
		FinPara
		
	
	SiNo
		escribir "La longitud de la palabra es incorrecta"
	FinSi
	
FinAlgoritmo

