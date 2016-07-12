package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-07-12.
 */
public class A21Kap04Fragment extends Fragment {


    public A21Kap04Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a21_kap04, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView1917);
        String first = "ein mager<font color='#EE0000'>er</font> Schinken";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView1918);
        String first1 = "ein hell<font color='#EE0000'>es</font> Brot";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView1919);
        String first2 = "eine gr&#252;n<font color='#EE0000'>e</font> Paprika";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView1920);
        String first3 = "- hell<font color='#EE0000'>e</font> Br&#246;tchen";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView1922);
        String first4 = "ein mager<font color='#EE0000'>en</font> Schinken";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView1923);
        String first5 = "ein hell<font color='#EE0000'>es</font> Brot";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView1924);
        String first6 = "eine gr&#252;n<font color='#EE0000'>e</font> Paprika";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView1925);
        String first7 = "- hell<font color='#EE0000'>e</font> Br&#246;tchen";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView1927);
        String first8 = "ein mager<font color='#EE0000'>en</font> Schinken";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView1928);
        String first9 = "ein hell<font color='#EE0000'>en</font> Brot";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView1929);
        String first10 = "eine gr&#252;n<font color='#EE0000'>en</font> Paprika";
        t10.setText(Html.fromHtml(first10));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView1930);
        String first11 = "- hell<font color='#EE0000'>en</font> Br&#246;tchen";
        t11.setText(Html.fromHtml(first11));

        TextView t12 = (TextView) myInflatedView.findViewById(R.id.textView1932);
        String first12 = "aber: Plural: keine / meine hell<font color='#EE0000'>en</font> Br&#246;tchen";
        t12.setText(Html.fromHtml(first12));

        return myInflatedView;
    }


}