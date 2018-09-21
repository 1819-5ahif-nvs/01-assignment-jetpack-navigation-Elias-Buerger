package at.htl.nvs.jetpackdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        NavigationUI.setupActionBarWithNavController(this, (navFragment as NavHostFragment).navController, container)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(container, (navFragment as NavHostFragment).navController)
    }
}
