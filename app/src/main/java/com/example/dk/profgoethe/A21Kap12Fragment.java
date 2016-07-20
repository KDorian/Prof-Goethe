package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-07-20.
 */
public class A21Kap12Fragment extends Fragment {


    public A21Kap12Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a21_kap12, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView2351);
        String first = "<font color='#EE0000'>Wenn</font> es warm ist,";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView2352);
        String first1 = "<font color='#EE0000'>Wenn</font> es schnell gehen muss,";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView2359);
        String first2 = "<font color='#EE0000'>wenn</font> es warm ist.";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView2360);
        String first3 = "<font color='#EE0000'>wenn</font> es schnell gehen muss.";
        t3.setText(Html.fromHtml(first3));

        return myInflatedView;
    }


}
