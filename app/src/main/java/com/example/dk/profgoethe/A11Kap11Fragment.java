package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-06-18.
 */
public class A11Kap11Fragment extends Fragment {


    public A11Kap11Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a11_kap11, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView593);
        String first = "<font color='#EE0000'>Von</font> 9 Uhr";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView592);
        String first1 = "<font color='#EE0000'>bis</font> 10 Uhr";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView594);
        String first2 = "<font color='#EE0000'>Ab</font> 9 Uhr";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView606);
        String first3 = "er / sie <font color='#EE0000'>hat</font>";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView607);
        String first4 = "er / sie <font color='#EE0000'>hat</font>";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView608);
        String first5 = "er / sie <font color='#EE0000'>hat</font>";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView630);
        String first6 = "er / sie <font color='#EE0000'>hat</font>";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView610);
        String first7 = "<font color='#EE0000'>ge</font>mach<font color='#EE0000'>t</font>";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView611);
        String first8 = "<font color='#EE0000'>ge</font>schr<font color='#EE0000'>ie</font>b<font color='#EE0000'>en</font>";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView612);
        String first9 = "auf<font color='#EE0000'>ge</font>r&#228;um<font color='#EE0000'>t</font>";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView631);
        String first10 = "telefonier<font color='#EE0000'>t</font>";
        t10.setText(Html.fromHtml(first10));

        return myInflatedView;
    }


}
