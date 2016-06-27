package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-06-27.
 */
public class A12Kap20Fragment extends Fragment {


    public A12Kap20Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a12_kap20, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView1088);
        String first = "<font color='#EE0000'>Deck &#8230; !</font>";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView1089);
        String first1 = "<font color='#EE0000'>Schlaf &#8230; !</font>";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView1090);
        String first2 = "<font color='#EE0000'>Vergiss &#8230; !</font>";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView1091);
        String first3 = "<font color='#EE0000'>R&#228;um &#8230; aus!</font>";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView1092);
        String first4 = "<font color='#EE0000'>Sei &#8230; !</font>";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView1093);
        String first5 = "<font color='#EE0000'>Hab &#8230; !</font>";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView1096);
        String first6 = "<font color='#EE0000'>Deckt &#8230; !</font>";
        t6.setText(Html.fromHtml(first5));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView1097);
        String first7 = "<font color='#EE0000'>Schlaft &#8230; !</font>";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView1098);
        String first8 = "<font color='#EE0000'>Vergesst &#8230; !</font>";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView1099);
        String first9 = "<font color='#EE0000'>R&#228;umt &#8230; aus!</font>";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView1100);
        String first10 = "<font color='#EE0000'>Seid &#8230; !</font>";
        t10.setText(Html.fromHtml(first10));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView1101);
        String first11 = "<font color='#EE0000'>Habt &#8230; !</font>";
        t11.setText(Html.fromHtml(first11));

        TextView t12 = (TextView) myInflatedView.findViewById(R.id.textView1109);
        String first12 = "<font color='#EE0000'>mich</font>";
        t12.setText(Html.fromHtml(first12));

        TextView t13 = (TextView) myInflatedView.findViewById(R.id.textView1110);
        String first13 = "<font color='#EE0000'>dich</font>";
        t13.setText(Html.fromHtml(first13));

        TextView t14 = (TextView) myInflatedView.findViewById(R.id.textView1111);
        String first14 = "<font color='#EE0000'>ihn / es / sie</font>";
        t14.setText(Html.fromHtml(first14));

        TextView t15 = (TextView) myInflatedView.findViewById(R.id.textView1112);
        String first15 = "<font color='#EE0000'>uns</font>";
        t15.setText(Html.fromHtml(first15));

        TextView t16 = (TextView) myInflatedView.findViewById(R.id.textView1113);
        String first16 = "<font color='#EE0000'>euch</font>";
        t16.setText(Html.fromHtml(first16));

        TextView t17 = (TextView) myInflatedView.findViewById(R.id.textView1114);
        String first17 = "<font color='#EE0000'>sie / Sie</font>";
        t17.setText(Html.fromHtml(first17));

        TextView t18 = (TextView) myInflatedView.findViewById(R.id.textView1115);
        String first18 = "<font color='#EE0000'>Ich</font> komme um 10 Uhr an. Holst du <font color='#EE0000'>mich</font> bitte ab?";
        t18.setText(Html.fromHtml(first18));

        return myInflatedView;
    }


}
