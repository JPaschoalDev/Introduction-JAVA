import java.util.Scanner; // AQUI É IMPORTADO O METHOD PARA FACILITAR A LEITURA DE DADOS

public class Main {
    //AQUI CRIO UM SCANNER GLOBAL PARA SER UTILIZADO EM QUALQUER METHOD ONDE SEJA NECESSÁRIO
    //CHAMO O SCANNER DE 'input' E UTILIZO ELE SEMPRE QUE NECESSÁRIO
    public static Scanner input = new Scanner(System.in);

    //METHOD CRIADO POIS NÃO EXISTE NATIVAMENTE UM JEITO DE LIMPAR O CONSOLE DO INTELLIJ (IDE UTILIZADO NO PROJETO)
    public static void limparConsole() {
        // IMPRIME 50 LINHAS VAZIAS, PARA SIMULAR A LIMPEZA DO CONSOLE
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    //METHOD CRIADO PARA AGUARDAR A AÇÃO DO USUÁRIO, PARA EXPERIÊNCIA MAIS LIMPA E INTUITIVA (UX e UI)
    public static void aguardar(){
        input.nextLine();
        System.out.print("PRESSIONE 'ENTER' PARA CONTINUAR....");
        input.nextLine();
        limparConsole();
    }

    //ATIVIDADE 1 - Medindo a intensidade da corrente
    public static void medirIntensidade(){
        //DECLARO AS VARIÁVEIS CONFORME O ENUNCIADO
        double corrente;
        double tensao = 12;
        double resistencia;

        System.out.print("INFORME O VALOR DA RESISTÊNCIA (R) EM OHMS: ");
        resistencia = input.nextDouble();
        System.out.printf("SABENDO QUE O VALOR DA TENSÃO (V) É DE %.0f",tensao);
        System.out.println("\nPODEMOS CALCULAR A CORRENTE ELÉTRICA (I) ATRAVÉS DA EXPRESSÃO (I = V / R).");
        System.out.printf("FICARIA: I = %.0f / %.2f",tensao,resistencia);
        corrente = tensao/resistencia; //AQUI É DE FATO ONDE OCORRE O CÁLCULO DA 'CORRENTE ELÉTRICA'
        System.out.println("\nCORRENTE ELÉTRICA: "+corrente);//AQUI APENAS EXIBE O RESULTADO DO CÁLCULO
    }

    //ATIVIDADE 2 - Identificando o tipo de corrente no circuito
    public static void identificandoCorrente(){

        int choice;
        System.out.println("INFORME QUAL A FONTE LIGADA AO APARELHO");
        System.out.println("[1] TOMADA");
        System.out.println("[2] BATERIA");
        System.out.print("> ESCOLHA SUA OPÇÃO: ");
        choice = input.nextInt();
        if(choice == 1){//AQUI É UTILIZADO UM SIMPLES IF/ELSE PARA DETERMINAR O TIPO DE CORRENTE
            System.out.println("O TIPO DE CORRENTE LIGADA A UMA TOMADA É A ALTERNADA (CA)");
        }
        else if(choice == 2){
            System.out.println("O TIPO DE CORRENTE LIGADA A UMA BATERIA É A CONTÍNUA (CC)");
        }
        else{//AQUI UMA TRATATIVA DE OPÇÕES INVÁLIDAS
            System.out.println("OPÇÃO INVÁLIDA!");
        }
    }

    //ATIVIDADE 3 - Comparando consumo entre CC e CA
    public static void comparandoCorrente(){

        double corrente;
        double potencia1, potencia2;
        System.out.println("CÁLCULO DE MAIOR POTÊNCIA");
        System.out.print("INFORME O VALOR DA CORRENTE ELÉTRICA: ");
        corrente = input.nextDouble();//AQUI É INSERIDO O VALOR PADRÃO DA CORRENTE A SER ANALISADA

        //SISTEMA A 12V CC
        System.out.println("\nEM UM SISTEMA QUE FUNCIONA A 12V CC");
        potencia1 = corrente * 12;//CÁLCULO PARA SABER A POTENCIA DO SISTEMA 1
        System.out.printf("A POTÊNCIA DO SISTEMA É DE: %.3f",potencia1);

        //SISTEMA A 127 CA
        System.out.println("\nEM UM SISTEMA QUE FUNCIONA A 127V CA");
        potencia2 = corrente * 127;//CÁLCULO PARA SABER A POTENCIA DO SISTEMA 2
        System.out.printf("A POTÊNCIA DO SISTEMA É DE: %.3f",potencia2);

        if(potencia1 == potencia2){//COMPARATIVO ENTRE O RESULTADO DAS DUAS POTÊNCIAS
            System.out.println("\n\nAMBOS OS SISTEMAS SÃO IGUAIS EM POTÊNCIA ENERGÉTICA");
        }
        else if(potencia1 > potencia2){//CASO POTÊNCIA DE 12V MAIOR QUE 127V
            System.out.println("\n\nO SISTEMA QUE FUNCIONA A 12V CC TEM A MAIOR POTÊNCIA ENERGÉTICA");
        }
        else{//CASO POTÊNCIA DE 127V MAIOR QUE 12V
            System.out.println("\n\nO SISTEMA QUE FUNCIONA A 127V CA TEM A MAIOR POTÊNCIA ENERGÉTICA");
        }
    }

    public static void identificador(){

        double i;
        System.out.println("PAINEL ELETRÔNICO");
        System.out.print("INFORME O VALOR DA CORRENTE ELÉTRICA (I): ");
        i = input.nextDouble();

        if(i<5){//VALORES ABAIXO DE 5 I
            System.out.println("STATUS PAINEL: NÍVEL SEGURO");
        }
        else if(i>5 && i<10){ //VALOR ENTRE 5 e 10 I
            System.out.println("STATUS PAINEL: ATENÇÃO!");
        }
        else{//QUALQUER VALOR ACIMA DE 10 I
            System.out.println("STATUS PAINEL: RISCO DE SUPERAQUECIMENTO!");
        }
    }

    public static void conversor(){

        int choice;
        System.out.println("CONVERSOR SIMPLES DE TENSÃO");
        System.out.println("QUAL A ENTRADA?");
        System.out.println("[1] AC");
        System.out.println("[2] DC");
        System.out.print("> ESCOLHA SUA OPÇÃO: ");
        choice = input.nextInt();

        if(choice == 1){//IF/ELSE SIMPLES PARA EFETUAR AS TRATATIVAS CORRETAS DO ENUNCIADO
            System.out.println("O EQUIPAMENTO EFETUA A CONVERSÃO DE AC PARA DC");
        }
        else if(choice == 2){
            System.out.println("O EQUIPAMENTO NÃO OPERA E A TENSÃO PERMANECE EM DC");
        }
        else{//TRATATIVA PARA POSSÍVEIS OPÇÕES INVÁLIDAS
            System.out.println("OPÇÃO INVÁLIDA!!");
        }
    }

    public static void main(String[] args) {

        int choice;
        do {//LOOP DE REPETIÇÃO VERDADEIRO ATÉ QUE UMA OPÇÃO SEJA DIGITADA (0)
            System.out.println("=========== ATIVIDADE EAD ===========");
            System.out.println("=====================================\n");
            System.out.println("[1] MEDINDO A INTENSIDADE DA CORRENTE");
            System.out.println("[2] IDENTIFICANDO CORRENTE");
            System.out.println("[3] COMPARANDO POTÊNCIA");
            System.out.println("[4] SISTEMA DE IDENTIFICAÇÃO");
            System.out.println("[5] CONVERSOR SIMPLES");
            System.out.println("[0] ENCERRAR PROGRAMA");
            System.out.print("> ESCOLHA SUA OPÇÃO: ");
            choice = input.nextInt();
            input.nextLine();//UTILIZADO PARA LIMPAR O BUFFER E NÃO DEIXAR QUE O METHOD 'Aguardar' SEJA PULADO
            switch (choice) {//SWITCH/CASE PARA MELHOR DESENVOLVIMENTO E INDENTAÇÃO DO CÓDIGO
                case 0:
                    System.out.println("ENCERRANDO PROGRAMA...");
                    break;
                case 1:
                    medirIntensidade();
                    aguardar();
                    break;
                case 2:
                    identificandoCorrente();
                    aguardar();
                    break;
                case 3:
                    comparandoCorrente();
                    aguardar();
                    break;
                case 4:
                    identificador();
                    aguardar();
                    break;
                case 5:
                    conversor();
                    aguardar();
                    break;
                    default:
                        System.out.println("OPÇÃO INVÁLIDA!!");
                        aguardar();
            }
        }while(choice!=0);//ENCERRAMENTO DA ESTRUTURA DE REPETIÇÃO
        input.close();//AQUI SE ENCERRA A ENTRADA FACILITADA DE DADOS (System.in)
    }
}