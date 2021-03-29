package MapObjects.Artefakts;

import Gm.SpatialHashGrid;
import InventItem.core.Item;
import MapObjects.MapObject;
import MapObjects.Units.Player;
import Utils.Util;

/**
 * Created by 777 on 10.06.2017.
 */
public class Blood1 extends Blood {
    public Blood1(float x, float y, MapObject anomaly) {
        super(x,y,anomaly);
        tip = Util.ARTBLOOD1;}
    @Override
    public void addItem(Player player){
        if(clientvisible){
            Item it= Util.createItem(47);
            if(it!=null)player.inventar.addItem(it);
            if(anomaly!=null)anomaly.signal(8,id);
        }
    }
}
