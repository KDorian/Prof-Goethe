package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 21.08.2016.
 */
public class B11Kap08Fragment extends Fragment {


    public B11Kap08Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_b11_kap08, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView3572);
        String first = "<font color='#EE0000'>da</font> Sie nicht gern am Schreibtisch";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView3584);
        String first1 = "<font color='#EE0000'>bevor</font> ich zur Arbeit";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView3585);
        String first2 = "<font color='#EE0000'>w&#228;hrend</font> ich zur Arbeit";
        t2.setText(Html.fromHtml(first2));

        return myInflatedView;
    }


}