package pedroscott.com.myappportfolio;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    @Nullable
    @OnClick({R.id.bTHomeSpotify, R.id.bTHomeSuperDuo, R.id.bTHomeBuildItBigger, R.id.bTHomeSXYZReader,
            R.id.bTHomeCapstone, R.id.bTHomeMyOwn})
    void onClickButtons(Button button) {
        showMessages(button.getText().toString());
    }

    private void showMessages(String text) {
        Toast.makeText(getActivity(), getString(R.string.message_to_show, text), Toast.LENGTH_LONG).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, v);
        return v;
    }
}
