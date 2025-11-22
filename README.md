# ⚡ Sistema de Análise Elétrica (Java)

## 📖 Sobre
Este projeto é um **Sistema de Análise Elétrica** desenvolvido em **Java**.  
Ele demonstra o uso de **estruturas condicionais, métodos personalizados, cálculos físicos e menu interativo**.

O programa:
- Calcula a intensidade da corrente elétrica (Lei de Ohm).
- Identifica o tipo de corrente (CA ou CC) conforme a fonte de energia.
- Compara a potência entre sistemas de 12V CC e 127V CA.
- Monitora o status de segurança de painéis eletrônicos.
- Simula um conversor de tensão AC/DC.
- Utiliza menu interativo com navegação contínua.

---

## 🚀 Funcionalidades
- ✅ Cálculo de corrente elétrica usando a Lei de Ohm (I = V / R)
- ✅ Identificação de tipo de corrente (Alternada ou Contínua)
- ✅ Comparação de potência entre diferentes sistemas elétricos
- ✅ Sistema de monitoramento de segurança com 3 níveis de alerta
- ✅ Simulação de conversor AC/DC
- ✅ Interface com menu interativo e limpeza de console
- ✅ Validação de entradas do usuário
- ✅ Navegação contínua até encerramento manual

---

## 📂 Estrutura do Projeto
```
📦 sistema-analise-eletrica
 ┣ 📜 Main.java
 ┗ 📜 README.md
```

---

## ▶️ Como Executar

### Pré-requisitos
- **JDK 8** ou superior instalado
- Terminal/Prompt de Comando

### Passos para Execução
1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/sistema-analise-eletrica.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd sistema-analise-eletrica
   ```

3. Compile o programa:
   ```bash
   javac Main.java
   ```

4. Execute o programa:
   ```bash
   java Main
   ```

---

## 🖥️ Exemplo de Execução

### Menu Principal
```
=========== ATIVIDADE EAD ===========
=====================================

[1] MEDINDO A INTENSIDADE DA CORRENTE
[2] IDENTIFICANDO CORRENTE
[3] COMPARANDO POTÊNCIA
[4] SISTEMA DE IDENTIFICAÇÃO
[5] CONVERSOR SIMPLES
[0] ENCERRAR PROGRAMA
> ESCOLHA SUA OPÇÃO: 1
```

---

### Exemplo 1: Medindo Intensidade da Corrente
```
INFORME O VALOR DA RESISTÊNCIA (R) EM OHMS: 6
SABENDO QUE O VALOR DA TENSÃO (V) É DE 12
PODEMOS CALCULAR A CORRENTE ELÉTRICA (I) ATRAVÉS DA EXPRESSÃO (I = V / R).
FICARIA: I = 12 / 6.00
CORRENTE ELÉTRICA: 2.0
```

---

### Exemplo 2: Identificando Corrente
```
INFORME QUAL A FONTE LIGADA AO APARELHO
[1] TOMADA
[2] BATERIA
> ESCOLHA SUA OPÇÃO: 1
O TIPO DE CORRENTE LIGADA A UMA TOMADA É A ALTERNADA (CA)
```

---

### Exemplo 3: Comparando Potência
```
CÁLCULO DE MAIOR POTÊNCIA
INFORME O VALOR DA CORRENTE ELÉTRICA: 5

EM UM SISTEMA QUE FUNCIONA A 12V CC
A POTÊNCIA DO SISTEMA É DE: 60.000

EM UM SISTEMA QUE FUNCIONA A 127V CA
A POTÊNCIA DO SISTEMA É DE: 635.000

O SISTEMA QUE FUNCIONA A 127V CA TEM A MAIOR POTÊNCIA ENERGÉTICA
```

---

### Exemplo 4: Sistema de Identificação (Painel Eletrônico)
```
PAINEL ELETRÔNICO
INFORME O VALOR DA CORRENTE ELÉTRICA (I): 8
STATUS PAINEL: ATENÇÃO!
```

---

### Exemplo 5: Conversor de Tensão
```
CONVERSOR SIMPLES DE TENSÃO
QUAL A ENTRADA?
[1] AC
[2] DC
> ESCOLHA SUA OPÇÃO: 1
O EQUIPAMENTO EFETUA A CONVERSÃO DE AC PARA DC
```

---

## 🛠️ Tecnologias Utilizadas
- ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
- **IDE**: IntelliJ IDEA (ou qualquer IDE Java)
- **Biblioteca**: `java.util.Scanner` (para entrada de dados)

---

## 📐 Fórmulas Utilizadas

### Lei de Ohm
```
I = V / R
```
- **I** = Corrente elétrica (Amperes)
- **V** = Tensão (Volts)
- **R** = Resistência (Ohms)

### Potência Elétrica
```
P = V × I
```
- **P** = Potência (Watts)
- **V** = Tensão (Volts)
- **I** = Corrente (Amperes)

---

## 🔒 Níveis de Segurança do Painel

| Corrente (I) | Status | Descrição |
|--------------|--------|-----------|
| I < 5A | ✅ Nível Seguro | Operação normal |
| 5A ≤ I < 10A | ⚠️ Atenção! | Monitoramento necessário |
| I ≥ 10A | 🚨 Risco de Superaquecimento! | Intervenção imediata |

---

## 📌 Possíveis Melhorias
- [ ] Adicionar suporte para múltiplos circuitos em paralelo/série
- [ ] Implementar cálculo de potência dissipada e eficiência energética
- [ ] Criar histórico de medições realizadas
- [ ] Adicionar interface gráfica (GUI) usando Swing ou JavaFX
- [ ] Implementar simulação de circuitos elétricos mais complexos
- [ ] Adicionar validação mais robusta de entradas numéricas
- [ ] Incluir conversão entre unidades elétricas (mA, kV, MW, etc.)
- [ ] Exportar relatórios de análise em formato PDF ou CSV

---

## 🤝 Contribuindo
Contribuições são bem-vindas! Sinta-se à vontade para:
1. Fazer um fork do projeto
2. Criar uma branch para sua feature (`git checkout -b feature/NovaFuncionalidade`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova funcionalidade'`)
4. Push para a branch (`git push origin feature/NovaFuncionalidade`)
5. Abrir um Pull Request

---

## 👨‍💻 Autor
Desenvolvido como atividade acadêmica para estudo de lógica de programação e conceitos de eletricidade básica.


---

⭐ Se este projeto foi útil para você, considere dar uma estrela!
