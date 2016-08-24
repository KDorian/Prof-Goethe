package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 23.08.2016.
 */
public class B11Kap12Fragment extends Fragment {


    public B11Kap12Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_b11_kap12, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView3767);
        String first = "<font color='#EE0000'>des / dieses</font> Betriebsrat<font color='#EE0000'>s</font>";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView3768);
        String first1 = "<font color='#EE0000'>des / dieses</font> Jahre<font color='#EE0000'>s</font>";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView3769);
        String first2 = "<font color='#EE0000'>der / dieser</font> Betriebsvereinbarung";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView3770);
        String first3 = "<font color='#EE0000'>der / dieser</font> Umbauarbeiten";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView3772);
        String first4 = "<font color='#EE0000'>eines / unseres</font> Betriebsrat<font color='#EE0000'>s</font>";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView3773);
        String first5 = "<font color='#EE0000'>eines / unseres</font> Jahre<font color='#EE0000'>s</font>";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView3774);
        String first6 = "<font color='#EE0000'>einer / unserer</font> Betriebsvereinbarung";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView3775);
        String first7 = "von Umbauarbeiten / <font color='#EE0000'>unserer</font> Umbauarbeiten";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView3781);
        String first8 = "des / eines geplant<font color='#EE0000'>en</font>";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView3782);
        String first9 = "des / eines schlecht<font color='#EE0000'>en</font>";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView3783);
        String first10 = "der / einer gut<font color='#EE0000'>en</font>";
        t10.setText(Html.fromHtml(first10));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView3784);
        String first11 = "der geplant<font color='#EE0000'>en</font>";
        t11.setText(Html.fromHtml(first11));

        TextView t12 = (TextView) myInflatedView.findViewById(R.id.textView3786);
        String first12 = "geplant<font color='#EE0000'>en</font>";
        t12.setText(Html.fromHtml(first12));

        TextView t13 = (TextView) myInflatedView.findViewById(R.id.textView3787);
        String first13 = "schlecht<font color='#EE0000'>en</font>";
        t13.setText(Html.fromHtml(first13));

        TextView t14 = (TextView) myInflatedView.findViewById(R.id.textView3788);
        String first14 = "gut<font color='#EE0000'>er</font>";
        t14.setText(Html.fromHtml(first14));

        TextView t15 = (TextView) myInflatedView.findViewById(R.id.textView3789);
        String first15 = "geplant<font color='#EE0000'>er</font>";
        t15.setText(Html.fromHtml(first15));

        return myInflatedView;
    }


}
