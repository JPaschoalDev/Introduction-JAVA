⚡ Sistema de Cálculos Eletroeletrônicos (Java Console)

📖 Sobre

Este projeto marca minha transição da lógica de programação (Portugol) para a linguagem Java.

Trata-se de uma aplicação via console que auxilia estudantes e técnicos em cálculos fundamentais de eletricidade.

O programa demonstra o uso de:

Scanner Global para gerenciamento eficiente de memória.

Modularização com métodos estáticos (static void).

Estruturas de Repetição (do-while) e Decisão (switch-case, if/else).

Tratamento de Buffer de teclado para evitar erros de leitura.

Formatação de Saída (printf) para valores decimais.

🚀 Funcionalidades

O sistema conta com um menu interativo contendo 5 ferramentas principais:

✅ Lei de Ohm: Cálculo da Intensidade de Corrente ($I = V / R$).

✅ Identificador de Fonte: Distinção entre Corrente Alternada (Tomada) e Contínua (Bateria).

✅ Comparador de Potência: Analisa se um sistema 12V (CC) ou 127V (CA) tem maior potência baseado na corrente informada.

✅ Painel de Segurança: Monitoramento de níveis de corrente (Seguro, Atenção, Risco).

✅ Simulador de Conversor: Verifica a viabilidade de conversão AC/DC.

✅ UX/UI via Console: Sistema de "Limpeza de Tela" e "Pausa" para melhor experiência do usuário.

📂 Arquivos

src/Main.java → Código-fonte principal contendo a lógica e o menu.

out/artifacts/.../*.jar → Arquivo executável (Build Artifact).

▶️ Como Executar

Opção 1: Via IDE (IntelliJ IDEA)

Clone este repositório.

Abra o projeto no IntelliJ IDEA.

Execute a classe Main.java.

Opção 2: Via Executável (.jar)

Se você tiver o Java instalado, pode rodar o arquivo compilado pelo terminal:

java -jar AtividadeEAD.jar


Nota: Certifique-se de usar o Java 21 ou compatível.

🖥️ Exemplo de Execução

Menu Principal

=========== ATIVIDADE EAD ===========
=====================================

[1] MEDINDO A INTENSIDADE DA CORRENTE
[2] IDENTIFICANDO CORRENTE
[3] COMPARANDO POTÊNCIA
[4] SISTEMA DE IDENTIFICAÇÃO
[5] CONVERSOR SIMPLES
[0] ENCERRAR PROGRAMA
> ESCOLHA SUA OPÇÃO: 1


Exemplo: Cálculo de Lei de Ohm

INFORME O VALOR DA RESISTÊNCIA (R) EM OHMS: 100

SABENDO QUE O VALOR DA TENSÃO (V) É DE 12
PODEMOS CALCULAR A CORRENTE ELÉTRICA (I) ATRAVÉS DA EXPRESSÃO (I = V / R).
FICARIA: I = 12 / 100.00

CORRENTE ELÉTRICA: 0.12


🛠️ Tecnologias

Linguagem: Java (JDK 21)

IDE: IntelliJ IDEA

Conceitos: POO (básico), Métodos Estáticos, Loops, Clean Code

⚡ Fórmulas e Conceitos Aplicados

Lei de Ohm: $I = V / R$ (Onde Tensão é fixada em 12V).

Potência Elétrica: $P = V \times I$.

Segurança:

$I < 5A$: Seguro 🟢

$5A \le I < 10A$: Atenção 🟡

$I \ge 10A$: Risco de Superaquecimento 🔴

📌 Possíveis Melhorias

[ ] Implementar tratamento de exceções (try-catch) para evitar erro se o usuário digitar letras.

[ ] Permitir que o usuário defina a Tensão (V) personalizada na Lei de Ohm.

[ ] Criar uma Interface Gráfica (Swing ou JavaFX).

[ ] Salvar o histórico dos cálculos em um arquivo de texto (.txt).
