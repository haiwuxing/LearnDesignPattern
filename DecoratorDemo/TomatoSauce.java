
/**
 * 在这里给出对类 Mozzarella 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class TomatoSauce extends ToppingDecorator
{
    /**
     * 类 TomatoSauce 的对象的构造函数
     */
    public TomatoSauce(Pizza newPizza)
    {
        super(newPizza);
        
        System.out.println("Adding Sauce");
    }
    
    public String getDescription() {
        return tempPizza.getDescription() + ", Tomato Sauce";
    }
    
    public double getCost() {
        return tempPizza.getCost() + .35;
    }
}
