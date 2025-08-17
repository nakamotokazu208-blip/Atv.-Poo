import random

def jogo_adivinhacao():
    print("Bem-vindo ao jogo de adivinhação.")
    intervalo_min = 1
    intervalo_max = 80
    tentativas_max = 10
    
    numero_secreto = random.randint(intervalo_min, intervalo_max)
    
    print(f"Você deve adivinhar o número secreto entre {intervalo_min} e {intervalo_max}.")
    print(f"Você tem {tentativas_max} tentativas para acertar o número.")
    
    for tentativa in range(1, tentativas_max + 1):
        while True:
            try:
                chute = int(input(f"Tentativa {tentativa}: Digite um número: "))
                if intervalo_min <= chute <= intervalo_max:
                    break
                else:
                    print("Digite um número entre {intervalo_min} e {intervalo_max}.")
            except ValueError:
                print("Por favor, digite um número válido.")
        
        if chute == numero_secreto:
            print(f"Parabéns! Você acertou o número secreto {numero_secreto} na tentativa {tentativa}!")
            return
        elif chute < numero_secreto:
            print("O número secreto digitado é maior.")
        else:
            print("O número secreto digitado é menor.")
    
    print(f"As suas tentativas acabaram. O número secreto era {numero_secreto}.")

if __name__ == "__main__":
    jogo_adivinhacao()

