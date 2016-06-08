package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-06-08.
 */
public class A11Kap03Fragment extends Fragment {


    public A11Kap03Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a11_kap03, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView172);
        String first = "<font color='#EE0000'>mein</font> Bruder";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView173);
        String first1 = "<font color='#EE0000'>dein</font> Bruder";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView174);
        String first2 = "<font color='#EE0000'>meine</font> Schwester";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView175);
        String first3 = "<font color='#EE0000'>deine</font> Schwester";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView176);
        String first4 = "<font color='#EE0000'>meine</font> Eltern";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView177);
        String first5 = "<font color='#EE0000'>deine</font> Eltern";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView180);
        String first6 = "<font color='#EE0000'>Ist</font> das deine Frau?";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView183);
        String first7 = "Wer <font color='#EE0000'>ist</font> das?";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView184);
        String first8 = "Das <font color='#EE0000'>ist</font> meine Frau.";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView200);
        String first9 = "sprech<font color='#EE0000'>e</font>";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView203);
        String first10 = "spr<font color='#EE0000'><b>i</b></font>ch<font color='#EE0000'>st</font>";
        t10.setText(Html.fromHtml(first10));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView206);
        String first11 = "spr<font color='#EE0000'><b>i</b></font>ch<font color='#EE0000'>t</font>";
        t11.setText(Html.fromHtml(first11));

        TextView t12 = (TextView) myInflatedView.findViewById(R.id.textView202);
        String first12 = "sprech<font color='#EE0000'>en</font>";
        t12.setText(Html.fromHtml(first12));

        TextView t13 = (TextView) myInflatedView.findViewById(R.id.textView205);
        String first13 = "sprech<font color='#EE0000'>t</font>";
        t13.setText(Html.fromHtml(first13));

        TextView t14 = (TextView) myInflatedView.findViewById(R.id.textView208);
        String first14 = "sprech<font color='#EE0000'>en</font>";
        t14.setText(Html.fromHtml(first14));

        return myInflatedView;
    }


}