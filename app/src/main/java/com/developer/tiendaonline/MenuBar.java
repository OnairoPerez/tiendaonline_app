package com.developer.tiendaonline;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

public class MenuBar {
    private Activity activity;

    public MenuBar(Activity activity) {this.activity = activity;}

    public void setupMenuBar() {
        ImageView user = activity.findViewById(R.id.icono_user);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, LoginActivity.class);
                context.startActivity(intent);
            }
        });
    }
}
