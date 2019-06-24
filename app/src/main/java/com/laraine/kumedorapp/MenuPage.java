package com.laraine.kumedorapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by joseph on 7/30/2016.
 */
public class MenuPage extends Activity {

    Button btnBack, btnApp, btnBeef, btnBev, btnBilao, btnChicken, btnDessert, btnFamilyViand, btnFish, btnMenuMeal, btnNoodleSoup, btnNoodlePlatter, btnPork, btnRice, btnRiceToppings, btnSalad, btnShakes, btnSeafood, btnSoup, btnSushi, btnVegetables;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnBack  = (Button)findViewById(R.id.btnBack);
        btnApp = (Button)findViewById(R.id.btnApp);
        btnBeef = (Button)findViewById(R.id.btnBeef);
        btnBev = (Button)findViewById(R.id.btnBeverages);
        btnBilao = (Button)findViewById(R.id.btnBilao);
        btnChicken = (Button)findViewById(R.id.btnChicken);
        btnDessert = (Button)findViewById(R.id.btnDessert);
        btnFamilyViand = (Button)findViewById(R.id.btnFamilyViand);
        btnFish = (Button)findViewById(R.id.btnFish);
        btnMenuMeal = (Button)findViewById(R.id.btnMenuMeal);
        btnNoodleSoup = (Button)findViewById(R.id.btnNoodleSoup);
        btnNoodlePlatter = (Button)findViewById(R.id.btnNoodlePlatter);
        btnPork = (Button)findViewById(R.id.btnPork);
        btnRice = (Button)findViewById(R.id.btnRice);
        btnRiceToppings = (Button)findViewById(R.id.btnRiceToppings);
        btnSalad = (Button)findViewById(R.id.btnSalad);
        btnSeafood = (Button)findViewById(R.id.btnSeafood);
        btnShakes = (Button)findViewById(R.id.btnShakes);
        btnSoup = (Button)findViewById(R.id.btnSoup);
        btnSushi = (Button)findViewById(R.id.btnSushi);
        btnVegetables = (Button)findViewById(R.id.btnVegetables);

        btnVegetables.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MenuPage.this, VegetablesClass.class);
                MenuPage.this.startActivity(myIntent);

            }

        });

        btnSushi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MenuPage.this, SushiClass.class);
                MenuPage.this.startActivity(myIntent);

            }

        });

        btnSoup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MenuPage.this, SoupClass.class);
                MenuPage.this.startActivity(myIntent);

            }

        });

        btnShakes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MenuPage.this, ShakesClass.class);
                MenuPage.this.startActivity(myIntent);

            }

        });
        btnSeafood.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MenuPage.this, SeafoodClass.class);
                MenuPage.this.startActivity(myIntent);

            }

        });

        btnSalad.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MenuPage.this, SaladClass.class);
                MenuPage.this.startActivity(myIntent);

            }

        });

        btnRiceToppings.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MenuPage.this, RiceToppingsClass.class);
                MenuPage.this.startActivity(myIntent);

            }

        });

        btnRice.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MenuPage.this, RiceClass.class);
                MenuPage.this.startActivity(myIntent);

            }

        });
        btnPork.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MenuPage.this, PorkClass.class);
                MenuPage.this.startActivity(myIntent);

            }

        });
        btnNoodlePlatter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MenuPage.this, NoodlePlatterClass.class);
                MenuPage.this.startActivity(myIntent);

            }

        });
        btnNoodleSoup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MenuPage.this, NoodleSoupClass.class);
                MenuPage.this.startActivity(myIntent);

            }

        });
        btnMenuMeal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MenuPage.this, MenuMealClass.class);
                MenuPage.this.startActivity(myIntent);

            }

        });

        btnFish.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MenuPage.this, FishClass.class);
                MenuPage.this.startActivity(myIntent);

            }

        });
        btnFamilyViand.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MenuPage.this, FamilyViandClass.class);
                MenuPage.this.startActivity(myIntent);

            }

        });

        btnDessert.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MenuPage.this, DessertClass.class);
                MenuPage.this.startActivity(myIntent);

            }

        });

        btnChicken.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MenuPage.this, ChickenClass.class);
                MenuPage.this.startActivity(myIntent);

            }

        });

        btnBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

//                Intent myIntent = new Intent(MenuPage.this, MainActivity.class);
//                MenuPage.this.startActivity(myIntent);
                finish();

            }

        });

        btnApp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MenuPage.this, AppetizerClass.class);
                MenuPage.this.startActivity(myIntent);

            }

        });
        btnBeef.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MenuPage.this, BeefClass.class);
                MenuPage.this.startActivity(myIntent);

            }

        });
        btnBev.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MenuPage.this, BeveragesClass.class);
                MenuPage.this.startActivity(myIntent);

            }

        });
        btnBilao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MenuPage.this, BilaoClass.class);
                MenuPage.this.startActivity(myIntent);

            }

        });

}

}
