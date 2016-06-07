package com.example.dk.profgoethe;

/**
 * Created by DK on 2016-06-04.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by DK on 2016-06-02.
 */
public class A11Kap01Fragment extends Fragment {


    public A11Kap01Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a11_kap01, container,false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView89);
        String first = "komm";
        String next = "<font color='#EE0000'>e</font>";
        t.setText(Html.fromHtml(first + next));

        return myInflatedView;
    }


}