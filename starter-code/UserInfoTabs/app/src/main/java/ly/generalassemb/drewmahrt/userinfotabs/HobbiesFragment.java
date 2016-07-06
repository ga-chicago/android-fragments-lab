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
public class HobbiesFragment extends Fragment {
    TextView mText1;
    TextView mText2;
    TextView mText3;
    String text1;
    String text2;
    String text3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View hobbiesFragment =  inflater.inflate(R.layout.fragment_hobbies, container, false);
        text1 = "Hobby1: Eat";
        text2 = "Hobby2: Drink";
        text3 = "Hobby3: Crap";
        TextView mText1 = (TextView) hobbiesFragment.findViewById(R.id.txthobby1);
        mText1.setText(text1);
        TextView mText2 = (TextView) hobbiesFragment.findViewById(R.id.txthobby2);
        mText2.setText(text2);
        TextView mText3 = (TextView) hobbiesFragment.findViewById(R.id.txthobby3);
        mText3.setText(text3);

        return hobbiesFragment;
    }

}
