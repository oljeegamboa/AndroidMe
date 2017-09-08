package com.hyperdev.androidme.data;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hyperdev.androidme.R;

import java.util.List;
import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    private View head;
    private View body;
    private View leg;
    private List<Integer> integerList;
    private List<Integer> viewBody;
    private List<Integer> viewLeg;
    private Random random;
    private int indexCount;
    private int indexBody;
    private int indexLeg;



    public BlankFragment() {
        integerList = AndroidImageAssets.getHeads();
        viewBody = AndroidImageAssets.getBodies();
        viewLeg = AndroidImageAssets.getLegs();
        indexCount = 0;
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        head = view.findViewById(R.id.Head);
        body = view.findViewById(R.id.Body);
        leg = view.findViewById(R.id.Legs);
        head.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (indexCount == integerList.size()) {
                    indexCount = 0;
                }
                head.setBackground(ResourcesCompat.getDrawable(getResources(), integerList.get(indexCount++), null));
            }
        });

        body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (indexBody == viewBody.size()) {
                    indexBody = 0;
                }
                body.setBackground(ResourcesCompat.getDrawable(getResources(), viewBody.get(indexBody++), null));
            }
        });

        leg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (indexLeg == viewLeg.size()) {
                    indexLeg = 0;
                }
                leg.setBackground(ResourcesCompat.getDrawable(getResources(), viewLeg.get(indexLeg++), null));
            }
        });

        return view;
    }

}
