public class Main {

    public static void main(String[] args) {
        Prova[] provas = { new Prova("Prova 1", 2.5), new Prova("Prova 2", 2.5) };
        Trabalho[] trabalhos = {
                new Trabalho("Trabalho 1", 3.50),
                new Trabalho("Trabalho 2", 1.50),
        };

        Aluno[] alunos = {
                new Aluno("Maria Clara"),
                new Aluno("Lucas Antonio"),
                new Aluno("Vinicius Zimmerman"),
                new Aluno("Bruno Bentes"),
                new Aluno("Naiara Viodotto"),
                new Aluno("Gabriela Cristina"),
                new Aluno("Gabriel Camargo"),
                new Aluno("Fabiane Alves"),
                new Aluno("Laudiceia Manske"),
                new Aluno("Adriane Martins"),
                new Aluno("Jose Correia "),
                new Aluno("Alexia Helena "),
                new Aluno("Aline Ramos"),

        };

        aleatorionotas(alunos, provas, trabalhos);

        for (Aluno aluno : alunos) {
            System.out.format(
                    "Nota final do Semestre de %s: %.2f\n",
                    aluno.getNome(),
                    aluno.getMedia()
            );
        }
    }

    private static double notaAleatoria() {
        return ((double) (int) (Math.random() * 100)) / 10;
    }

    private static void aleatorionotas(
            Aluno[] alunos,
            Prova[] provas,
            Trabalho[] trabalhos
    ) {
        for (Aluno aluno : alunos) {
            for (Prova prova : provas) {
                aluno.addProva(prova, notaAleatoria());
            }
            for (Trabalho trabalho : trabalhos) {
                aluno.addTrabalho(trabalho, notaAleatoria());
            }
        }
    }
}