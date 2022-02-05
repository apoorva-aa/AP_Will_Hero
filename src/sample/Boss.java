package sample;

import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Boss extends GreenOrc {

    public Boss(int id, Coordinates c, String t, int s, int p, int r, ImageView i){
        super(id,c,t,s,p,r,i);
    }
    @Override
    public void killHero(){

        //this function will kill the player
    }
    @Override
    public void move(TranslateTransition t1){
        this.t=t1;
        t.setNode(me);
        t.setDuration(Duration.millis(800));
        t.setCycleCount(TranslateTransition.INDEFINITE);
        t.setByY(100);
        t.setAutoReverse(true);
        t.play();
    }
    public void upDatePower(int p){

    }
    public void enterInGame(){

    }
}

