package InventItem.artefacts;

import InventItem.core.Item;
import MapObjects.Units.Player;

/**
 * Created by 777 on 10.06.2017.
 */
public class ArtHeart2 extends Item {
    public ArtHeart2() {
        id = generatorId.incrementAndGet();
        tipitem = 50;
        cena=200;
    }

    @Override
    public void odet(Player player, boolean send) {
        player.pmLife.maxlife += 10;
        if(send)player.sendMsg("2/9/" + player.id + "/8/" + (int) player.pmLife.maxlife, true);
    }

    @Override
    public void snyat(Player player, boolean send) {
        player.pmLife.maxlife -= 10;
        if(player.pmLife.life>player.pmLife.maxlife)player.pmLife.life=player.pmLife.maxlife;
        if(send)player.sendMsg("2/9/" + player.id + "/8/" + (int) player.pmLife.maxlife, true);
    }
}
