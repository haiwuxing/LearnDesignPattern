
/**
 * 在这里给出对类 ToppingDecorator 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
abstract class ToppingDecorator implements Pizza
{
    protected Pizza tempPizza;
    
    public ToppingDecorator(Pizza newPizza) {
        tempPizza = newPizza;
    }
    
    public String getDescription() {
        return tempPizza.getDescription();
    }
    
    public double getCost() {
        return tempPizza.getCost();
    }
}
