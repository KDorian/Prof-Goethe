package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-07-01.
 */
public class A12Kap24Fragment extends Fragment {


    public A12Kap24Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a12_kap24, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView1303);
        String first = "Heute ist <font color='#EE0000'>der achte Januar</font>.";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView1304);
        String first1 = "1.-19.: + <font color='#EE0000'>-te</font>:";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView1306);
        String first2 = "ab 20.: + <font color='#EE0000'>ste</font>:";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView1305);
        String first3 = "der <font color='#EE0000'>erste</font><br/>der zwei<font color='#EE0000'>te</font><br/>der <font color='#EE0000'>dritte</font><br/>der vier<font color='#EE0000'>te</font><br/>der f&#252;nf<font color='#EE0000'>te</font><br/>der sechs<font color='#EE0000'>te</font><br/>der sieb<font color='#EE0000'>te</font><br/>der ach<font color='#EE0000'>te</font><br/>der neun<font color='#EE0000'>te</font><br/>&#8230;";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView1307);
        String first4 = "der zwanzig<font color='#EE0000'>ste</font><br/>der einundzwanzig<font color='#EE0000'>ste</font><br/>&#8230;";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView1311);
        String first5 = "<font color='#EE0000'>Am</font> achte<font color='#EE0000'><b>n</b></font> Januar.";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView1312);
        String first6 = "<font color='#EE0000'>Vom</font> achte<font color='#EE0000'><b>n</b> bis (zum)</font> achtzehnte<font color='#EE0000'><b>n</b></font> Januar.";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView1320);
        String first7 = "<font color='#EE0000'>w&#252;rde</font>";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView1321);
        String first8 = "<font color='#EE0000'>w&#252;rdest</font>";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView1322);
        String first9 = "<font color='#EE0000'>w&#252;rde</font>";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView1323);
        String first10 = "<font color='#EE0000'>w&#252;rden</font>";
        t10.setText(Html.fromHtml(first10));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView1324);
        String first11 = "<font color='#EE0000'>w&#252;rdet</font>";
        t11.setText(Html.fromHtml(first11));

        TextView t12 = (TextView) myInflatedView.findViewById(R.id.textView1325);
        String first12 = "<font color='#EE0000'>w&#252;rden</font>";
        t12.setText(Html.fromHtml(first12));

        TextView t13 = (TextView) myInflatedView.findViewById(R.id.textView1326);
        String first13 = "Ich <font color='#EE0000'>w&#252;rde</font> gern mit dir <font color='#EE0000'>feiern</font>.";
        t13.setText(Html.fromHtml(first13));

        return myInflatedView;
    }


}