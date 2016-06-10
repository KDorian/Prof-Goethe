package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-06-10.
 */
public class A11Kap06Fragment extends Fragment {


    public A11Kap06Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a11_kap06, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView307);
        String first = "<font color='#EE0000'>die / - / keine</font> Shl&#252;ssel";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView308);
        String first1 = "<font color='#EE0000'>die / - / keine</font> Formulare";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView309);
        String first2 = "<font color='#EE0000'>die / - / keine</font> Briefmarken";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView312);
        String first3 = "<font color='#EE0000'>-e / -&#235;</font>";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView313);
        String first4 = "<font color='#EE0000'>- (e)n</font>";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView314);
        String first5 = "<font color='#EE0000'>- s</font>";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView315);
        String first6 = "<font color='#EE0000'>- er / -&#168;er</font>";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView316);
        String first7 = "<font color='#EE0000'>- / &#168;-</font>";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView324);
        String first8 = "die Stift<font color='#EE0000'>e</font><br/>die Schr<font color='#EE0000'>" +
                "&#228;</font>nk<font color='#EE0000'>e</font>";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView325);
        String first9 = "die Briefmark<font color='#EE0000'>en</font><br/>die Rechnung<font color='#EE0000'>" +
                "en</font>";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView326);
        String first10 = "die Sofa<font color='#EE0000'>s</font>";
        t10.setText(Html.fromHtml(first10));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView327);
        String first11 = "die Bild<font color='#EE0000'>er</font><br/>die Notizb<font color='#EE0000'>&#252;</font>ch<font color='#EE0000'>er</font>";
        t11.setText(Html.fromHtml(first11));

        TextView t12 = (TextView) myInflatedView.findViewById(R.id.textView336);
        String first12 = "<font color='#EE0000'><b>den</b></font>";
        t12.setText(Html.fromHtml(first12));

        TextView t13 = (TextView) myInflatedView.findViewById(R.id.textView337);
        String first13 = "<font color='#EE0000'>das</font>";
        t13.setText(Html.fromHtml(first13));

        TextView t14 = (TextView) myInflatedView.findViewById(R.id.textView338);
        String first14 = "<font color='#EE0000'>die</font>";
        t14.setText(Html.fromHtml(first14));

        TextView t15 = (TextView) myInflatedView.findViewById(R.id.textView339);
        String first15 = "<font color='#EE0000'>die</font>";
        t15.setText(Html.fromHtml(first15));

        TextView t16 = (TextView) myInflatedView.findViewById(R.id.textView341);
        String first16 = "<font color='#EE0000'>ein<b>en</b></font>";
        t16.setText(Html.fromHtml(first16));

        TextView t17 = (TextView) myInflatedView.findViewById(R.id.textView342);
        String first17 = "<font color='#EE0000'>ein</font>";
        t17.setText(Html.fromHtml(first17));

        TextView t18 = (TextView) myInflatedView.findViewById(R.id.textView343);
        String first18 = "<font color='#EE0000'>eine</font>";
        t18.setText(Html.fromHtml(first18));

        TextView t19 = (TextView) myInflatedView.findViewById(R.id.textView344);
        String first19 = "<font color='#EE0000'>-</font>";
        t19.setText(Html.fromHtml(first19));

        TextView t20 = (TextView) myInflatedView.findViewById(R.id.textView346);
        String first20 = "<font color='#EE0000'>kein<b>en</b></font>";
        t20.setText(Html.fromHtml(first20));

        TextView t21 = (TextView) myInflatedView.findViewById(R.id.textView347);
        String first21 = "<font color='#EE0000'>kein</font>";
        t21.setText(Html.fromHtml(first21));

        TextView t22 = (TextView) myInflatedView.findViewById(R.id.textView348);
        String first22 = "<font color='#EE0000'>keine</font>";
        t22.setText(Html.fromHtml(first22));

        TextView t23 = (TextView) myInflatedView.findViewById(R.id.textView349);
        String first23 = "<font color='#EE0000'>keine</font>";
        t23.setText(Html.fromHtml(first23));

        return myInflatedView;
    }
}
