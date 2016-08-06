package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 06.08.2016.
 */
public class A22Kap18Fragment extends Fragment {


    public A22Kap18Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a22_kap18, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView2716);
        String first = "Sie <font color='#EE0000'>freuen</font> sich <font color='#EE0000'>auf</font> einen hei&#223;en Tee.";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView2717);
        String first1 = "auch so:<br/>Lust haben <font color='#EE0000'>auf</font><br/>sich interessieren <font color='#EE0000'>f&#252;r</font><br/>sich &#228;rgern <font color='#EE0000'>&#252;ber</font><br/>sprechen <font color='#EE0000'>&#252;ber</font>";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView2719);
        String first2 = "<font color='#EE0000'>Sind</font> Sie <font color='#EE0000'>zufrieden mit</font> diesem sch&#246;nen Sommertag?";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView2720);
        String first3 = "auch so:<br/>sprechen <font color='#EE0000'>mit</font><br/>tr&#228;umen <font color='#EE0000'>von</font>";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView2728);
        String first4 = "sich freuen <font color='#EE0000'>auf</font>";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView2733);
        String first5 = "sich &#228;rgern <font color='#EE0000'>&#252;ber</font>";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView2738);
        String first6 = "sich interessieren <font color='#EE0000'>f&#252;r</font>";
        t6.setText(Html.fromHtml(first6));

        return myInflatedView;
    }


}