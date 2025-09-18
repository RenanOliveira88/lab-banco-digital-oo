
import java.util.Comparator;

public class ContaComparatorAgencia implements Comparator<Conta> {
    
    @Override
    public int compare(Conta o1, Conta o2) {
        return Integer.compare(o1.agencia, o2.agencia);
    }
}
