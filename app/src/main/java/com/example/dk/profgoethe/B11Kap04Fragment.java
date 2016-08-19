package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 19.08.2016.
 */
public class B11Kap04Fragment extends Fragment {


    public B11Kap04Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_b11_kap04, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView3379);
        String first = "Es hat sich bis heute nichts ge&#228;ndert, <font color='#EE0000'>obwohl</font> ich Ihnen das mehrfach erkl&#228;rt <font color='#EE0000'>habe</font>.";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView3381);
        String first1 = "Ich habe Ihnen das mehrfach erkl&#228;rt. <font color='#EE0000'>Troztdem hat</font> sich bis heute nichts ge&#228;ndert.";
        t1.setText(Html.fromHtml(first1));

        return myInflatedView;
    }


}
