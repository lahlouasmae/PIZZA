package pizza.asmae.ma.pizzarecipes.adapter;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizza.R;

import java.util.ArrayList;
import java.util.List;

import pizza.asmae.ma.pizzarecipes.classes.Produit;


public class ProduitAdapter extends BaseAdapter{
    private List<Produit> produits;
    private LayoutInflater inflater;


    public ProduitAdapter(Context context, List<Produit> produits) {
        this.produits = produits != null ? produits : new ArrayList<>();
        this.inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int position) {
        return produits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.item,null);

        TextView id=convertView.findViewById(R.id.id);
        TextView duree = convertView.findViewById(R.id.duree);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView nbeIngredients = convertView.findViewById(R.id.nbrIngredients);
        ImageView image = convertView.findViewById(R.id.photo);

        duree.setText(produits.get(position).getId()+"");
        nom.setText(produits.get(position).getNom()+"");
        nbeIngredients.setText(produits.get(position).getNbrIngredients()+"");
        image.setImageResource(produits.get(position).getPhoto());
        id.setText(produits.get(position).getId()+"");
        return convertView;
    }
}
