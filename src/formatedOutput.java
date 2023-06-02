import java.util.Locale;

public class formatedOutput {
    public static void main(String[] args) {
        var nome = "Maria";
        var sobrenome = "Silva";
        var idade = 18;
        var aplic = 123.456f;

        System.out.printf("Ola, %s\n", nome);
        System.out.printf("Ola, %s %s\n", nome, sobrenome);
        System.out.printf("Ola, %s %s. Voce tem %d anos.\n", nome, sobrenome, idade);
        System.out.printf(Locale.FRANCE, "Voce tem %.2f aplicados.\n", aplic);
    }
}