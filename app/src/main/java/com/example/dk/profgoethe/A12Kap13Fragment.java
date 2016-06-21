package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-06-20.
 */
public class A12Kap13Fragment extends Fragment {


    public A12Kap13Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a12_kap13, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView673);
        String first = "<font color='#EE0000'>dem</font> Dom";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView674);
        String first1 = "<font color='#EE0000'>dem</font> Caf&#233;";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView675);
        String first2 = "<font color='#EE0000'>der</font> Post";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView676);
        String first3 = "<font color='#EE0000'>den</font> Banken";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView681);
        String first4 = "<font color='#EE0000'>-</font> Banken";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView678);
        String first5 = "<font color='#EE0000'>einem</font> Dom";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView679);
        String first6 = "<font color='#EE0000'>einem</font> Caf&#233;";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView680);
        String first7 = "<font color='#EE0000'>einer</font> Post";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView683);
        String first8 = "! in dem = <font color='#EE0000'>im</font> ; an dem = <font color='#EE0000'>am</font>";
        t8.setText(Html.fromHtml(first8));

        return myInflatedView;
    }


}
