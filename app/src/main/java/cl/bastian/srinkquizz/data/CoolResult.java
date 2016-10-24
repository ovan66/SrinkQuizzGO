package cl.bastian.srinkquizz.data;

import static android.R.attr.id;

/**
 * Created by santo_000 on 19-10-2016.
 */

public class CoolResult extends CoolAnswer {


    public CoolResult(String user, boolean party, int drinks) {
        super(user, party, drinks);
    }

    public String result() {
        return getUser() + " " + party() + " " + drinks();
    }

    private String party() {
        if (isParty()) {
            return "Eres un salvaje";
        } else {
            return "Vaya empollon";
        }
    }

    private String drinks() {
        if (getDrinks() <= 4) {
            return "Bebes con moderacion";
        } else if (getDrinks() >= 5 && getDrinks() <= 8) {
            return "Eres brutal bebiendo";
        } else {
            return "Bebes como orilla de playa";
        }

    }

}
