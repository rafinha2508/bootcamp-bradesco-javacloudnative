package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.nome = "Felipe";
        felipe.idade = 18;

        System.out.println("o aluno " + felipe.nome + " tem idade: " + felipe.idade + " anos");
    }
}
