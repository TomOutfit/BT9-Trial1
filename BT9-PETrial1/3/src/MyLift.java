
import java.util.List;

public class MyLift implements ILift{

    @Override
    public int f1(List<Lift> t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
  public void f2(List<Lift> t) {
        if (t.size()<5) {
            System.out.println("Can't reverse");   ;
        } else {
            Collections.reverse(t.subList(0, 5)); //Collections.reverse -> Đảo ngược các phần tử đầu và giữ nguyên phần còn lại
        }
    }

    @Override
    public void f3(List<Lift> t) {
        if (t.size() > 1 && t.get(2).getLoad() < 20) {
            t.remove(2); //t.remove -> Xóa phần tử của t
        }
    }

}
