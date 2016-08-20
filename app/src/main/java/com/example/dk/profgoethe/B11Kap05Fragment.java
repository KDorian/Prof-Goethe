package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 20.08.2016.
 */
public class B11Kap05Fragment extends Fragment {


    public B11Kap05Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_b11_kap05, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView3426);
        String first = "Pr&#228;sens + Zeitangabe<br/><font color='#EE0000'>Morgen kaufe</font> ich einen neuen PC.";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView3427);
        String first1 = "Futur I<br/>Bald <font color='#EE0000'>wird</font> in jedem Haushalt ein PC <font color='#EE0000'>stehen</font>.";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView3431);
        String first2 = "Bald <font color='#EE0000'>wird</font> in fast jedem Haushalt ein PC <font color='#EE0000'>stehen</font>.";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView3433);
        String first3 = "Du <font color='#EE0000'>wirst</font> jetzt bitte die Musik leiser <font color='#EE0000'>machen</font>!";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView3435);
        String first4 = "Ich <font color='#EE0000'>werde</font> morgen mit dem Rauchen <font color='#EE0000'>aufh&#246;ren</font>.";
        t4.setText(Html.fromHtml(first4));

        return myInflatedView;
    }


}