package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 2016-06-26.
 */
public class A12Kap19Fragment extends Fragment {


    public A12Kap19Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a12_kap19, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView1013);
        String first = "<font color='#EE0000'>war</font>";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView1014);
        String first1 = "<font color='#EE0000'>warst</font>";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView1015);
        String first2 = "<font color='#EE0000'>war</font>";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView1016);
        String first3 = "<font color='#EE0000'>waren</font>";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView1017);
        String first4 = "<font color='#EE0000'>wart</font>";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView1018);
        String first5 = "<font color='#EE0000'>waren</font>";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView1027);
        String first6 = "<font color='#EE0000'>hatte</font>";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView1028);
        String first7 = "<font color='#EE0000'>hattest</font>";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView1029);
        String first8 = "<font color='#EE0000'>hatte</font>";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView1030);
        String first9 = "<font color='#EE0000'>hatten</font>";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView1031);
        String first10 = "<font color='#EE0000'>hattet</font>";
        t10.setText(Html.fromHtml(first6));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView1032);
        String first11 = "<font color='#EE0000'>hatten</font>";
        t11.setText(Html.fromHtml(first11));

        TextView t12 = (TextView) myInflatedView.findViewById(R.id.textView1043);
        String first12 = "<font color='#EE0000'>haben + be/ge/ver&#8230;en/t</font>";
        t12.setText(Html.fromHtml(first12));

        TextView t13 = (TextView) myInflatedView.findViewById(R.id.textView1044);
        String first13 = "er / sie hat <font color='#EE0000'>erkannt</font>";
        t13.setText(Html.fromHtml(first13));

        TextView t14 = (TextView) myInflatedView.findViewById(R.id.textView1045);
        String first14 = "er / sie hat <font color='#EE0000'>bekommen</font>";
        t14.setText(Html.fromHtml(first14));

        return myInflatedView;
    }


}