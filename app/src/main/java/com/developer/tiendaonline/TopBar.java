package com.developer.tiendaonline;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

public class TopBar {
    private Activity activity;

    public TopBar (Activity activity) {
        this.activity = activity;
    }

    public void setupTopBar() {
        ImageView logo = activity.findViewById(R.id.logo);
        ImageView lupa = activity.findViewById(R.id.button_lupa);
        ImageView shoppingCart = activity.findViewById(R.id.icono_carrito);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, MainActivity.class);
                context.startActivity(intent);
            }
        });
        lupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, BuscadorActivity.class);
                context.startActivity(intent);
            }
        });
        shoppingCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, CarritoActivity.class);
                context.startActivity(intent);
            }
        });
    }
}
