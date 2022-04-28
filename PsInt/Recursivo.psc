Algoritmo Ejer10G3
	definir n,t Como Entero
	Escribir "Ingrese un numero entero: "
	leer n
	t=sumatorianum(n)
	Escribir "La sumatoria de los ",n,"primeros numeros es: ",t,"."
	
FinAlgoritmo
funcion suma<-sumatorianum(n)
	definir suma Como Entero
	si n=1 Entonces
		suma=1
	SiNo
		suma=n + sumatorianum(n-1)
	FinSi
FinFuncion