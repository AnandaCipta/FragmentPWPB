package com.example.fragmentpwpb.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.fragmentpwpb.R;
import com.example.fragmentpwpb.ui.notifications.NotificationsViewModel;

public class ProfileFragment extends Fragment { @Nullable
@Override
public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup
        container, @Nullable Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_profile, null);
}
}

