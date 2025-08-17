def jogo_marciano():
    print("Jogador 1: Escolha a árvore (de 1 a 100) para o marciano se esconder (não conte ao Jogador 2).")
    while True:
        esconderijo = int(input("Árvore escolhida: "))
        if 1 <= esconderijo <= 100:
            break
        else:
            print("Número inválido. Escolha uma árvore entre 1 e 100.")
    
    balas = 5
    tentativas = 0
    
    print("\nJogador 2: Você tem 5 balas para tentar acertar o marciano.")
    
    while balas > 0:
        tentativa = int(input("Digite o número da árvore que você quer atirar: "))
        tentativas += 1
        
        if tentativa == esconderijo:
            print(f"Parabéns! Você acertou o marciano na árvore {esconderijo} com {tentativas} tentativas.")
            return
        
        balas -= 1
        
        if tentativa < esconderijo:
            print("O marciano está mais à direita!")
        else:
            print("O marciano está mais à esquerda!")
        
        print(f"Balas restantes: {balas}\n")
    
    print(f"Você não conseguiu acertar o marciano. Ele foi levado para Marte! O esconderijo era a árvore {esconderijo}.")

jogo_marciano()