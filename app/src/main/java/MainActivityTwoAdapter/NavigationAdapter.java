package MainActivityTwoAdapter;

import android.content.Context;
import android.content.Intent;
import com.example.real.MainActivity2;
import com.example.real.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.annotation.NonNull;
import android.view.MenuItem;

public class NavigationAdapter implements BottomNavigationView.OnNavigationItemSelectedListener {
    private Context context;

    public NavigationAdapter(Context context) {
        this.context = context;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.hom) {
            context.startActivity(new Intent(context, MainActivity2.class));
            return true;
        } else if (id == R.id.pro) {
            // Assume there's a ProfileActivity to handle this case
            context.startActivity(new Intent(context, ProfileActivity.class));
            return true;
        } else if (id == R.id.search) {
            // Assume there's a SearchActivity to handle this case
            context.startActivity(new Intent(context, SearchActivity.class));
            return true;
        }

        return false;
    }
}
