package Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.meuapp.R;

import java.util.ArrayList;
import java.util.List;

import Model.Pessoa;

public class PessoaAdapter<Pessoa> extends ArrayAdapter<Model.Pessoa> {

    Context aContext;
    private ArrayList<Pessoa> listaPessoas;

    public PessoaAdapter(@NonNull Context context, @NonNull List<Model.Pessoa> objects) {
        super(context, R.layout.item_lista, objects);
        this.aContext = aContext;
        this.listaPessoas = listaPessoas;
    }

    @Override
    public int getCount() {
        if (listaPessoas != null){
            return listaPessoas.size();
        }
        return 0;
    }


    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Model.Pessoa pessoa = listaPessoas.get(i);

        LayoutInflater inflater = LayoutInflater.from(aContext);

        view = inflater.inflate(R.layout.item_lista, viewGroup, false);

        TextView campoNome = view.findViewById(R.id.txtNome);
        campoNome.setText(pessoa.getNome());

        TextView campoTelefone = view.findViewById(R.id.txtTelefone);
        campoTelefone.setText(pessoa.getTelefone());
        return view;
    }
}
