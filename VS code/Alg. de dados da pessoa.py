nomes = []
sexos = []
alturas = []
num_homens = 0
menor_altura_homens = float('inf')
maior_altura_homens = float('-inf')
menor_altura_mulheres = float('inf')
maior_altura_mulheres = float('-inf')
nome_menor_altura_mulher = ""

for i in range(10):
    nome = input("Digite o nome da pessoa: ")
    sexo = input("Digite o sexo (M ou F): ").upper()
    altura = float(input("Digite a altura em metros: "))
    
    nomes.append(nome)
    sexos.append(sexo)
    alturas.append(altura)
    
    if sexo == 'M':
        num_homens += 1
        if altura < menor_altura_homens:
            menor_altura_homens = altura
        if altura > maior_altura_homens:
            maior_altura_homens = altura
    elif sexo == 'F':
        if altura < menor_altura_mulheres:
            menor_altura_mulheres = altura
            nome_menor_altura_mulher = nome
        if altura > maior_altura_mulheres:
            maior_altura_mulheres = altura

soma_alturas_mulheres = sum(altura for sexo, altura in zip(sexos, alturas) if sexo == 'F')
num_mulheres = sexos.count('F')
media_altura_mulheres = soma_alturas_mulheres / num_mulheres if num_mulheres > 0 else 0

print(f"A maior altura dos homens: {maior_altura_homens:.2f} m")
print(f"A menor altura dos homens: {menor_altura_homens:.2f} m")
print(f"A maior altura das mulheres: {maior_altura_mulheres:.2f} m")
print(f"A menor altura das mulheres: {menor_altura_mulheres:.2f} m")
print(f"Média de altura das mulheres: {media_altura_mulheres:.2f} m")
print(f"Número de homens: {num_homens}")
print(f"Nome da mulher com a menor altura: {nome_menor_altura_mulher}")