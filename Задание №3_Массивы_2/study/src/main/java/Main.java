/**
 * @author ARusanova
 */

import sweets.Biscuit;
import sweets.Lollipop;
import sweets.Toffee;
import sweets.Gingerbread;
import sweets.BubbleGum;
import sweets.Sweet;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Biscuit digestive = new Biscuit("Digestive", 0.35, 190.0, "milk");
        Biscuit chocolateChip = new Biscuit("Chocolate chip", 0.5, 240.0, "chocolate");
        Lollipop chupsStrawberry = new Lollipop("Chupa-chups", 0.12, 15.0, "strawberry");
        Lollipop chupsApple = new Lollipop("Chupa-chups", 0.12, 15.0, "apple");
        Lollipop chupsMango = new Lollipop("Chupa-chups", 0.12, 20.0, "mango");
        BubbleGum loveIs = new BubbleGum("Love is", 0.02, 10.0, "S");
        BubbleGum chewingBall = new BubbleGum("Chewing Ball", 0.05, 20.0, "XXL");
        Toffee saltWater = new Toffee("Salt water", 0.2, 300.0, "Medium");
        Toffee butterScotch = new Toffee("ButterScotch", 0.3, 220.0, "Soft");
        Gingerbread xmasTree = new Gingerbread("Christmas Tree", 0.25, 150.0, "christmas");

        Sweet[] present = {digestive, chocolateChip, chocolateChip,
                chupsStrawberry, chupsApple, chupsApple, chupsMango,
                loveIs, loveIs, loveIs, chewingBall, chewingBall,
                saltWater, butterScotch, xmasTree};

        Double totalWeight = 0.0, totalPrice = 0.0;

        for (Sweet sweet : present) {
            totalWeight += sweet.getWeight();
            totalPrice += sweet.getPrice();
        }
        System.out.printf("Общий вес подарка: %.2f кг\n", totalWeight);
        System.out.printf("Общая цена подарка: %.2f руб\n", totalPrice);
        System.out.println("Состав подарка:");
        for (Sweet sweet : present) {
            System.out.println(sweet);
        }
    }
}
