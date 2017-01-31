package com.example.rndroid.navigation_menu_ex1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@linimport android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
k Fragment} subclass.
 */
public class MyFragmentForViewPager extends Fragment {


    ImageView imageView;
    int [] imageArray;
    public MyFragmentForViewPager() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v = getActivity().getLayoutInflater().inflate(R.layout.fragment_my_fragment_for_view_pager, container,false);
        imageView = (ImageView) v.findViewById(R.id.imageviewMy);
        imageArray = new int[] {R.drawable.a, R.drawable.b, R.drawable.b,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g};
        Bundle bundle = getArguments();
        int pos = bundle.getInt("pos");
        imageView.setImageResource(imageArray[pos]);

        return v;
    }

}
