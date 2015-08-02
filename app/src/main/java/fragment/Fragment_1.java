package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.alex.p0151_contextmenu.R;

/**
 * Created by Alex on 02.08.2015.
 */
public class Fragment_1 extends Fragment {
    private ImageView viewBack;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);


viewBack = (ImageView)view.findViewById(R.id.iv_fragment_1);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Вы нажали на кнопку",
                        Toast.LENGTH_SHORT).show();

            }
        });
        return view;
    }
}
