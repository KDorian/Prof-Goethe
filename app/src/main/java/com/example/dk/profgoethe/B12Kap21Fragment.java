package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 03.09.2016.
 */
public class B12Kap21Fragment extends Fragment {


    public B12Kap21Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_b12_kap21, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView4269);
        String first = "<font color='#EE0000'>um &#8230; herum</font> + Akkusativ";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView4270);
        String first1 = "<font color='#EE0000'>an / am &#8230; entlang</font> + Dativ";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView4271);
        String first2 = "<font color='#EE0000'>innerhalb, au&#223;erhalb</font> + Genitiv";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView4272);
        String first3 = "Wir fahren dreimal <font color='#EE0000'>um</font> das Zentrum <font color='#EE0000'>herum</font>.";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView4273);
        String first4 = "Es geht <font color='#EE0000'>am</font> Rhein <font color='#EE0000'>entlang</font> nach Basel.";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView4274);
        String first5 = "Der Veranstaltungsort liegt <font color='#EE0000'>au&#223;erhalb</font> der Stadt.";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView4277);
        String first6 = "<font color='#EE0000'>innerhalb, au&#223;erhalb</font> + Genitiv";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView4278);
        String first7 = "<font color='#EE0000'>Innerhalb</font> weniger Tage reisen wir durch Deutschland und die Schweiz.";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView4288);
        String first8 = "<font color='#EE0000'>muss</font> vorher flei&#223;ig";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView4289);
        String first9 = "<font color='#EE0000'>m&#252;ssen</font>";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView4291);
        String first10 = "<font color='#EE0000'>ge&#252;bt werden.</font>";
        t10.setText(Html.fromHtml(first10));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView4292);
        String first11 = "<font color='#EE0000'>gesucht werden.</font>";
        t11.setText(Html.fromHtml(first11));

        return myInflatedView;
    }


}
