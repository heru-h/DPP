public class ConcreteFan implements Fan {
    private String fanName;
    public  ConcreteFan(String B){
        this.fanName=B;
    }
    @Override
    public void update(String message){
        System.out.println(fanName + "知道了:" + message + "这条消息");
    }
}
