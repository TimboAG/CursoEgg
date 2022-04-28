
SubProceso SecuenciaCaracteres(caracteres1)
	
	definir i Como Entero
	definir aux Como Caracter
	
	
	Para i=0 Hasta Longitud(caracteres1) Con Paso 1 Hacer
		
		Segun Subcadena(caracteres1, i, i) Hacer
			"a": 
				escribir sin saltar "@"
			"e":
				escribir sin saltar "#"
			"i":
				escribir sin saltar "$"
			"o":
				escribir sin saltar "%"
			"u":
				escribir sin saltar "*"
			De Otro Modo:
				escribir sin saltar Subcadena(caracteres1, i, i)
		Fin Segun	
		
	Fin Para

FinSubProceso






Algoritmo sin_titulo
	definir caracteres1 Como Caracter
	
	Escribir  "Ingrese una frase para convertir "
	leer caracteres1
	
	SecuenciaCaracteres(caracteres1)
FinAlgoritmo
