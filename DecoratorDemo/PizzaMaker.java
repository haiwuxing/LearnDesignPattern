
/**
 * 在这里给出对类 PizzaMaker 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class PizzaMaker
{
    public static void main(String[] args) {
        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        
        System.out.println("Ingredients: " + basicPizza.getDescription());
        
        System.out.println("Price: " + basicPizza.getCost());
    }
}
