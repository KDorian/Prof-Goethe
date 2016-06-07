package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-06-07.
 */
public class A11Kap02Fragment extends Fragment{

    public A11Kap02Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a11_kap02, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView15);
        String first = "arbei<font color='#EE0000'>t</font>en";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView24);
        String first1 = "mach<font color='#EE0000'>e</font>";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView25);
        String first2 = "mach<font color='#EE0000'>st</font>";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView26);
        String first3 = "mach<font color='#EE0000'>t</font>";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView27);
        String first4 = "mach<font color='#EE0000'>en</font>";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView28);
        String first5 = "mach<font color='#EE0000'>t</font>";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView29);
        String first6 = "mach<font color='#EE0000'>en</font>";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView30);
        String first7 = "arbeit<font color='#EE0000'>e</font>";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView31);
        String first8 = "arbeit<font color='#EE0000'><b>e</b>st</font>";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView32);
        String first9 = "arbeit<font color='#EE0000'><b>e</b>t</font>";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView33);
        String first10 = "arbeit<font color='#EE0000'>en</font>";
        t10.setText(Html.fromHtml(first10));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView34);
        String first11 = "arbeit<font color='#EE0000'><b>e</b>t</font>";
        t11.setText(Html.fromHtml(first11));

        TextView t12 = (TextView) myInflatedView.findViewById(R.id.textView35);
        String first12 = "arbeit<font color='#EE0000'>en</font>";
        t12.setText(Html.fromHtml(first12));

        TextView t13 = (TextView) myInflatedView.findViewById(R.id.textView52);
        String first13 = "Ich arbeite <font color='#EE0000'>als</font> Journalistin.";
        t13.setText(Html.fromHtml(first13));

        TextView t14 = (TextView) myInflatedView.findViewById(R.id.textView53);
        String first14 = "Ich arbeite <font color='#EE0000'>bei</font>  X-Media.";
        t14.setText(Html.fromHtml(first14));

        TextView t15 = (TextView) myInflatedView.findViewById(R.id.textView56);
        String first15 = "Ich lebe <font color='#EE0000'>in</font> K&#246;ln.";
        t15.setText(Html.fromHtml(first15));

        TextView t16 = (TextView) myInflatedView.findViewById(R.id.textView58);
        String first16 = "die Journalist<font color='#EE0000'>in</font>";
        t16.setText(Html.fromHtml(first16));

        TextView t17 = (TextView) myInflatedView.findViewById(R.id.textView60);
        String first17 = "die <font color='#EE0000'>&#196;</font>rzt<font color='#EE0000'>in</font>";
        t17.setText(Html.fromHtml(first17));

        return myInflatedView;
    }
}






