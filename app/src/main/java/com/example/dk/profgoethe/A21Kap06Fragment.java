package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-07-14.
 */
public class A21Kap06Fragment extends Fragment {


    public A21Kap06Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a21_kap06, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView2035);
        String first = "<font color='#EE0000'>von</font> morgen <font color='#EE0000'>an</font>";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView2036);
        String first1 = "<font color='#EE0000'>vom</font> 1. Januar <font color='#EE0000'>an</font>";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView2038);
        String first2 = "<font color='#EE0000'>vom</font> 8. <font color='#EE0000'>bis zum</font> 10. Juli";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView2039);
        String first3 = "<font color='#EE0000'>seit</font> 1985";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView2041);
        String first4 = "<font color='#EE0000'>seit</font> ein<font color='#EE0000'>em</font> Monat";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView2042);
        String first5 = "<font color='#EE0000'>seit</font> ein<font color='#EE0000'>em</font> Jahr";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView2043);
        String first6 = "<font color='#EE0000'>seit</font> ein<font color='#EE0000'>er</font> Stunde";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView2044);
        String first7 = "<font color='#EE0000'>seit</font> zwei Jahr<font color='#EE0000'>en</font>";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView2049);
        String first8 = "<font color='#EE0000'>&#252;ber</font> ein<font color='#EE0000'>en</font> Monat";
        t8.setText(Html.fromHtml(first8));

        return myInflatedView;
    }


}
