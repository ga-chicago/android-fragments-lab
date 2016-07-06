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
public class ContactFragment extends Fragment {
    TextView mText1;
    TextView mText2;
    TextView mText3;
    String text1;
    String text2;
    String text3;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View contactFragment =  inflater.inflate(R.layout.fragment_contact, container, false);
            text1 = "Phone: (555) 867-5309";
            text2 = "Email: Jchin@generalassemb.ly";
            text3 = "Twitter: @BeastMode";
            TextView mText1 = (TextView) contactFragment.findViewById(R.id.txtContact1);
            mText1.setText(text1);
            TextView mText2 = (TextView) contactFragment.findViewById(R.id.txtContact2);
            mText2.setText(text2);
            TextView mText3 = (TextView) contactFragment.findViewById(R.id.txtContact3);
            mText3.setText(text3);

            return contactFragment;

        }
}
