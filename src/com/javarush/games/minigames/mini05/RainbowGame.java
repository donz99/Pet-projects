package com.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Цвета радуги
*/

public class RainbowGame extends Game {

    //напишите тут ваш код

    @Override
    public void initialize() {
        setScreenSize(10,7);
        for (int i = 0; i < 7; i++) {
            Color c = Color.RED;
            switch (i){
                case 0: c=Color.RED;
                    break;
                case 1: c=Color.ORANGE;
                    break;
                case 2: c=Color.YELLOW;
                    break;
                case 3: c=Color.GREEN;
                    break;
                case 4: c=Color.BLUE;
                    break;
                case 5: c=Color.INDIGO;
                    break;
                case 6: c=Color.VIOLET;
                    break;
                default:
                    break;
            }

            for (int j = 0; j < 10; j++) {
                setCellColor(j,i,c);
            }
        }
//        Color[] colors = Color.values();
//        for (Color s: colors){
//            System.out.println(s);
//        }
    }

}
