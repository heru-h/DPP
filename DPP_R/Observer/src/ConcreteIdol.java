import java.util.ArrayList;
import java.util.List;

public class ConcreteIdol implements Idol {
    private List<Fan> fanList = new ArrayList<Fan>();
    @Override
    public void addFan(Fan fan){
        fanList.add(fan);
    }
    @Override
    public void deFan(Fan fan){
        fanList.remove(fan);
    }
    @Override
    public void notify(String message){
        for(Fan fan : fanList){
            fan.update(message);
        }
    }
}
