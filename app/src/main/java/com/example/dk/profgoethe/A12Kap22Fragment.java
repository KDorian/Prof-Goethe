package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-06-29.
 */
public class A12Kap22Fragment extends Fragment {


    public A12Kap22Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a12_kap22, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView1187);
        String first = "<font color='#EE0000'>besser</font>";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView1188);
        String first1 = "<font color='#EE0000'>lieber</font>";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView1194);
        String first2 = "<font color='#EE0000'>mehr</font>";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView1191);
        String first3 = "<font color='#EE0000'>am besten</font>";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView1192);
        String first4 = "<font color='#EE0000'>am liebsten</font>";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView1195);
        String first5 = "<font color='#EE0000'>am meisten</font>";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView1205);
        String first6 = "lustig<font color='#EE0000'>er</font>";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView1206);
        String first7 = "<font color='#EE0000'><b>&#228;</b></font>lt<font color='#EE0000'>er</font>";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView1207);
        String first8 = "gr<font color='#EE0000'><b>&#246;</b></font>&#223;<font color='#EE0000'>er</font>";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView1208);
        String first9 = "kl<font color='#EE0000'><b>&#252;</b></font>g<font color='#EE0000'>er</font>";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView1211);
        String first10 = "<font color='#EE0000'>am</font> lustig<font color='#EE0000'>sten</font>";
        t10.setText(Html.fromHtml(first10));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView1212);
        String first11 = "<font color='#EE0000'>am <b>&#228;</b></font>lt<font color='#EE0000'><b>e</b>sten</font>";
        t11.setText(Html.fromHtml(first11));

        TextView t12 = (TextView) myInflatedView.findViewById(R.id.textView1213);
        String first12 = "<font color='#EE0000'>am</font> gr<font color='#EE0000'><b>&#246;</b></font>&#223;<font color='#EE0000'>ten</font>";
        t12.setText(Html.fromHtml(first12));

        TextView t13 = (TextView) myInflatedView.findViewById(R.id.textView1214);
        String first13 = "<font color='#EE0000'>am</font> kl<font color='#EE0000'><b>&#252;</b></font>g<font color='#EE0000'>sten</font>";
        t13.setText(Html.fromHtml(first13));

        TextView t14 = (TextView) myInflatedView.findViewById(R.id.textView1216);
        String first14 = "<font color='#EE0000'>a</font> -> <font color='#EE0000'>&#228;</font>";
        t14.setText(Html.fromHtml(first14));

        TextView t15 = (TextView) myInflatedView.findViewById(R.id.textView1217);
        String first15 = "<font color='#EE0000'>o</font> -> <font color='#EE0000'>&#246;</font>";
        t15.setText(Html.fromHtml(first15));

        TextView t16 = (TextView) myInflatedView.findViewById(R.id.textView1218);
        String first16 = "<font color='#EE0000'>u</font> -> <font color='#EE0000'>&#252;</font>";
        t16.setText(Html.fromHtml(first16));

        TextView t17 = (TextView) myInflatedView.findViewById(R.id.textView1222);
        String first17 = "<font color='#EE0000'>&#228;</font>lter";
        t17.setText(Html.fromHtml(first17));

        TextView t18 = (TextView) myInflatedView.findViewById(R.id.textView1223);
        String first18 = "gr<font color='#EE0000'>&#246;</font>&#223;er";
        t18.setText(Html.fromHtml(first18));

        TextView t19 = (TextView) myInflatedView.findViewById(R.id.textView1224);
        String first19 = "k<font color='#EE0000'>&#252;</font>rzer";
        t19.setText(Html.fromHtml(first19));

        TextView t20 = (TextView) myInflatedView.findViewById(R.id.textView1225);
        String first20 = "am <font color='#EE0000'>&#228;</font>ltesten";
        t20.setText(Html.fromHtml(first20));

        TextView t21 = (TextView) myInflatedView.findViewById(R.id.textView1226);
        String first21 = "am gr<font color='#EE0000'>&#246;</font>&#223;ten";
        t21.setText(Html.fromHtml(first21));

        TextView t22 = (TextView) myInflatedView.findViewById(R.id.textView1227);
        String first22 = "am k<font color='#EE0000'>&#252;</font>rzesten";
        t22.setText(Html.fromHtml(first22));

        TextView t23 = (TextView) myInflatedView.findViewById(R.id.textView1230);
        String first23 = "Lila (+) mag sie <font color='#EE0000'>genau<b>so</b> gern <b>wie</b></font> Rosa (+).";
        t23.setText(Html.fromHtml(first23));

        TextView t24 = (TextView) myInflatedView.findViewById(R.id.textView1232);
        String first24 = "Das Hemd (++) gef&#228;llt ihr <font color='#EE0000'>besser <b>als</b></font> die Hose (+).";
        t24.setText(Html.fromHtml(first24));

        return myInflatedView;
    }


}
