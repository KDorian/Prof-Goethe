package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 28.08.2016.
 */
public class B12Kap15Fragment extends Fragment {


    public B12Kap15Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_b12_kap15, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView4012);
        String first = "Ich spreche <font color='#EE0000'>sowohl</font> Deutsch <font color='#EE0000'>als auch</font> Spanisch.";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView4013);
        String first1 = "Ich spreche <font color='#EE0000'>nicht nur</font> Deutsch, <font color='#EE0000'>sondern auch</font> Spanisch.";
        t1.setText(Html.fromHtml(first1));

        return myInflatedView;
    }


}
