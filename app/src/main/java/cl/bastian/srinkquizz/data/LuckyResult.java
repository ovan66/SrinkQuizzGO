package cl.bastian.srinkquizz.data;

import java.lang.ref.PhantomReference;

/**
 * Created by santo_000 on 21-10-2016.
 */

public class LuckyResult extends LuckyAnswer{


    public LuckyResult(boolean lucky) {
        super(lucky);
    }

    public String result (){
        return lucky()+" "+day();
    }

    private String lucky () {
        if (isLucky()) {
            return "en hora buena";

    } else {
        return "Animo!!!";
    }
}

    private String day(){
    if (isDay()) {
        return "es tu dia de suerte";
    }else{
        return "mañana sera mejor";
    }
    }
}