import java.util.Comparator;

public class ContaComparatorCliente implements Comparator<Conta> {

    @Override
    public int compare(Conta o1, Conta o2) {
        return o1.cliente.getNome().compareToIgnoreCase(o2.cliente.getNome());
    }
}
