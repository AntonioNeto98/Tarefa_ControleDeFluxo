public class Calculo {
        public static void main(String[] args) {
            int nota1 = 10;
            int nota2 = 9;
            int nota3 = 10;
            int nota4 = 0;

            int media = (nota1 + nota2 + nota3 + nota4) / 4;

            if (media >= 7 ) {
                System.out.println( "Você foi aprovado");
            }
            else if (media >= 5 && media < 7 ) {
                System.out.println( "Você está em recuperação");
            }
            else {
                System.out.println( "Você foi reprovado");
            }
        }

}
