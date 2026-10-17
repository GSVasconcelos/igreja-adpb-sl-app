package com.example.assembleiadedeus.ui.home;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.assembleiadedeus.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Infla o layout XML do fragment
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        TextView tvSaudacao = root.findViewById(R.id.tvSaudacao);

        // Instancia o ViewModel associado a este Fragment
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);

        // "Escuta" o LiveData. Quando o dado mudar, a tela atualiza o texto sozinha!
        homeViewModel.getTextoSaudacao().observe(getViewLifecycleOwner(), texto -> {
            tvSaudacao.setText(texto);
        });

        return root;
    }
}
