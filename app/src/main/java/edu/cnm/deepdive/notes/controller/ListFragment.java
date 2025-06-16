package edu.cnm.deepdive.notes.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.AndroidEntryPoint;
import edu.cnm.deepdive.notes.databinding.FragmentListBinding;

@AndroidEntryPoint
public class ListFragment extends Fragment implements MenuProvider {

  private FragmentListBinding binding;
  // TODO: 6/16/2025 Create a field for NoteViewModel.

  @Override
  // TODO: 6/16/2025
  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    FragmentActivity activity = requireActivity();
    ViewModelProvider provider = new ViewModelProvider(activity);
    LifecycleOwner owner = getViewLifecycleOwner();
    // TODO: 6/16/2025 Get and observe LiveData in viewmodels, with observers that update the UI
    activity.addMenuProvider(this, owner, State.RESUMED);
  }

  @Nullable
  @Override
  // TODO: 6/16/2025 Inflate using binding class and return rootView layout
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    binding = FragmentListBinding.inflate(inflater, container, false);
    return binding.getRoot();
  }

  @Override
  public void onDestroyView() {
    binding = null;
    super.onDestroyView();
  }

  @Override
  public void onCreateMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    // TODO: 6/16/2025 Inflate a menu resource, attaching the inflated items to the specified menu.

  }

  @Override
  public boolean onMenuItemSelected(@NonNull MenuItem menuItem) {
    // TODO: 6/16/2025 Check the ID of menuItem, to see if it of interest; perform appropriate operations
    // and return true otherwise return false.
    return false;
  }
}
