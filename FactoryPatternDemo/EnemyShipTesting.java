import java.util.Scanner;

/**
 * 在这里给出对类 EnemyShipTesting 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class EnemyShipTesting
{
    // 错误的方式
    public static void main(String[] args) {
        EnemyShip theEnemy = null;
        
        Scanner userInput = new Scanner(System.in);
        String enemyShipOption = "";
        System.out.print("What type of ship? (U / R)");
        
        if (userInput.hasNextLine()) {
            enemyShipOption = userInput.nextLine();
        }
        
        if (enemyShipOption.equals("U")) {
            theEnemy = new UFOEnemyShip();
        } else if (enemyShipOption.equals("R")) {
            theEnemy = new RocketEnemyShip();
        }
        
        doStuffEnemy(theEnemy);
    }
    
    public static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
