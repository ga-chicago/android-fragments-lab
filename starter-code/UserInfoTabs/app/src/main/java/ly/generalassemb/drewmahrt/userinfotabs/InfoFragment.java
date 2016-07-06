package ly.generalassemb.drewmahrt.userinfotabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment {
    TextView mText1;
    TextView mText2;
    TextView mText3;
    String text1;
    String text2;
    String text3;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View infoFragment =  inflater.inflate(R.layout.fragment_info, container, false);
            text1 = "Current City: Chicago";
            text2 = "Job: Android Development Student";
            text3 = "School: General Assembly";
            TextView mText1 = (TextView) infoFragment.findViewById(R.id.textView1);
            mText1.setText(text1);
            TextView mText2 = (TextView) infoFragment.findViewById(R.id.textView2);
            mText2.setText(text2);
            TextView mText3 = (TextView) infoFragment.findViewById(R.id.textView3);
            mText3.setText(text3);

            return infoFragment;


        }

}
