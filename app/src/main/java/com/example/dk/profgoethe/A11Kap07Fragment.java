package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-06-12.
 */
public class A11Kap07Fragment extends Fragment {


    public A11Kap07Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a11_kap07, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView381);
        String first = "<font color='#EE0000'>kann</font>";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView382);
        String first1 = "<font color='#EE0000'>kannst</font>";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView383);
        String first2 = "<font color='#EE0000'>kann</font>";
        t2.setText(Html.fromHtml(first2));

        return myInflatedView;
    }
}
