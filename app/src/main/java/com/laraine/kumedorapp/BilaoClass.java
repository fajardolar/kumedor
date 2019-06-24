package com.laraine.kumedorapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.viewpagerindicator.CirclePageIndicator;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by laraine on 8/4/16.
 */
public class BilaoClass extends Activity {

//    int[] mResources = {
//            R.drawable.bilao
//
//    };
    CustomPagerAdapter mCustomPagerAdapter;
    ViewPager mViewPager;
    CirclePageIndicator titleIndicator;
    ArrayList<String> mResources = new ArrayList<String>();// list of file paths
    File[] listFile;
    File directory;
    public static String tempDir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appetizer);

        //Creating file directory on SD Card
        directory = new File(Environment.getExternalStorageDirectory()
                + File.separator + "Kumedor/Bilao");
        tempDir = directory.toString();

        prepareDirectory();
        getFromSdcard();


        mCustomPagerAdapter = new CustomPagerAdapter(this);

        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mViewPager.setAdapter(mCustomPagerAdapter);
        //Bind the title indicator to the adapter
        titleIndicator = (CirclePageIndicator)findViewById(R.id.titles);
        titleIndicator.setFillColor(Color.BLACK);
        titleIndicator.setRadius(8);
        titleIndicator.setStrokeColor(Color.BLACK);
        titleIndicator.setViewPager(mViewPager);

        titleIndicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            public void onPageScrollStateChanged(int state) {
            }

            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            public void onPageSelected(int position) {
//                if (position == 0) {
                Log.i("Selected", String.valueOf(position));

            }


        });

        titleIndicator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }


    public void getFromSdcard() {
        File file = new File(android.os.Environment.getExternalStorageDirectory(), "Kumedor/Bilao");

        if (file.isDirectory()) {
            listFile = file.listFiles();

            if (listFile.length > 0) {

                for (int i = 0; i < listFile.length; i++) {

                    mResources.add(listFile[i].getAbsolutePath());

                }

            } else {
                finish();
                Toast.makeText(this, "Folder is empty.", Toast.LENGTH_LONG);
            }
        }
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
        File tempdir = new File(tempDir);
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



    class CustomPagerAdapter extends PagerAdapter {

        Context mContext;
        LayoutInflater mLayoutInflater;

        public CustomPagerAdapter(Context context) {
            mContext = context;
            mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return mResources.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == ((RelativeLayout) object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View itemView = mLayoutInflater.inflate(R.layout.pager_item, container, false);

            ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);
            imageView.setImageBitmap(
                    decodeSampledBitmapFromFile(mResources.get(position), 100, 100));

            Button btnBck = (Button) itemView.findViewById(R.id.btnBacks);
            btnBck.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {

                    finish();
                }

            });


            container.addView(itemView);

            return itemView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((RelativeLayout) object);
        }
    }

    public static Bitmap decodeSampledBitmapFromFile(String path,int reqWidth, int reqHeight) {

        // First decode with inJustDecodeBounds=true to check dimensions
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inDither = true;

        // Calculate inSampleSize
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);

        // Decode bitmap with inSampleSize set
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(path,options);
    }

    public static int calculateInSampleSize(
            BitmapFactory.Options options, int reqWidth, int reqHeight) {
        // Raw height and width of image
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {

            final int halfHeight = height / 2;
            final int halfWidth = width / 2;

            // Calculate the largest inSampleSize value that is a power of 2 and keeps both
            // height and width larger than the requested height and width.
            while ((halfHeight / inSampleSize) > reqHeight
                    && (halfWidth / inSampleSize) > reqWidth) {
                inSampleSize *= 2;
            }
        }

        return inSampleSize;
    }

}
