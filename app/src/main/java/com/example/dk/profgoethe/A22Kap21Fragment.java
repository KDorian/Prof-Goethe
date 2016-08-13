package com.example.dk.profgoethe;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by DK on 10.08.2016.
 */
public class A22Kap21Fragment extends Fragment {


    public A22Kap21Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // -- inflate the layout for this fragment
        View myInflatedView = inflater.inflate(R.layout.fragment_a22_kap21, container, false);

        // Set the Text to try this out
        TextView t = (TextView) myInflatedView.findViewById(R.id.textView2906);
        String first = "Welch<font color='#EE0000'>er</font>?";
        t.setText(Html.fromHtml(first));

        TextView t1 = (TextView) myInflatedView.findViewById(R.id.textView2907);
        String first1 = "Welch<font color='#EE0000'>es</font>?";
        t1.setText(Html.fromHtml(first1));

        TextView t2 = (TextView) myInflatedView.findViewById(R.id.textView2908);
        String first2 = "Welch<font color='#EE0000'>e</font>?";
        t2.setText(Html.fromHtml(first2));

        TextView t3 = (TextView) myInflatedView.findViewById(R.id.textView2909);
        String first3 = "Welch<font color='#EE0000'>e</font>?";
        t3.setText(Html.fromHtml(first3));

        TextView t4 = (TextView) myInflatedView.findViewById(R.id.textView2910);
        String first4 = "Dies<font color='#EE0000'>er</font>. / <font color='#EE0000'>Der</font> da.";
        t4.setText(Html.fromHtml(first4));

        TextView t5 = (TextView) myInflatedView.findViewById(R.id.textView2911);
        String first5 = "Dies<font color='#EE0000'>es</font>. / <font color='#EE0000'>Das</font> hier.";
        t5.setText(Html.fromHtml(first5));

        TextView t6 = (TextView) myInflatedView.findViewById(R.id.textView2912);
        String first6 = "Dies<font color='#EE0000'>e</font>. / <font color='#EE0000'>Die</font> da.";
        t6.setText(Html.fromHtml(first6));

        TextView t7 = (TextView) myInflatedView.findViewById(R.id.textView2913);
        String first7 = "Dies<font color='#EE0000'>e</font>. / <font color='#EE0000'>Die</font> dort.";
        t7.setText(Html.fromHtml(first7));

        TextView t8 = (TextView) myInflatedView.findViewById(R.id.textView2915);
        String first8 = "Welch<font color='#EE0000'>en</font>?";
        t8.setText(Html.fromHtml(first8));

        TextView t9 = (TextView) myInflatedView.findViewById(R.id.textView2916);
        String first9 = "Welch<font color='#EE0000'>es</font>?";
        t9.setText(Html.fromHtml(first9));

        TextView t10 = (TextView) myInflatedView.findViewById(R.id.textView2917);
        String first10 = "Welch<font color='#EE0000'>e</font>?";
        t10.setText(Html.fromHtml(first10));

        TextView t11 = (TextView) myInflatedView.findViewById(R.id.textView2918);
        String first11 = "Welch<font color='#EE0000'>e</font>?";
        t11.setText(Html.fromHtml(first11));

        TextView t12 = (TextView) myInflatedView.findViewById(R.id.textView2919);
        String first12 = "Dies<font color='#EE0000'>en</font>. / <font color='#EE0000'>Den</font> da.";
        t12.setText(Html.fromHtml(first12));

        TextView t13 = (TextView) myInflatedView.findViewById(R.id.textView2920);
        String first13 = "Dies<font color='#EE0000'>es</font>. / <font color='#EE0000'>Das</font> hier.";
        t13.setText(Html.fromHtml(first13));

        TextView t14 = (TextView) myInflatedView.findViewById(R.id.textView2921);
        String first14 = "Dies<font color='#EE0000'>e</font>. / <font color='#EE0000'>Die</font> da.";
        t14.setText(Html.fromHtml(first14));

        TextView t15 = (TextView) myInflatedView.findViewById(R.id.textView2922);
        String first15 = "Dies<font color='#EE0000'>e</font>. / <font color='#EE0000'>Die</font> dort.";
        t15.setText(Html.fromHtml(first15));

        TextView t16 = (TextView) myInflatedView.findViewById(R.id.textView2924);
        String first16 = "Welch<font color='#EE0000'>em</font>?";
        t16.setText(Html.fromHtml(first16));

        TextView t17 = (TextView) myInflatedView.findViewById(R.id.textView2925);
        String first17 = "Welch<font color='#EE0000'>em</font>?";
        t17.setText(Html.fromHtml(first17));

        TextView t18 = (TextView) myInflatedView.findViewById(R.id.textView2926);
        String first18 = "Welch<font color='#EE0000'>er</font>?";
        t18.setText(Html.fromHtml(first18));

        TextView t19 = (TextView) myInflatedView.findViewById(R.id.textView2927);
        String first19 = "Welch<font color='#EE0000'>en</font>?";
        t19.setText(Html.fromHtml(first19));

        TextView t20 = (TextView) myInflatedView.findViewById(R.id.textView2928);
        String first20 = "Dies<font color='#EE0000'>em</font>. / <font color='#EE0000'>Dem</font> da.";
        t20.setText(Html.fromHtml(first20));

        TextView t21 = (TextView) myInflatedView.findViewById(R.id.textView2929);
        String first21 = "Dies<font color='#EE0000'>em</font>. / <font color='#EE0000'>Dem</font> hier.";
        t21.setText(Html.fromHtml(first21));

        TextView t22 = (TextView) myInflatedView.findViewById(R.id.textView2930);
        String first22 = "Dies<font color='#EE0000'>er</font>. / <font color='#EE0000'>Der</font> da.";
        t22.setText(Html.fromHtml(first22));

        TextView t23 = (TextView) myInflatedView.findViewById(R.id.textView2931);
        String first23 = "Dies<font color='#EE0000'>en</font>. / <font color='#EE0000'>Denen</font> dort.";
        t23.setText(Html.fromHtml(first23));

        TextView t24 = (TextView) myInflatedView.findViewById(R.id.textView2941);
        String first24 = "l<font color='#EE0000'>&#228;</font>sst";
        t24.setText(Html.fromHtml(first24));

        TextView t25 = (TextView) myInflatedView.findViewById(R.id.textView2942);
        String first25 = "l<font color='#EE0000'>&#228;</font>sst";
        t25.setText(Html.fromHtml(first25));

        TextView t26 = (TextView) myInflatedView.findViewById(R.id.textView2946);
        String first26 = "Ich <font color='#EE0000'>lasse</font> meinen Briefkasten <font color='#EE0000'>leeren</font>.";
        t26.setText(Html.fromHtml(first26));

        return myInflatedView;
    }


}
