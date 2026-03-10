package com.seeker.ps2;

import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class AchievementsDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new MaterialAlertDialogBuilder(requireContext())
                .setTitle("X")
                .setMessage("please wait for next update,\nsomething big is coming...")
                .setPositiveButton("Close", null)
                .create();
    }

    public static AchievementsDialogFragment newInstance() {
        return new AchievementsDialogFragment();
    }
}
