package customView;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.test_fragment.R;

public class TittleFragment extends Fragment {

	public TittleFragment() {
		// TODO Auto-generated constructor stub

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.view1, container, false);
		return view;
	}
}
