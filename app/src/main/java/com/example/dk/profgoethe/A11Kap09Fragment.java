package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-06-17.
 */
public class A11Kap09Fragment extends Fragment {


    public A11Kap09Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a11_kap09, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView485);
        String first = "<font color='#EE0000'>mag</font>";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView486);
        String first1 = "<font color='#EE0000'>magst</font>";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView487);
        String first2 = "<font color='#EE0000'>mag</font>";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView493);
        String first3 = "m&#246;cht<font color='#EE0000'><b>e</b>st</font>";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView494);
        String first4 = "m&#246;cht<font color='#EE0000'>e</font>";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView496);
        String first5 = "m&#246;cht<font color='#EE0000'><b>e</b>t</font>";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView502);
        String first6 = "<font color='#EE0000'>der</font> Schokoladenkuchen";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView503);
        String first7 = "<font color='#EE0000'>die</font> Fischsuppe";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView504);
        String first8 = "die Schokolade + <font color='#EE0000'>der</font> Kuchen";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView505);
        String first9 = "der Fisch + <font color='#EE0000'>die</font> Suppe";
        t9.setText(Html.fromHtml(first9));

        return myInflatedView;
    }


}
