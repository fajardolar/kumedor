package com.laraine.kumedorapp;

import android.content.Intent;
import android.os.Environment;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    Button btnFirst;
    private boolean doubleBackToExitPressedOnce = false;
    File dAppetizer, dBeef, dBeverages, dBilao, dChickeen, dDessert, dFamilyViand, dFish, dMenuMeal, dNoodleSoup, dNoodlePlatter, dPork, dRice, dRiceToppings, dSalad, dSeafood, dShakes, dSushi, dVegetables, dSoup;
    public static String tAppetizer, tBeef, tBeverages, tBilao, tChicken, tDessert, tFamilyViand, tFish, tMenuMeal, tNoodleSoup, tNoodlePlatter, tPork, tRice, tRiceTppings, tSalad, tSeafood, tShakes, tSushi, tVegetables, tSoup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating file directory on SD Card
        dAppetizer = new File(Environment.getExternalStorageDirectory()
                + File.separator + "Kumedor/Appetizer");
        tAppetizer = dAppetizer.toString();

        dBeef = new File(Environment.getExternalStorageDirectory()
                + File.separator + "Kumedor/Beef");
        tBeef = dBeef.toString();

        dBeverages = new File(Environment.getExternalStorageDirectory()
                + File.separator + "Kumedor/Beverages");
        tBeverages = dBeverages.toString();

        dBilao = new File(Environment.getExternalStorageDirectory()
                + File.separator + "Kumedor/Bilao");
        tBilao = dBilao.toString();

        dChickeen = new File(Environment.getExternalStorageDirectory()
                + File.separator + "Kumedor/Chicken");
        tChicken = dChickeen.toString();

        dDessert = new File(Environment.getExternalStorageDirectory()
                + File.separator + "Kumedor/Dessert");
        tDessert = dDessert.toString();
        dFamilyViand = new File(Environment.getExternalStorageDirectory()
                + File.separator + "Kumedor/Family Viand");
        tFamilyViand = dFamilyViand.toString();

        dFish = new File(Environment.getExternalStorageDirectory()
                + File.separator + "Kumedor/Fish");
        tFish = dFish.toString();

        dMenuMeal = new File(Environment.getExternalStorageDirectory()
                + File.separator + "Kumedor/Menu Meal");
        tMenuMeal = dMenuMeal.toString();

        dNoodleSoup = new File(Environment.getExternalStorageDirectory()
                + File.separator + "Kumedor/Noodle Soup");
        tNoodleSoup = dNoodleSoup.toString();

        dNoodlePlatter = new File(Environment.getExternalStorageDirectory()
                + File.separator + "Kumedor/Noodle Platter");
        tNoodlePlatter = dNoodlePlatter.toString();

        dPork = new File(Environment.getExternalStorageDirectory()
                + File.separator + "Kumedor/Pork");
        tPork = dPork.toString();

        dRice = new File(Environment.getExternalStorageDirectory()
                + File.separator + "Kumedor/Rice");
        tRice = dRice.toString();

        dRiceToppings = new File(Environment.getExternalStorageDirectory()
                + File.separator + "Kumedor/Rice Toppings");
        tRiceTppings = dRiceToppings.toString();

        dSalad = new File(Environment.getExternalStorageDirectory()
                + File.separator + "Kumedor/Salad");
        tSalad = dSalad.toString();

        dSeafood = new File(Environment.getExternalStorageDirectory()
                + File.separator + "Kumedor/Seafood");
        tSeafood = dSeafood.toString();

        dShakes = new File(Environment.getExternalStorageDirectory()
                + File.separator + "Kumedor/Shakes");
        tShakes = dShakes.toString();


        dSoup = new File(Environment.getExternalStorageDirectory()
                + File.separator + "Kumedor/Soup");
        tSoup = dSoup.toString();

        dSushi = new File(Environment.getExternalStorageDirectory()
                + File.separator + "Kumedor/Sushi");
        tSushi = dSushi.toString();

        dVegetables = new File(Environment.getExternalStorageDirectory()
                + File.separator + "Kumedor/Vegetables");
        tVegetables = dVegetables.toString();

        btnFirst = (Button)findViewById(R.id.btnPage);

        btnFirst.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, MenuPage.class);
                MainActivity.this.startActivity(myIntent);

            }

        });

        prepareDirectory();
        prepareDirectoryBeef();
        prepareDirectoryBev();
        prepareDirectoryBilao();
        prepareDirectoryChicken();
        prepareDirectoryDessert();
        prepareDirectoryFamily();
        prepareDirectoryFish();
        prepareDirectoryMenu();
        prepareDirectoryNoodleS();
        prepareDirectoryNoodleP();
        prepareDirectoryPork();
        prepareDirectoryRice();
        prepareDirectoryRiceToppings();
        prepareDirectorySalad();
        prepareDirectorySeafood();
        prepareDirectoryShakes();
        prepareDirectorySoup();
        prepareDirectorySushi();
        prepareDirectoryVegetables();

    }


    private boolean prepareDirectoryVegetables() {
        try {
            if (makedirVe()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Could not initiate File System.. Check if SD card is mounted properly.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    private boolean makedirVe() {
        File tempdir = new File(tVegetables);
        if (!tempdir.exists()) {
            tempdir.mkdirs();

        }
        return (tempdir.isDirectory());
    }

    private boolean prepareDirectorySushi() {
        try {
            if (makedirSu()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Could not initiate File System.. Check if SD card is mounted properly.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    private boolean makedirSu() {
        File tempdir = new File(tSushi);
        if (!tempdir.exists()) {
            tempdir.mkdirs();

        }
        return (tempdir.isDirectory());
    }

    private boolean prepareDirectorySoup() {
        try {
            if (makedirSo()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Could not initiate File System.. Check if SD card is mounted properly.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    private boolean makedirSo() {
        File tempdir = new File(tSoup);
        if (!tempdir.exists()) {
            tempdir.mkdirs();

        }
        return (tempdir.isDirectory());
    }

    private boolean prepareDirectoryShakes() {
        try {
            if (makedirSh()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Could not initiate File System.. Check if SD card is mounted properly.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    private boolean makedirSh() {
        File tempdir = new File(tShakes);
        if (!tempdir.exists()) {
            tempdir.mkdirs();

        }
        return (tempdir.isDirectory());
    }

    private boolean prepareDirectorySeafood() {
        try {
            if (makedirSea()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Could not initiate File System.. Check if SD card is mounted properly.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    private boolean makedirSea() {
        File tempdir = new File(tSeafood);
        if (!tempdir.exists()) {
            tempdir.mkdirs();

        }
        return (tempdir.isDirectory());
    }

    private boolean prepareDirectorySalad() {
        try {
            if (makedirSalad()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Could not initiate File System.. Check if SD card is mounted properly.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    private boolean makedirSalad() {
        File tempdir = new File(tSalad);
        if (!tempdir.exists()) {
            tempdir.mkdirs();

        }
        return (tempdir.isDirectory());
    }


    private boolean prepareDirectoryRiceToppings() {
        try {
            if (makedirRiceT()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Could not initiate File System.. Check if SD card is mounted properly.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    private boolean makedirRiceT() {
        File tempdir = new File(tRiceTppings);
        if (!tempdir.exists()) {
            tempdir.mkdirs();

        }
        return (tempdir.isDirectory());
    }

    private boolean prepareDirectoryRice() {
        try {
            if (makedirRice()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Could not initiate File System.. Check if SD card is mounted properly.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    private boolean makedirRice() {
        File tempdir = new File(tRice);
        if (!tempdir.exists()) {
            tempdir.mkdirs();

        }
        return (tempdir.isDirectory());
    }

    private boolean prepareDirectoryPork() {
        try {
            if (makedirPork()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Could not initiate File System.. Check if SD card is mounted properly.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    private boolean makedirPork() {
        File tempdir = new File(tPork);
        if (!tempdir.exists()) {
            tempdir.mkdirs();

        }
        return (tempdir.isDirectory());
    }


    private boolean prepareDirectoryNoodleP() {
        try {
            if (makedirNoodP()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Could not initiate File System.. Check if SD card is mounted properly.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    private boolean makedirNoodP() {
        File tempdir = new File(tNoodlePlatter);
        if (!tempdir.exists()) {
            tempdir.mkdirs();

        }
        return (tempdir.isDirectory());
    }



    private boolean prepareDirectoryNoodleS() {
        try {
            if (makedirNood()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Could not initiate File System.. Check if SD card is mounted properly.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    private boolean makedirNood() {
        File tempdir = new File(tNoodleSoup);
        if (!tempdir.exists()) {
            tempdir.mkdirs();

        }
        return (tempdir.isDirectory());
    }


    private boolean prepareDirectoryMenu() {
        try {
            if (makedirMenu()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Could not initiate File System.. Check if SD card is mounted properly.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    private boolean makedirMenu() {
        File tempdir = new File(tMenuMeal);
        if (!tempdir.exists()) {
            tempdir.mkdirs();

        }
        return (tempdir.isDirectory());
    }


    private boolean prepareDirectoryFish() {
        try {
            if (makedirFis()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Could not initiate File System.. Check if SD card is mounted properly.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    private boolean makedirFis() {
        File tempdir = new File(tFish);
        if (!tempdir.exists()) {
            tempdir.mkdirs();

        }
        return (tempdir.isDirectory());
    }

    private boolean prepareDirectoryFamily() {
        try {
            if (makedirFa()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Could not initiate File System.. Check if SD card is mounted properly.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    private boolean makedirFa() {
        File tempdir = new File(tFamilyViand);
        if (!tempdir.exists()) {
            tempdir.mkdirs();

        }
        return (tempdir.isDirectory());
    }

    private boolean prepareDirectoryDessert() {
        try {
            if (makedirDessert()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Could not initiate File System.. Check if SD card is mounted properly.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    private boolean makedirDessert() {
        File tempdir = new File(tDessert);
        if (!tempdir.exists()) {
            tempdir.mkdirs();

        }
        return (tempdir.isDirectory());
    }


    private boolean prepareDirectoryChicken() {
        try {
            if (makedirChic()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Could not initiate File System.. Check if SD card is mounted properly.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    private boolean makedirChic() {
        File tempdir = new File(tChicken);
        if (!tempdir.exists()) {
            tempdir.mkdirs();

        }
        return (tempdir.isDirectory());
    }

    private boolean prepareDirectoryBev() {
        try {
            if (makedirBev()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Could not initiate File System.. Check if SD card is mounted properly.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    private boolean makedirBev() {
        File tempdir = new File(tBeverages);
        if (!tempdir.exists()) {
            tempdir.mkdirs();

        }
        return (tempdir.isDirectory());
    }


    private boolean prepareDirectoryBilao() {
        try {
            if (makedirBilao()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Could not initiate File System.. Check if SD card is mounted properly.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    private boolean makedirBilao() {
        File tempdir = new File(tBilao);
        if (!tempdir.exists()) {
            tempdir.mkdirs();

        }
        return (tempdir.isDirectory());
    }



    private boolean prepareDirectoryBeef() {
        try {
            if (makedirBeef()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Could not initiate File System.. Check if SD card is mounted properly.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    private boolean makedirBeef() {
        File tempdir = new File(tBeef);
        if (!tempdir.exists()) {
            tempdir.mkdirs();

//        if (tempdir.isDirectory()) {
//            File[] files = tempdir.listFiles();
//            for (File file : files) {
//                if (!file.delete()) {
////                    System.out.println("Failed to delete " + file);
//               //     Log.i("CaptureSignature", "Failed to delete. " + file);
//                }
            //    }
            //  }

        }
        return (tempdir.isDirectory());
    }



    private boolean prepareDirectory() {
        try {
            if (makedirs()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Could not initiate File System.. Check if SD card is mounted properly.", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    private boolean makedirs() {
        File tempdir = new File(tAppetizer);
        if (!tempdir.exists()) {
            tempdir.mkdirs();

//        if (tempdir.isDirectory()) {
//            File[] files = tempdir.listFiles();
//            for (File file : files) {
//                if (!file.delete()) {
////                    System.out.println("Failed to delete " + file);
//               //     Log.i("CaptureSignature", "Failed to delete. " + file);
//                }
            //    }
            //  }

        }
        return (tempdir.isDirectory());
    }






    @Override
    public void onBackPressed() {
//        Toast.makeText(this, "Press again to exit.", Toast.LENGTH_SHORT).show();
//        super.onBackPressed();
            System.exit(0);
//            finish();
//            System.exit(0);
    }


}
