package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 21.08.2016.
 */
public class B11Kap09Fragment extends Fragment {


    public B11Kap09Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_b11_kap09, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView3612);
        String first = "der klein<font color='#EE0000'>er</font>e / klein<font color='#EE0000'>st</font>e<br/>ein klein<font color='#EE0000'>er</font>er";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView3613);
        String first1 = "das klein<font color='#EE0000'>er</font>e / klein<font color='#EE0000'>st</font>e<br/>ein klein<font color='#EE0000'>er</font>es";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView3614);
        String first2 = "die klein<font color='#EE0000'>er</font>e / klein<font color='#EE0000'>st</font>e<br/>eine klein<font color='#EE0000'>er</font>e";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView3615);
        String first3 = "die klein<font color='#EE0000'>er</font>en / klein<font color='#EE0000'>st</font>en<br/>- klein<font color='#EE0000'>er</font>e  / klein<font color='#EE0000'>st</font>e";
        t3.setText(Html.fromHtml(first3));


        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView3617);
        String first4 = "den klein<font color='#EE0000'>er</font>en / klein<font color='#EE0000'>st</font>en<br/>einen klein<font color='#EE0000'>er</font>en";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView3618);
        String first5 = "das klein<font color='#EE0000'>er</font>e / klein<font color='#EE0000'>st</font>e<br/>ein klein<font color='#EE0000'>er</font>es";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView3619);
        String first6 = "die klein<font color='#EE0000'>er</font>e / klein<font color='#EE0000'>st</font>e<br/>eine klein<font color='#EE0000'>er</font>e";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView3620);
        String first7 = "die klein<font color='#EE0000'>er</font>en / klein<font color='#EE0000'>st</font>en<br/>- klein<font color='#EE0000'>er</font>e  / klein<font color='#EE0000'>st</font>e";
        t7.setText(Html.fromHtml(first7));


        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView3622);
        String first8 = "dem klein<font color='#EE0000'>er</font>en / klein<font color='#EE0000'>st</font>en<br/>einem klein<font color='#EE0000'>er</font>en";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView3623);
        String first9 = "dem klein<font color='#EE0000'>er</font>en / klein<font color='#EE0000'>st</font>en<br/>einem klein<font color='#EE0000'>er</font>en";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView3624);
        String first10 = "der klein<font color='#EE0000'>er</font>en / klein<font color='#EE0000'>st</font>en<br/>einer klein<font color='#EE0000'>er</font>en";
        t10.setText(Html.fromHtml(first10));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView3625);
        String first11 = "den klein<font color='#EE0000'>er</font>en / klein<font color='#EE0000'>st</font>en<br/>- klein<font color='#EE0000'>er</font>en  / klein<font color='#EE0000'>st</font>en";
        t11.setText(Html.fromHtml(first11));

        return myInflatedView;
    }


}