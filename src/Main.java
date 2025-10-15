public class Main {
    public static void main(String[] args) {
        Professor p = new Professor();
        p.nome = "Samara";
        Turma t = new Turma();
        t.nome = "Programação Orientada a Objetos";
        t.professor = p;

        System.out.println("Turma: " + t.nome);
        System.out.println("Professor: " + t.professor.nome);
    }
}
