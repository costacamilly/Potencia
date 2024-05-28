public class Main {
  public static void main(String[] args) {
    
System.out.println("Programa feito para calcular Potência e Consumo Elétrico");
    System.out.println(" ");
    System.out.println("-Potência: É força aparelho elétrico trabalha no movimento dos elétrons");
    System.out.println(" ");
    System.out.println("Exemplo");
    System.out.println(
        "-Uma TV de aproximadamente 200 wats fica ligada 5h diariamente. Determine o consumo elétrica mensal da TV");
    System.out.println(" ");
    System.out.println("A Potência é:");
    double potencia = 200;
    System.out.println(potencia);
    System.out.println(" ");
    System.out.println("O tempo é:");
    double tempo = 5;
    System.out.println(tempo);
    System.out.println(" ");
    System.out.println("a divisão é por:");
    double divisao = 1000;
    System.out.println(divisao);
    System.out.println(" ");
    System.out.println("O tempo Mensal é de:");
    double mensal = 30;
    System.out.println(mensal);
    System.out.println(" ");
    System.out.println("Para calcularmos, de início devemos multiplicar a potencia pelo tempo.");
    double consumoEletrico = potencia * tempo;
    System.out.println(consumoEletrico);
    System.out.println(" ");
    System.out.println("Após obter o resultado dividiremos por 1000");
    double consumoEletrico2 = consumoEletrico / divisao;
    double resposta = 1;
    System.out.println(consumoEletrico2);
    System.out.println(" ");
    System.out.println("Para saber o período mensal multiplicamos por 30.");
    double respostaFinal = resposta * mensal;
    System.out.println(" ");
    System.out.println("Então temos:");
    System.out.println(respostaFinal);
  }


}