package com.digitopolis.saferide;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bank on 8/6/2015.
 */
public class SecondMainMenu extends Fragment{
    GridView gridView;
    List<ModeView> modeViewList ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View secondPage = inflater.inflate(R.layout.page_second,container,false);

        modeViewList = new ArrayList<>();

        setupImage();
        setupGrid(secondPage);

        return secondPage;
    }


    private void setupGrid(View secondPage){
        ModeViewLayout adapter = new ModeViewLayout(secondPage.getContext(), modeViewList,1);
        gridView=(GridView)secondPage.findViewById(R.id.gridview1);
        gridView.setAdapter(adapter);

//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent sendIntent = new Intent(getActivity(), SelectType.class);
//                sendIntent.setAction(Intent.ACTION_SEND);
//                sendIntent.putExtra("type_selected", "1" + (position+1));
//                startActivity(sendIntent);
//            }
//        });
    }
    private void setupImage(){
        Bitmap icon1 = BitmapFactory.decodeResource(getResources(), R.drawable.icon_07);
        ModeView modeView1 = new ModeView();
        modeView1.setBitmap(icon1);
        modeView1.setName("รถไฟฟ้า BTS");
        modeViewList.add(modeView1);

        Bitmap icon2 = BitmapFactory.decodeResource(getResources(), R.drawable.icon_08);
        ModeView modeView2 = new ModeView();
        modeView2.setBitmap(icon2);
        modeView2.setName("รถใต้ดิน MRT");
        modeViewList.add(modeView2);

        Bitmap icon3 = BitmapFactory.decodeResource(getResources(), R.drawable.icon_09);
        ModeView modeView3 = new ModeView();
        modeView3.setBitmap(icon3);
        modeView3.setName("รถไฟไทย");
        modeViewList.add(modeView3);

        Bitmap icon4 = BitmapFactory.decodeResource(getResources(), R.drawable.icon_10);
        ModeView modeView4 = new ModeView();
        modeView4.setBitmap(icon4);
        modeView4.setName("รถทัวร์");
        modeViewList.add(modeView4);

        Bitmap icon5 = BitmapFactory.decodeResource(getResources(), R.drawable.icon_11);
        ModeView modeView5 = new ModeView();
        modeView5.setBitmap(icon5);
        modeView5.setName("รถสองแถว");
        modeViewList.add(modeView5);

        Bitmap icon6 = BitmapFactory.decodeResource(getResources(), R.drawable.icon_12);
        ModeView modeView6 = new ModeView();
        modeView6.setBitmap(icon6);
        modeView6.setName("อื่นๆ");
        modeViewList.add(modeView6);

    }
}
