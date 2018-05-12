
/**
 * 在这里给出对类 EnemyShipFactory 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class EnemyShipFactory
{
    public EnemyShip makeEnemyShip(String newShipType) {
        EnemyShip newShip = null;
        
        if (newShipType.equals("U")) {
            return new UFOEnemyShip();
        } else if (newShipType.equals("R")) {
            return new RocketEnemyShip();
        }
        
        return newShip;
    }
}
