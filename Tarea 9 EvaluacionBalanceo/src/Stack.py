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

def esta_balanceado (texto):
    pares = {"{":"}" , "(":")"} #diccionario
    pila = []
    #iteramos sobre el texto
    for char in texto:
        if char in pares.keys():
            pila.append(char)

        elif char in pares.values():
            if not pila or pares[pila.pop()] != char:
                return False

    return not pila

#prueba String de pares de llaves e impares regreesa true o false
print (esta_balanceado("{()()}"))
print(esta_balanceado("{{(())}}"))
print(esta_balanceado("((5+2)+7"))
print(esta_balanceado("{(5/3)/(7*5)}"))
