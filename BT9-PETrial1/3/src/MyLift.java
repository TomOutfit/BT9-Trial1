
import java.util.List;

public class MyLift implements ILift{

    @Override
    public int f1(List<Lift> t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void f2(List<Lift> t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void f3(List<Lift> t) {
        if (t.size() > 1 && t.get(2).getLoad() < 20) {
            t.remove(2);
        }
    }

}