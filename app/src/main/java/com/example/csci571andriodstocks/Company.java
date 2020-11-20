package com.example.csci571andriodstocks;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

public class Company {

    public static final String UP_COLOR = "#319C5E";
    public static final String DOWN_COLOR = "#9B4049";

    String name;
    String ticker;
    String shares;
    String last;
    double change;
    String name_or_shares;
    @DrawableRes
    int arrow;
    @ColorInt
    int changeColor;

    public Company(){
        this.name = "AAA";
        this.shares = "BBB";
        this.last = "CCC";
        this.change = 0;
        this.name_or_shares = "DDD";
        this.arrow = 0;
    }

    public Company(String name, String ticker, String shares, String  last, String prevClose,
                   String name_or_shares, Context ctx) {
        this.name = name;
        this.ticker = ticker;
        this.shares = shares;
        this.last = last;
        this.change =  Math.round((Double.parseDouble(last) - Double.parseDouble(prevClose)) * 100.0)/100.0;

        this.name_or_shares = name_or_shares;

        if (change > 0) {
            this.arrow = R.drawable.ic_twotone_trending_up_24;
            this.changeColor = ResourcesCompat.getColor(ctx.getResources(), R.color.positive, null);
            Log.i("COLOR", "----------color" + changeColor);
        }else  if (change < 0){
            this.arrow = R.drawable.ic_baseline_trending_down_24;
            this.changeColor = ResourcesCompat.getColor(ctx.getResources(), R.color.negative, null);
            Log.i("COLOR", "-----------color" + changeColor);
        }else{
            this.arrow = 0;
        }
    }

    public static void addCompany(){

    }

    public static void removeCompany(){

    }


}
