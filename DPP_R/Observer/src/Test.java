public class Test {
    public static void main(String[] args) {
        //一个明星
        ConcreteIdol idol = new ConcreteIdol();
        //三个粉丝
        ConcreteFan fanA=new ConcreteFan("fanA");
        ConcreteFan fanB= new ConcreteFan("fanB");
        ConcreteFan fanC=new ConcreteFan("fanC");
        //粉丝关注明星（明星拉粉丝）
        idol.addFan(fanA);
        idol.addFan(fanB);
        idol.addFan(fanC);
        //明星发动态
        idol.notify("我会唱、跳、rap、篮球，music");
    }
}
