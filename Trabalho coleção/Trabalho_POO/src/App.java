public class App {
    public static void main(String[] args) {
        PessoaDAO pessoa_dao = new PessoaDAO();
        Pessoa pessoa1 = new Pessoa(1, "Matheus");
        pessoa_dao.add(pessoa1);
        Pessoa pessoa2 = new Pessoa(2, "Maria");
        pessoa_dao.add(pessoa2);
        Pessoa pessoa3 = new Pessoa(3, "Carlos");
        pessoa_dao.add(pessoa3);
        Pessoa pessoa4 = new Pessoa(4, "Larissa");
        pessoa_dao.add(pessoa4);
        System.out.println("--------------------------------------");
        for (Pessoa pessoa : pessoa_dao.getAll()) {
            System.out.println(pessoa.getId() + "-" + pessoa.getNome());
        }
        System.out.println("--------------------------------------");
        pessoa_dao.delete(pessoa4);
        System.out.println("Pessoas removida "+ pessoa4.getId()+"-" +pessoa4.getNome());

        System.out.println("--------------------------------------");
        System.out.println("Lista atualizada");
        System.out.println("--------------------------------------");

        for (Pessoa pessoa : pessoa_dao.getAll()) {
            System.out.println(pessoa.getId() + "-" + pessoa.getNome());
        }
        System.out.println("--------------------------------------");
        Pessoa pessoa_selecionada = pessoa_dao.getByld(2);
        System.out.println("A o id selecionado é " + pessoa_selecionada.getId()+"- "+ pessoa_selecionada.getNome());

        
    }
}
