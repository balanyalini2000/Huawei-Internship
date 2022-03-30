package com.example.datepickerfragment;

import android.os.Bundle;
import android.app.DatePickerDialog;
import androidx.fragment.app.DialogFragment;
import android.app.Dialog;
import java.util.Calendar;

public class MyFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(), (DatePickerDialog.OnDateSetListener) getActivity(), year, month, day);
    }
}
