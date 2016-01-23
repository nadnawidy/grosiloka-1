package com.builderteam.grosiloka.ui.login.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.builderteam.grosiloka.R;
import com.builderteam.grosiloka.ui.main.MainActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    @Bind(R.id.button_login_facebook)
    Button buttonFacebook;
    @Bind(R.id.button_login_email)
    Button buttonEmail;
    @Bind(R.id.textview_login)
    TextView textViewLogin;

    @OnClick(R.id.textview_login)
    public void onClickLogin() {
        showLoginDialog();
    }

    @OnClick(R.id.button_login_facebook)
    public void onClickLoginFacebook() {
        showMainActivity();
    }

    @OnClick(R.id.button_login_email)
    public void onClickEmail() {
        showMainActivity();
    }

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.bind(this, v);
        return v;
    }

    public void showLoginDialog() {
        FragmentManager fm = getActivity().getSupportFragmentManager();
        LoginDialogFragment loginDialogFragment = new LoginDialogFragment();
        loginDialogFragment.show(fm, null);
    }

    private void showMainActivity() {
        startActivity(new Intent(getActivity(), MainActivity.class));
        getActivity().finish();
    }
}
