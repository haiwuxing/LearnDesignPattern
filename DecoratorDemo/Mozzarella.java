
/**
 * 在这里给出对类 Mozzarella 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class Mozzarella extends ToppingDecorator
{
    /**
     * 类 Mozzarella 的对象的构造函数
     */
    public Mozzarella(Pizza newPizza)
    {
        super(newPizza);
        
        System.out.println("Adding Dough");
        
        System.out.println("Adding Moz");
    }
    
    public String getDescription() {
        return tempPizza.getDescription() + ", Mozzarell";
    }
    
    public double getCost() {
        return tempPizza.getCost() + .50;
    }
}
