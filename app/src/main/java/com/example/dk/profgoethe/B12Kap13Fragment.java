package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 25.08.2016.
 */
public class B12Kap13Fragment extends Fragment {


    public B12Kap13Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_b12_kap13, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView3854);
        String first = "<font color='#EE0000'>Deshalb / Darum / Deswegen / Aus diesem Grund / Daher</font> hat sie das Essen abgesagt.";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView3862);
        String first1 = "Die mutter meinte <font color='#EE0000'>n&#228;mlich</font> nicht das Tier.";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView3868);
        String first2 = "<font color='#EE0000'>des</font> Dialekt<font color='#EE0000'>s</font>";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView3873);
        String first3 = "<font color='#EE0000'>des</font> Missverst&#228;ndnis<font color='#EE0000'>ses</font>";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView3874);
        String first4 = "<font color='#EE0000'>der</font> Betonung";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView3875);
        String first5 = "<font color='#EE0000'>der</font> Bedeutungen";
        t5.setText(Html.fromHtml(first5));

        return myInflatedView;
    }


}