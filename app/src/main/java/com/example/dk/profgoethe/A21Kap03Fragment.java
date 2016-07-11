package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-07-11.
 */
public class A21Kap03Fragment extends Fragment {


    public A21Kap03Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a21_kap03, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView1884);
        String first = "wander-n + -er -> der <font color='#EE0000'>Wander<b>er</b></font>";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView1888);
        String first1 = "erfahr-en + -ung -> die <font color='#EE0000'>Erfahr<b>ung</b></font>";
        t1.setText(Html.fromHtml(first1));

        return myInflatedView;
    }


}
