class Stack():
    def __init__(self):
        self.data = []

    def estaVacia(self):
        return self.longitud() == 0

    def longitud(self):
        return  len(self.data)

    def pop(self):
        return self.data.pop()

    def peek(self):
        return self.data[-1]

    def push(self,valor):
        self.data.append(valor)

    def __str__(self):
        info = "-----"
        for elem in self.data[-1::-1]:
            print(elem, "\n|---|")

def posicion_medio (Stack , posicion_actual , posicion_media):
    #caso base
    if posicion_actual == posicion_media:
        return Stack.pop()  #extramos el elemento si estamos en la posicon media

    #elemento en la cima de la pila
    elemento = Stack.pop()

    #funcion recursiva
    valor_medio = posicion_medio(Stack , posicion_actual +1,posicion_media)

    Stack.push(elemento)

    return valor_medio

def obtener_medio (Stack):
    if Stack.estaVacia():
        return None

    posicion_media = Stack.longitud() // 2
    return posicion_medio (Stack , 0 , posicion_media)

def suma_digitos (n):
    #caso base
    if n < 10:
        return n
    else:
        return (n%10) +suma_digitos(n//10)




#Ejercicio 1 : problema de  sacar de un ADT pila el valor en la posición media con recursión.
nombres = Stack()
nombres.push("Gerardo")
nombres.push("Esteban")
nombres.push("Luis")
nombres.push("Israel")
nombres.push("Eduardo")


print("Ejercicio 1 : problema de sacar de un ADT pila el valor en la posición media con recursión.")
nombres.__str__()
valor_medio = obtener_medio(nombres)
print("El elemento medio es: " + valor_medio)


#Ejercicio 2 : Dado un número
#entero positivo, escribe un metodo recursivo que calcule la suma de sus
#dígitos.
numero_entero = 184529
resultado = suma_digitos(numero_entero)
print()
print("Ejercico 2 : Dado un número entero positivo, escribe un método recursivo que calcule la suma de sus dígitos.")
print(f"la suma de cada uno de los digitos de {numero_entero} es: {resultado}")



