package cl.bastian.srinkquizz.data;

import android.content.Context;

/**
 * Created by santo_000 on 24-10-2016.
 */

public class MatchAnswer {

    private String name, loverName, quarter;
    private Context context;

    public MatchAnswer(String name, String loverName, String quarter, Context context) {
        this.name = name;
        this.loverName = loverName;
        this.quarter = quarter;
        this.context = context;
    }

    public String getName() {
        return name;
    }

    public String getLoverName() {
        return loverName;
    }

    public Context getContext() {
        return context;
    }

    public String getQuarter() {
        return quarter;
    }
}
