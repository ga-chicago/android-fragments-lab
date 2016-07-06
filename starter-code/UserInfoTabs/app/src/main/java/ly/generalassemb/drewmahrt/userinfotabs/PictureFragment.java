package ly.generalassemb.drewmahrt.userinfotabs;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PictureFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link PictureFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PictureFragment extends Fragment {
    ImageView mImage;
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


            View pictureFragment = inflater.inflate(R.layout.fragment_picture, container, false);
            ImageView image = (ImageView) pictureFragment.findViewById(R.id.imageView);
            Picasso.with(getContext()).load(R.drawable.me).resize(1000,1000).centerCrop().into(image);

//            image.setImageResource(R.drawable.me2);

            return pictureFragment;
        }

}
