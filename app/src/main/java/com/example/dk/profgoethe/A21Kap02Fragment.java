package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-07-10.
 */
public class A21Kap02Fragment extends Fragment {


    public A21Kap02Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a21_kap02, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView1840);
        String first = "auf <font color='#EE0000'>den</font> Tisch";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView1841);
        String first1 = "auf <font color='#EE0000'>das</font> Regal";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView1842);
        String first2 = "vor <font color='#EE0000'>die</font> Wand";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView1843);
        String first3 = "zwischen <font color='#EE0000'>die</font> T&#252;ren";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView1845);
        String first4 = "auf <font color='#EE0000'>einen</font> Tisch";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView1846);
        String first5 = "auf <font color='#EE0000'>ein</font> Regal";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView1847);
        String first6 = "vor <font color='#EE0000'>eine</font> Wand";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView1848);
        String first7 = "zwischen zwei / <font color='#EE0000'>-</font> T&#252;ren";
        t7.setText(Html.fromHtml(first3));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView1850);
        String first8 = "auf <font color='#EE0000'>dem</font> Tisch";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView1851);
        String first9 = "auf <font color='#EE0000'>dem</font> Regal";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView1852);
        String first10 = "vor <font color='#EE0000'>der</font> Wand";
        t10.setText(Html.fromHtml(first10));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView1853);
        String first11 = "zwischen <font color='#EE0000'>den</font> T&#252;ren";
        t11.setText(Html.fromHtml(first11));

        TextView t12 = (TextView) myInflatedView.findViewById(R.id.textView1855);
        String first12 = "auf <font color='#EE0000'>einem</font> Tisch";
        t12.setText(Html.fromHtml(first12));

        TextView t13 = (TextView) myInflatedView.findViewById(R.id.textView1856);
        String first13 = "auf <font color='#EE0000'>einem</font> Regal";
        t13.setText(Html.fromHtml(first13));

        TextView t14 = (TextView) myInflatedView.findViewById(R.id.textView1857);
        String first14 = "vor <font color='#EE0000'>einer</font> Wand";
        t14.setText(Html.fromHtml(first14));

        TextView t15 = (TextView) myInflatedView.findViewById(R.id.textView1858);
        String first15 = "zwischen zwei / <font color='#EE0000'>-</font> T&#252;ren";
        t15.setText(Html.fromHtml(first15));

        TextView t16 = (TextView) myInflatedView.findViewById(R.id.textView1860);
        String first16 = "in dem = <font color='#EE0000'>im</font>";
        t16.setText(Html.fromHtml(first16));

        TextView t17 = (TextView) myInflatedView.findViewById(R.id.textView1861);
        String first17 = "an dem = <font color='#EE0000'>am</font>";
        t17.setText(Html.fromHtml(first17));

        return myInflatedView;
    }


}
