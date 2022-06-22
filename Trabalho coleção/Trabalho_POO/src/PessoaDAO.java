import java.util.ArrayList;

public class PessoaDAO {
    ArrayList<Pessoa> lpessoas = new ArrayList<>();

    public Pessoa getByld(int id) {
        if (lpessoas.isEmpty()) {
            return null;
        } else {
            for (Pessoa pessoa : lpessoas) {
                if (id == pessoa.getId()) {
                    return pessoa;
                }
            }
            return null;
        }
    }

    public ArrayList<Pessoa> getAll() {
        return lpessoas;
    }

    public void add(Pessoa pessoa) {
        lpessoas.add(pessoa);
        
    }

    public void delete(Pessoa pessoa) {
        lpessoas.remove(pessoa);

    }

}
