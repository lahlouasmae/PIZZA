package pizza.asmae.ma.pizzarecipes.service;


import java.util.ArrayList;
import java.util.List;

import pizza.asmae.ma.pizzarecipes.classes.Produit;
import pizza.asmae.ma.pizzarecipes.dao.IDao;

public class ProduitSercive implements IDao <Produit>{
    List<Produit> produits;

    public ProduitSercive() {
        this.produits = new ArrayList<>();
    }

    @Override
    public boolean create(Produit p) {
        return produits.add(p);
    }

    @Override
    public boolean update(Produit p) {
        return false;
    }

    @Override
    public boolean delete(Produit p) {
        return produits.remove(p);
    }

    @Override
    public List findAll() {
        return produits;
    }

    @Override
    public Produit findById(int id) {
        for(Produit p : produits)
            if(p.getId() == id)
                return p;
        return null;
    }
}
