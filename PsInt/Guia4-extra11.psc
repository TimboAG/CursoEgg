Algoritmo sin_titulo
	definir matriz, n, m Como Entero
	definir i, j Como Entero
	
	n=5
	m=15
	
	Dimension  matriz(n,m)
	
	para i=0 Hasta n-1 Hacer
		para j=0 hasta m-1 Hacer
			matriz(i,j)=0
			
			si i=0 y j=0 Entonces
				matriz(i,j)=1
			FinSi
			
			si j=0 y i=j+1 Entonces
				matriz(i,j)=1
			FinSi
			
			
			si i=0  y j=i+1 Entonces
				matriz(i,j)=1
			FinSi
			
			si i=0   Entonces
				matriz(i,j)=1
			FinSi
			si j=0   Entonces
				matriz(i,j)=1
			FinSi
			si j=m-1   Entonces
				matriz(i,j)=1
			FinSi
			si i=n-1   Entonces
				matriz(i,j)=1
			FinSi
		FinPara
	FinPara
	
	
	
	para i=0 Hasta n-1 Hacer
		para j=0 hasta m-1 Hacer
			escribir sin saltar  matriz(i,j)
		FinPara
		escribir " "
	FinPara
	
FinAlgoritmo




//  i ,j   i ,j   i, j   i, j
// (0,0)  (0,1)  (0,2)  (0,3)
// (1,0)  (?,?)  (?,?)  (1,3)
// (2,0)  (?,?)  (?,?)  (2,3)
// (3,0)  (3,1)  (3,2)  (3,3)
