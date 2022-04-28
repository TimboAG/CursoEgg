Algoritmo sin_titulo
	definir  vector1, i, n, def, reg, buenos, exce Como Entero
	n=100
	dimension vector1(n)
	
	def = 0
	reg=0
	buenos=0
	exce = 0
	para i=0 hasta n-1 Hacer
		vector1(i) = Aleatorio(0,20)
		si vector1(i) >= 0 y vector1(i) <= 5
			def = def + 1
		FinSi
		si vector1(i) >= 6 y vector1(i) <= 10
			reg = reg + 1
		FinSi
		si vector1(i) >= 11 y vector1(i) <= 15
			buenos = buenos + 1
		FinSi
		si vector1(i) >= 16 y vector1(i) <= 20
			exce = exce + 1
		FinSi
		
	FinPara
	
	
	
	escribir "Cantidad de alumnos deficientes: " def
	escribir "Cantidad de alumnos regulares: " reg
	escribir "Cantidad de alumnos buenos: " buenos
	escribir "Cantidad de alumnos excelentes: " exce
	
	
	
	escribir "------------ "
	para i=0 hasta n-1 Hacer
		escribir  "Alumno " i+1 " Nota: " vector1(i)
	FinPara
	escribir " "
	
	
FinAlgoritmo